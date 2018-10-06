package org.sleuthkit.autopsy.modules.documentcheck;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Level;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;

import org.sleuthkit.datamodel.TskCoreException;
import org.sleuthkit.autopsy.casemodule.Case;
import org.sleuthkit.autopsy.datamodel.ContentUtils;
import org.sleuthkit.autopsy.coreutils.Logger;
import org.sleuthkit.datamodel.AbstractFile;


import org.xml.sax.SAXException;
import org.json.JSONObject;

public class DetectDocument {
    
    private static final Logger logger = Logger.getLogger(DocumentCheckModule.class.getName());

    private static final String apiUrl = "http://127.0.0.1:5000";

    static HttpURLConnection connection = null;

    public static Boolean Detect(AbstractFile abstractFile) throws TskCoreException, IOException, FileNotFoundException, SAXException, InvalidFormatException, Exception {
        String fileName = getTempPath() + File.separator + abstractFile.getName()
                + "-" + String.valueOf(abstractFile.getId());
        File file = new File(fileName);
        
        try {
            ContentUtils.writeToFile(abstractFile, file);
        } catch (IOException ex) {
            logger.log(Level.WARNING, "Failed writing file to disk.", ex); //NON-NLS
        }

        if (abstractFile.getMIMEType().equals("application/msword")) {
            System.out.println("Document:" + abstractFile.getName());
            System.out.println("Type:" + abstractFile.getMIMEType());
            String kq = readDocFile(file.getPath());
            
            if ((kq == null) || (kq.equals("")) || (kq.length() < 800)){
                return false;
            } else {
                System.out.println("Details:" + kq);
                if (!CheckAPI(kq)) {
                    return false;
                }
                return true;
            }
        }
        
        if (abstractFile.getMIMEType().startsWith("application/vnd.openxmlformats")) {
            System.out.println("Document:" + abstractFile.getName());
            System.out.println("Type:" + abstractFile.getMIMEType());
            String kq = readDocxFile(file.getPath());
            
            if ((kq == null) || (kq.equals("")) || (kq.length() < 800)){
                return false;
            } else {
                System.out.println("Details:" + kq);
                if (!CheckAPI(kq)) {
                    return false;
                }
                return true;
            }
        }
        
        if (abstractFile.getMIMEType().equals("text/plain")) {
            System.out.println("Document:" + abstractFile.getName());
            System.out.println("Type:" + abstractFile.getMIMEType());
            String kq = readPlainTextFile(file.getPath());
            if (kq.length() < 800) {
                return false;
            }
            
            if (kq != "" && CheckAPI(kq)) {
                System.out.println("Details:" + kq);
                return true;
            }
            return true;
        }
        
        if (abstractFile.getMIMEType().equals("application/pdf")){
            System.out.println("Name:" + file.getPath());
            System.out.println("Type:" + abstractFile.getMIMEType());
            String kq = readPDFFile(file.getPath());
            
            if ((kq == null) || (kq.equals("")) || (kq.length() < 800)){
                return false;
            } else {
                System.out.println("Details:" + kq);
                if (!CheckAPI(kq)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    public static String readPDFFile(String fileName) throws IOException {
        try {
            PdfReader reader = new PdfReader(fileName);
            String text = "";
            for (int i = 1; i <= reader.getNumberOfPages(); i++) {
                String subtext = PdfTextExtractor.getTextFromPage(reader, i);
                text = text + subtext;
            }
            return text;
        } catch (IOException ex) {
            return null;
        }
    }
    
    public static String readPlainTextFile(String fileName) throws Exception {     
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
        }
        String everything = sb.toString();
        return everything;
        } finally {
            br.close();
        }
    }
    
    public static String readDocFile(String fileName) throws FileNotFoundException, IOException {
        try {
            FileInputStream fistream = new FileInputStream(fileName);
            HWPFDocument document = new HWPFDocument(fistream);
            return document.getDocumentText();
        } catch (IOException ex) {
            return null;
        }
    }
    
    public static String readDocxFile(String fileName) throws FileNotFoundException, IOException, InvalidFormatException {
        try {
            FileInputStream fistream = new FileInputStream(fileName);
            XWPFDocument docx = new XWPFDocument(OPCPackage.open(fistream));
            XWPFWordExtractor extractor = new XWPFWordExtractor(docx);
            return extractor.getText();
        } catch (IOException ex) {
            return null;
        }
    }
    
    public static String getTempPath() {
        String tmpDir = Case.getCurrentCase().getTempDirectory() + File.separator
                + "DocumentCheckParser"; //NON-NLS
        File dir = new File(tmpDir);
        if (dir.exists() == false) {
            dir.mkdirs();
        }
        return tmpDir;
    }
    
    public static Boolean CheckAPI(String input) throws IOException, Exception {
        
        JSONObject response = null;
        URL url = null;
        try {
            url = new URL(apiUrl);
        } catch (MalformedURLException ex) {
            return null;
        }
        
        try {
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            // set headers
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");

            // body
            //String input = "Giả thiết các chiều của dữ liệu độc lập với nhau, nếu biết , là quá chặt và ít khi tìm được dữ liệu mà các thành phần hoàn toàn độc lập với nhau. Tuy nhiên, giả thiết ngây ngô này lại mang lại những kết quả tốt bất ngờ. Giả thiết về sự độc lập của các chiều dữ liệu này được gọi là Naive Bayes (xin không dịch). Cách xác định class của dữ liệu dựa trên giả thiết này có tên là Naive Bayes Classifier (NBC).";
            
            JSONObject parent = new JSONObject();
            parent.put("input", input);
            
            System.out.println(parent.toString());
            
            OutputStream os = connection.getOutputStream();
            os.write(parent.toString().getBytes("UTF-8"));
            os.flush();
            
            // send
            InputStream is = connection.getInputStream();
            
            // reponse
            if (connection.getResponseCode() != 200) {
		throw new RuntimeException("Failed : HTTP error code : " + connection.getResponseCode());
	    }

            BufferedReader streamReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            StringBuilder responseStrBuilder = new StringBuilder();
            
            String inputStr;
            while ((inputStr = streamReader.readLine()) != null) {
                responseStrBuilder.append(inputStr);
            }
            
            String responseString = responseStrBuilder.toString();
            response = new JSONObject(responseString);
            String res = response.getString("data");
            if (res.equals("OK")) {
                System.out.println(res);
                return true;
            }
            else {
                System.out.println("Error");
                return false;
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}