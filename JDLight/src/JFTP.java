import java.io.*;
import java.net.URL;
import java.net.URLConnection;
 
public class JFTP {
 
    /**
     * JavaProgrammingForums.com
     *
ftp://kukharuk@nsfs04.raleigh.ibm.com//.projects/p2/businessprocessmanager/build/release//BPM8010.IWBI/daily/20120713-0102.0.linux/linux/zipper/
recommended

     * 
     */
 
    public static String server = "nsfs04.raleigh.ibm.com";
    public static String userName = "kukharuk";
    public static String password = "EKqlIShu52KsEKqlIShu52Ks";
    public static String fileName = "WebService_docs_standard.zip";
 
    public static void main(String[] args) throws Exception{
 
    System.out.println("Connecting to FTP server...");    
 
    URL url = new URL("ftp://"+userName+":"+password+"@"+server+"/.projects/p2/businessprocessmanager/build/release//BPM8010.IWBI/daily/20120714-0101.0.linux/linux/zipper/externals/installables/"+fileName+";type=i");
    URLConnection con = url.openConnection();
 
    BufferedInputStream in = new BufferedInputStream(con.getInputStream());
 
    System.out.println("Downloading file.");
 
    FileOutputStream out = new FileOutputStream("C:\\SCRIPT\\" + fileName);
 
    int i = 0;
    byte[] bytesIn = new byte[1024];
    while ((i = in.read(bytesIn)) >= 0) {
        out.write(bytesIn, 0, i);
    }
    out.close();
    in.close();
 
    System.out.println("File downloaded.");
 
    }
 
}

