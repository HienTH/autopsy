package org.sleuthkit.autopsy.modules.kiemtravanban;

import java.util.HashMap;
import java.util.logging.Level;
import org.openide.util.Exceptions;
import org.sleuthkit.autopsy.casemodule.Case;
import org.sleuthkit.autopsy.casemodule.services.Blackboard;
import org.sleuthkit.autopsy.ingest.FileIngestModule;
import org.sleuthkit.autopsy.ingest.IngestJobContext;
import org.sleuthkit.autopsy.ingest.IngestModule;
import org.sleuthkit.datamodel.AbstractFile;
import org.sleuthkit.autopsy.coreutils.Logger;
import org.sleuthkit.autopsy.ingest.IngestMessage;
import org.sleuthkit.autopsy.ingest.IngestModuleReferenceCounter;
import org.sleuthkit.autopsy.ingest.IngestServices;
import org.sleuthkit.autopsy.ingest.ModuleDataEvent;
import org.sleuthkit.datamodel.BlackboardArtifact;
import org.sleuthkit.datamodel.BlackboardAttribute;
import org.sleuthkit.datamodel.TskCoreException;
import org.sleuthkit.datamodel.TskData;

/**
 *
 * @author root
 */
public class KiemTraVanBanModule implements FileIngestModule{

    private static final HashMap<Long, Long> artifactCountsForIngestJobs = new HashMap<>();
    private static final Logger logger = Logger.getLogger(KiemTraVanBanModule.class.getName());
    private IngestJobContext context;
    private static final IngestModuleReferenceCounter refCounter = new IngestModuleReferenceCounter();
    
    @Override
    public IngestModule.ProcessResult process(AbstractFile file) {
        // Skip anything other than actual file system files.
        if ((file.getType() == TskData.TSK_DB_FILES_TYPE_ENUM.UNALLOC_BLOCKS)
            || (file.getType() == TskData.TSK_DB_FILES_TYPE_ENUM.UNUSED_BLOCKS)
            || (file.getType() == TskData.TSK_DB_FILES_TYPE_ENUM.SLACK)
            || (file.isFile() == false)) {
            return IngestModule.ProcessResult.OK;
        }
        // Skip NSRL / known files.
        if (file.getKnown() == TskData.FileKnown.KNOWN) {
            return IngestModule.ProcessResult.OK;
        }

        if (!file.canRead() 
                || isImageFile(file)
                || file.getMIMEType().startsWith("audio/")
                || file.getMIMEType().equals("application/octet-stream") 
                || file.getMIMEType().startsWith("image/")
                || file.getNameExtension().equals("asc")
                || file.getNameExtension().equals("rules")
                || file.getNameExtension().equals("config")
                || file.getNameExtension().equals("output")
                || file.getNameExtension().equals("log")
                || file.getNameExtension().equals("dat")
                || file.getNameExtension().equals("conf")
                || file.getName().endsWith("Zone.Identifier")
                || file.getName().endsWith("xdg.origin.url")
                || file.getName().endsWith("xdg.referrer.url")
                || file.getMIMEType().equals("application/zip")
                || file.getMIMEType().equals("application/vnd.ms-excel")
                || file.getMIMEType().equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
                || file.getMIMEType().equals("application/x-rar-compressed")) {
            return IngestModule.ProcessResult.OK;
        }
        
        Blackboard blackboard = Case.getCurrentCase().getServices().getBlackboard();
        
        try {
            if ((file.getMIMEType().startsWith("application/vnd.openxmlformats") 
                        || file.getMIMEType().equals("application/msword") 
                        || file.getMIMEType().startsWith("text/plain") 
                        || file.getMIMEType().equals("application/pdf")))
            {
                if (DetectDocument.Detect(file)) {
                    System.out.println(file.getMIMEType());
                    String MODULE_NAME = KiemTraVanBanModuleFactory.getModuleName();
                    BlackboardArtifact art = null;
                    try {
                        art = file.newArtifact(BlackboardArtifact.ARTIFACT_TYPE.TSK_INTERESTING_FILE_HIT);
                    } catch (TskCoreException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                    BlackboardAttribute att = new BlackboardAttribute(BlackboardAttribute.ATTRIBUTE_TYPE.TSK_SET_NAME, MODULE_NAME, "Văn Bản Chứa Thông Tin Chống Phá");
                    try {
                        art.addAttribute(att);
                    } catch (TskCoreException ex) {
                        Exceptions.printStackTrace(ex);
                    }

                    try {
                        // index the artifact for keyword search
                        blackboard.indexArtifact(art);
                    } catch (Blackboard.BlackboardException ex) {
                        logger.log(Level.SEVERE, "Không thể đánh chỉ mục" + art.getArtifactID(), ex);
                    }

                    addToBlackboardPostCount(context.getJobId(), 1L);

                    // fire event to notify UI of this new artifact
                    ModuleDataEvent event = new ModuleDataEvent(KiemTraVanBanModuleFactory.getModuleName(), BlackboardArtifact.ARTIFACT_TYPE.TSK_GEN_INFO);
                    IngestServices.getInstance().fireModuleDataEvent(event);
                }
            }
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
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
            String msgText = String.format("Thêm %d file", filesCount);
            IngestMessage message = IngestMessage.createMessage(
                    IngestMessage.MessageType.INFO,
                    KiemTraVanBanModuleFactory.getModuleName(),
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