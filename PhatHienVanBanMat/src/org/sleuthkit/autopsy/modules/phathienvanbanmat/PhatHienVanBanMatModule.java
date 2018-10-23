package org.sleuthkit.autopsy.modules.phathienvanbanmat;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.stream.Collectors;
import javax.imageio.ImageIO;
//import net.sourceforge.tess4j.TesseractException;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;
import org.sleuthkit.autopsy.casemodule.Case;
import org.sleuthkit.autopsy.casemodule.services.Blackboard;
import org.sleuthkit.autopsy.casemodule.services.TagsManager;
import org.sleuthkit.autopsy.ingest.FileIngestModule;
import org.sleuthkit.autopsy.ingest.IngestJobContext;
import org.sleuthkit.autopsy.ingest.IngestModule;
import org.sleuthkit.datamodel.AbstractFile;
import org.sleuthkit.datamodel.HashUtility;
import org.sleuthkit.autopsy.coreutils.Logger;
import org.sleuthkit.autopsy.ingest.IngestMessage;
import org.sleuthkit.autopsy.ingest.IngestModuleReferenceCounter;
import org.sleuthkit.autopsy.ingest.IngestServices;
import org.sleuthkit.autopsy.ingest.ModuleDataEvent;
import org.sleuthkit.datamodel.BlackboardArtifact;
import org.sleuthkit.datamodel.BlackboardAttribute;
import org.sleuthkit.datamodel.TagName;
import org.sleuthkit.datamodel.TskCoreException;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.sleuthkit.datamodel.ReadContentInputStream;

class PhatHienVanBanMatModule implements FileIngestModule {

    private static final HashMap<Long, Long> artifactCountsForIngestJobs = new HashMap<>();
    private static final Logger logger = Logger.getLogger(PhatHienVanBanMatModule.class.getName());
    private IngestJobContext context;
    private static final IngestModuleReferenceCounter refCounter = new IngestModuleReferenceCounter();
    
    PhatHienVanBanMatModule() throws Exception{
        String path = "/usr/local/share/OpenCV/java/";
        loadOpenCVLib(path);
    }
    
    public static void loadOpenCVLib(String path) throws Exception {
        File lib_dir = new File(path);
        System.setProperty("java.library.path", lib_dir.getAbsolutePath());
        Field sys_paths = ClassLoader.class.getDeclaredField("sys_paths");
        sys_paths.setAccessible(true);
        sys_paths.set(null, null);
        System.loadLibrary(org.opencv.core.Core.NATIVE_LIBRARY_NAME);
    }
 
