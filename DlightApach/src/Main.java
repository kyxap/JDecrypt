import org.apache.commons.net.ftp.FTPClient;
import java.io.IOException;
import java.io.FileOutputStream;
import java.net.SocketException;

public class Main {
  public static void main(String[] args) throws SocketException, IOException {
    FTPClient client = new FTPClient();
    FileOutputStream fos = null;

    client.connect("nsfs04.raleigh.ibm.com");
    client.login("kukharuk", "EKqlIShu52KsEKqlIShu52Ks");

    String filename = "WebService_docs_standard.zip";
    fos = new FileOutputStream("/.projects/p2/businessprocessmanager/build/release/BPM8010.IWBI/daily/20120714-0101.0.linux/linux/zipper/externals/installables/WebService_docs_standard.zip");

    client.retrieveFile("C:\\FTP_DWNL\\" + filename, fos);
    fos.close();
    client.disconnect();
  }
}