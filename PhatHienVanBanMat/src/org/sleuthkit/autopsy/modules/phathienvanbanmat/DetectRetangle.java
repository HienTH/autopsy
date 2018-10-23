package org.sleuthkit.autopsy.modules.phathienvanbanmat;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import javax.imageio.ImageIO;
//import net.sourceforge.tess4j.Tesseract;
//import net.sourceforge.tess4j.TesseractException;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import static org.opencv.core.CvType.CV_8UC1;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.RotatedRect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.opencv.imgcodecs.Imgcodecs;
import org.sleuthkit.autopsy.coreutils.Logger;
import org.sleuthkit.datamodel.AbstractFile;
import org.sleuthkit.datamodel.ReadContentInputStream;

public class DetectRetangle {

    static { System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }
    
    public int HEIGHT;
    public int WIDTH;
    private static final Logger logger = Logger.getLogger(PhatHienVanBanMatModule.class.getName());
    
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
    
    public static Boolean Detect(AbstractFile file) throws IOException, Exception {

        InputStream inputStream;
        BufferedImage fileFrom;
        
        inputStream = new ReadContentInputStream(file);
        fileFrom = ImageIO.read(inputStream);
            
        byte[] bufferedImagePixels = ((DataBufferByte) fileFrom.getRaster().getDataBuffer()).getData();
        Mat originalImage = new Mat(fileFrom.getHeight(), fileFrom.getWidth(), CvType.CV_8UC3);
        originalImage.put(0, 0, bufferedImagePixels);
        
        System.out.println("Chuan Bi Oke Roi");
        
        //Mat originalImage2 = originalImage.clone();
        //Mat originalImage3 = originalImage.clone();
        
        //Tesseract insta = new Tesseract();
        //insta.setDatapath("/home/levante/Tess4J");
        //insta.setLanguage("vie");
        
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
                        System.out.println(i + "| x: " + rect.x + " + width("+rect.width+"), y: " + rect.y + "+ width("+rect.height+")");
                        rects.add(rect);
                        //Imgproc.rectangle(originalImage, rect.tl(), rect.br(), new Scalar(20, 20, 20), -1, 4, 0);
                        Imgproc.drawContours(originalImage, contours, i, new Scalar(0, 255, 0, .8), 1);
                        
                        Mat outputmat = new Mat(rect.width, rect.height, CV_8UC1);
                        Mat roi = null;
                        roi = originalImage.submat(rect.y+3, rect.y + rect.height-3, rect.x+3, rect.x + rect.width-3);
                        roi.copyTo(outputmat);
                        
                        return true;
                        }
                    }
                    
                }
            }
        }
        return false;
    }
}

//                            if("image-7-4.jpg".equals(file.getName())){
//                                Imgcodecs.imwrite("/home/levante/outputmat2.jpg", outputmat);
//                                fileResult = new File("/home/levante/outputmat2.jpg");
//                                break;
//                            }

                        //BufferedImage bufferedImage = mat2Img(outputmat);
                        
                        //File fileResult = new File("/home/levante/outputmat.jpg");
                        
                        //ImageIO.write(bufferedImage, "jpg", fileResult);


/*
if ("png".equals(file.getNameExtension()) || isPngFileHeader(file)){
                            Imgcodecs.imwrite("/home/levante/outputmat.png", outputmat);
                            File fileResult = new File("/home/levante/outputmat.png");
                            
                            try {
                                String result = insta.doOCR(fileResult);
                                System.out.println(result); 
                                return true;
                            } catch (TesseractException e) {
                                //System.err.println(e.getMessage());
                                return false;
                            }
                        }
                        
                        if ("jpg".equals(file.getNameExtension()) || isJpegFileHeader(file)){
                            Imgcodecs.imwrite("/home/levante/outputmat.jpg", outputmat);
                            File fileResult = new File("/home/levante/outputmat.jpg");
                            
                            try {
                                String result = insta.doOCR(fileResult);
                                System.out.println(result); 
                                return true;
                            } catch (TesseractException e) {
                                //System.err.println(e.getMessage());
                                return false;
                            }
                        }
*/