package org.sleuthkit.autopsy.modules.phathienvanbanmat;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import javax.imageio.ImageIO;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import static org.opencv.core.CvType.CV_8UC1;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfPoint;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.RotatedRect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.openide.util.Exceptions;
import org.sleuthkit.autopsy.casemodule.Case;
import org.sleuthkit.autopsy.coreutils.Logger;
import org.sleuthkit.datamodel.AbstractFile;
import org.sleuthkit.datamodel.ReadContentInputStream;
import org.sleuthkit.autopsy.coreutils.Logger;
import org.sleuthkit.autopsy.datamodel.ContentUtils;
import org.sleuthkit.autopsy.ingest.FileIngestModule;
import org.sleuthkit.autopsy.ingest.IngestJobContext;

public class DetectRetangle implements FileIngestModule {

    public int HEIGHT;
    public int WIDTH;
    private static final Logger logger = Logger.getLogger(PhatHienVanBanMatModule.class.getName());
    //static { System.load("/home/lete/AutoPsy/PhatHienVanBanMat/release/modules/ext/libopencv_java330.so"); }
    //static { System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }
    
    public static void loadOpenCVLib(String path) throws Exception {
        File lib_dir = new File(path);
        System.setProperty("java.library.path", lib_dir.getAbsolutePath());
        Field sys_paths = ClassLoader.class.getDeclaredField("sys_paths");
        sys_paths.setAccessible(true);
        sys_paths.set(null, null);
        System.loadLibrary(org.opencv.core.Core.NATIVE_LIBRARY_NAME);
    }
    
    static {
        String path = "/usr/local/share/OpenCV/java/";
        try {
            loadOpenCVLib(path);
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
    }
    
    public static void setFilter(Mat image) {
        //Apply gaussian blur to remove noise
        Imgproc.GaussianBlur(image, image, new Size(5, 5), 0);

        //Threshold
        Imgproc.adaptiveThreshold(image, image, 255, Imgproc.ADAPTIVE_THRESH_GAUSSIAN_C, Imgproc.THRESH_BINARY, 7, 1);
        
        //Invert the image
        Core.bitwise_not(image, image);

        //Dilate
        Mat kernel = Imgproc.getStructuringElement(Imgproc.MORPH_DILATE, new Size(3, 3), new Point(1, 1));
        
        Imgproc.dilate(image, image, kernel);
    }
    
    public static String Detect(AbstractFile file) throws IOException, Exception {
        // get image
        String fileName = getTempPath() + File.separator + file.getName()
                + "-" + String.valueOf(file.getId());
        File fileFrom = new File(fileName);
        
        try {
            ContentUtils.writeToFile(file, fileFrom);
        } catch (IOException ex) {
            logger.log(Level.WARNING, "Failed writing image to disk.", ex); //NON-NLS
        }
        
        // convert to mat and cut
        Mat checkImage = Imgcodecs.imread(fileName, Imgcodecs.CV_LOAD_IMAGE_COLOR);
        Mat originalImage = Imgcodecs.imread(fileName, Imgcodecs.CV_LOAD_IMAGE_COLOR);
        Mat image = new Mat();
        List<MatOfPoint> contours = new ArrayList<>();
        Mat hierarchy = new Mat();
        List<Rect> rects = new ArrayList<Rect>();
        Mat draw = new Mat();
        Imgproc.cvtColor(originalImage, image, Imgproc.COLOR_BGR2GRAY);
        setFilter(image);
        
        //Find Contours
        Imgproc.findContours(image, contours, hierarchy, Imgproc.RETR_TREE, Imgproc.CHAIN_APPROX_SIMPLE, new Point(0, 0));
        int k = 0;
        //For conversion later on
        MatOfPoint2f approxCurve = new MatOfPoint2f();
        
        for (int i = 0; i < contours.size(); i++) {
            //Convert contours from MatOfPoint to MatOfPoint2f
            MatOfPoint2f contour2f = new MatOfPoint2f(contours.get(i).toArray());
            //Processing on mMOP2f1 which is in type MatOfPoint2f
            double approxDistance = Imgproc.arcLength(contour2f, true) * 0.02;

            if (approxDistance > 1) {
                //Find Polygons
                Imgproc.approxPolyDP(contour2f, approxCurve, approxDistance, true);
                //Convert back to MatOfPoint
                MatOfPoint points = new MatOfPoint(approxCurve.toArray());
                
                //Rectangle Checks - Points, area, convexity
                if (points.total() == 4 && Math.abs(Imgproc.contourArea(points)) > 1000 && Imgproc.isContourConvex(points)) {
                    double cos = 0;
                    double mcos = 0;
                    for (int sc = 2; sc < 5; sc++) {
                        // TO-DO Figure a way to check angle
                        if (cos > mcos) {
                            mcos = cos;
                        }
                    }
                    
                    if (mcos < 0.3) {
                        // Get bounding rect of contour
                        Rect rect = Imgproc.boundingRect(points);
                        
                        if (Math.abs(rect.height - rect.width) < 1000 && rect.height < rect.width) {
                        //System.out.println(i + "| x: " + rect.x + " + width("+rect.width+"), y: " + rect.y + "+ width("+rect.height+")");
                        rects.add(rect);
                        //Imgproc.rectangle(originalImage, rect.tl(), rect.br(), new Scalar(20, 20, 20), -1, 4, 0);
                        Imgproc.drawContours(originalImage, contours, i, new Scalar(0, 255, 0, .8), 1);
                        
                        Mat outputmat = new Mat(rect.width, rect.height, CV_8UC1);
                        Mat roi = null;
                        //roi = originalImage.submat(rect.y+3, rect.y + rect.height-3, rect.x+3, rect.x + rect.width-3);
                        //roi = checkImage.submat(rect.y, rect.y + rect.height, rect.x, rect.x + rect.width);
                        roi = originalImage.submat(rect.y+4, rect.y + rect.height-4, rect.x+4, rect.x + rect.width-4);
                        //roi.copyTo(outputmat);
                        
                        // save cut image to output folder
                        String fileOutput = "/home/lete/output/" + file.getName();
                        //System.out.println(fileOutput);
                        Imgcodecs.imwrite(fileOutput, roi);
                        
                        //return result
                        return fileOutput;
                        }
                    }
                }
                
            }
            
        }
        return null;
    }
    
    public static String getTempPath() {
        String tmpDir = Case.getCurrentCase().getTempDirectory() + File.separator
                + "PhatHienVanBanMatParser"; //NON-NLS
        File dir = new File(tmpDir);
        if (dir.exists() == false) {
            dir.mkdirs();
        }
        return tmpDir;
    }

    @Override
    public ProcessResult process(AbstractFile file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void shutDown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void startUp(IngestJobContext context) throws IngestModuleException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
/*

        String fileOutput = "/home/lete/image-1-6-1.jpg";
        System.out.println(fileOutput);
                        
        File fileResult = new File(fileOutput);                    
        String result = insta.doOCR(fileResult);
        System.out.println(result);

        //InputStream inputStream;
        //BufferedImage fileFrom;
        
        //inputStream = new ReadContentInputStream(file);
        //fileFrom = ImageIO.read(inputStream);
        
        //byte[] bufferedImagePixels = ((DataBufferByte) fileFrom.getRaster().getDataBuffer()).getData();
        //Mat originalImage = new Mat(fileFrom.getHeight(), fileFrom.getWidth(), CvType.CV_8UC3);
        //originalImage.put(0, 0, bufferedImagePixels);
*/