    @Override
    public IngestModule.ProcessResult process(AbstractFile file) {
        Blackboard blackboard = Case.getCurrentCase().getServices().getBlackboard();
//        Boolean extJpeg = isJpegFileHeader(file);
//        Boolean extPng = isPngFileHeader(file);
//        AbstractFile fileFrom = file;
//        int size =  (int) file.getSize();
        //if (extJpeg || extPng || "png".equals(file.getNameExtension()) || "PNG".equals(file.getNameExtension())){
        if (file.isFile() && isImageFile(file)){
            System.out.println(file.getName());
            try {
                if (DetectRetangle.Detect(file)){
                    String MODULE_NAME = PhatHienVanBanMatModuleFactory.getModuleName();
                    BlackboardArtifact art = null;
                    try {
                        art = file.newArtifact(BlackboardArtifact.ARTIFACT_TYPE.TSK_INTERESTING_FILE_HIT);
                    } catch (TskCoreException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                    BlackboardAttribute att = new BlackboardAttribute(BlackboardAttribute.ATTRIBUTE_TYPE.TSK_SET_NAME, MODULE_NAME, "Van Ban Mat");
                    try {
                        art.addAttribute(att);
                    } catch (TskCoreException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                    
                    try {
                        // index the artifact for keyword search
                        blackboard.indexArtifact(art);
                    } catch (Blackboard.BlackboardException ex) {
                        logger.log(Level.SEVERE, "Unable to index blackboard artifact " + art.getArtifactID(), ex);
                    }
                    
                    addToBlackboardPostCount(context.getJobId(), 1L);
                    
                    // fire event to notify UI of this new artifact
                    ModuleDataEvent event = new ModuleDataEvent(PhatHienVanBanMatModuleFactory.getModuleName(), BlackboardArtifact.ARTIFACT_TYPE.TSK_GEN_INFO);
                    IngestServices.getInstance().fireModuleDataEvent(event);
                }
            } catch (Exception ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        return IngestModule.ProcessResult.OK;
    }

    @Override
    public void shutDown() {
        reportBlackboardPostCount(context.getJobId());
    }

    @Override
    public void startUp(IngestJobContext context) throws IngestModuleException {
        this.context = context;
        refCounter.incrementAndGet(context.getJobId());
    }
    
    synchronized static void addToBlackboardPostCount(long ingestJobId, long countToAdd) {
        Long fileCount = artifactCountsForIngestJobs.get(ingestJobId);

        // Ensures that this job has an entry
        if (fileCount == null) {
            fileCount = 0L;
            artifactCountsForIngestJobs.put(ingestJobId, fileCount);
        }

        fileCount += countToAdd;
        artifactCountsForIngestJobs.put(ingestJobId, fileCount);
    }
    
    synchronized static void reportBlackboardPostCount(long ingestJobId) {
        Long refCount = refCounter.decrementAndGet(ingestJobId);
        if (refCount == 0) {
            Long filesCount = artifactCountsForIngestJobs.remove(ingestJobId);
            String msgText = String.format("Them %d lan vao blackboard", filesCount);
            IngestMessage message = IngestMessage.createMessage(
                    IngestMessage.MessageType.INFO,
                    PhatHienVanBanMatModuleFactory.getModuleName(),
                    msgText);
            IngestServices.getInstance().postMessage(message);
        }
    }
    
    private boolean isImageFile(AbstractFile f) {
        return hasImageFileHeader(f);
    }
    
    @SuppressWarnings("unchecked")
    private static boolean hasImageFileHeader(AbstractFile file) {

        // if less than 100 bytes, do not parse
        if (file.getSize() < 100) {
            return false;
        }

        // read bytes if unable do not parse
        byte[] fileHeaderBuffer = new byte[6];
        int bytesRead;
        try {
            bytesRead = file.read(fileHeaderBuffer, 0, 6);
        } catch (TskCoreException ex) {
            //ignore if can't read the first few bytes, not a JPEG
            return false;
        }
        if (bytesRead != 6) {
            return false;
        }
        
        if ( // if JPG [FF D8 FF]   
                (((int) (fileHeaderBuffer[0] & 0xFF) == 0xFF) && ((int) (fileHeaderBuffer[1] & 0xFF) == 0xD8) && ((int) (fileHeaderBuffer[2] & 0xFF) == 0xFF))
                || //or if BMP [42 4D]
                (((int) (fileHeaderBuffer[0] & 0xFF) == 0x42) && ((int) (fileHeaderBuffer[1] & 0xFF) == 0x4d))
                || // or if TIFF [49 20 49]
                (((int) (fileHeaderBuffer[0] & 0xFF) == 0x49) && ((int) (fileHeaderBuffer[1] & 0xFF) == 0x20)
                && ((int) (fileHeaderBuffer[2] & 0xFF) == 0x49))
                || // or if PNG [89 50 4E 47]; not testing for the 4 dots
                (((int) (fileHeaderBuffer[0] & 0xFF) == 0x89) && ((int) (fileHeaderBuffer[1] & 0xFF) == 0x50)
                && ((int) (fileHeaderBuffer[2] & 0xFF) == 0x4E) && ((int) (fileHeaderBuffer[3] & 0xFF) == 0x47))
                || // or if GIF [47 49 46 38]; not testing for subtypes 7a/9a
                (((int) (fileHeaderBuffer[0] & 0xFF) == 0x47) && ((int) (fileHeaderBuffer[1] & 0xFF) == 0x49)
                && ((int) (fileHeaderBuffer[2] & 0xFF) == 0x46) && ((int) (fileHeaderBuffer[3] & 0xFF) == 0x38))
                || // or if TIFF [49 49 2A 00]
                (((int) (fileHeaderBuffer[0] & 0xFF) == 0x49) && ((int) (fileHeaderBuffer[1] & 0xFF) == 0x49)
                && ((int) (fileHeaderBuffer[2] & 0xFF) == 0x2A) && ((int) (fileHeaderBuffer[3] & 0xFF) == 0x00))
                || // or if TIFF [4D 4D 00 2A]
                (((int) (fileHeaderBuffer[0] & 0xFF) == 0x4D) && ((int) (fileHeaderBuffer[1] & 0xFF) == 0x4D)
                && ((int) (fileHeaderBuffer[2] & 0xFF) == 0x00) && ((int) (fileHeaderBuffer[3] & 0xFF) == 0x2A))
                || // or if TIFF [4D 4D 00 2B]
                (((int) (fileHeaderBuffer[0] & 0xFF) == 0x4D) && ((int) (fileHeaderBuffer[1] & 0xFF) == 0x4D)
                && ((int) (fileHeaderBuffer[2] & 0xFF) == 0x00) && ((int) (fileHeaderBuffer[3] & 0xFF) == 0x2B))
                || // or if JPEG 2000 [00 00 00 00 6A 50]
                (((int) (fileHeaderBuffer[0] & 0xFF) == 0x00) && ((int) (fileHeaderBuffer[1] & 0xFF) == 0x00)
                && ((int) (fileHeaderBuffer[2] & 0xFF) == 0x00) && ((int) (fileHeaderBuffer[3] & 0xFF) == 0x00)
                && ((int) (fileHeaderBuffer[4] & 0xFF) == 0x6A) && ((int) (fileHeaderBuffer[5] & 0xFF) == 0x50))) {
            return true;
        } // end if is Image header
        return false;
    }
    
}


/*

    private static byte[] readHeader(AbstractFile file, int buffLength) throws TskCoreException {
        byte[] fileHeaderBuffer = new byte[buffLength];
        int bytesRead = file.read(fileHeaderBuffer, 0, buffLength);

        if (bytesRead != buffLength) {
            //ignore if can't read the first few bytes, not an image
            throw new TskCoreException("Could not read " + buffLength + " bytes from " + file.getName());//NON-NLS
        }
        return fileHeaderBuffer;
    }
    
    public static boolean isPngFileHeader(AbstractFile file) {
        if (file.getSize() < 10) {
            return false;
        }

        try {
            byte[] fileHeaderBuffer = readHeader(file, 8);
            return (((fileHeaderBuffer[1] & 0xff) == 0x50) && ((fileHeaderBuffer[2] & 0xff) == 0x4E)
                    && ((fileHeaderBuffer[3] & 0xff) == 0x47) && ((fileHeaderBuffer[4] & 0xff) == 0x0D)
                    && ((fileHeaderBuffer[5] & 0xff) == 0x0A) && ((fileHeaderBuffer[6] & 0xff) == 0x1A)
                    && ((fileHeaderBuffer[7] & 0xff) == 0x0A));

        } catch (TskCoreException ex) {
            //ignore if can't read the first few bytes, not an png
            return false;
        }
    }
    
    public static boolean isJpegFileHeader(AbstractFile file) {
        if (file.getSize() < 100) {
            return false;
        }

        try {
            byte[] fileHeaderBuffer = readHeader(file, 2);
            
            return (((fileHeaderBuffer[0] & 0xff) == 0xff) && ((fileHeaderBuffer[1] & 0xff) == 0xd8));
        } catch (TskCoreException ex) {
            //ignore if can't read the first few bytes, not a JPEG
            return false;
        }
    }
*/