/**
 * JDownloader app for build downloading, ver see at appVer
 * all configuration add in code
 * TODO: 
 *        1) add config file (maybe XML)
 *        2) create Method to print now time
 *        3) delete old builds
 * 0.0.2:
 * Fixed problem with corrupted zip files
 * 0.0.3:
 * Added before\after downloading date 
 * 
 * @author rkukharuk 
 */

import org.apache.commons.net.ftp.FTPClient;
//import org.apache.commons.net.*;
//import org.apache.commons.io.*;
import java.io.IOException;
import java.io.FileOutputStream;
import java.net.SocketException;
import java.util.Date;
import java.io.*;
import org.apache.commons.net.ftp.FTP; 


public class JBuildDownloader {
  public static void main(String[] args) throws SocketException, IOException {
	  
	  String appVer = "JDownloader 0.0.3 ver";
	  
	  System.out.println("==============================================================");
	  System.out.println("==============================================================");
	  System.out.println("================= " + appVer + " ======================");
	  System.out.println("==============================================================");
	  System.out.println("==============================================================\n");


	  
	  //input parameters
	  String filename = "bpmAdv.8010.delta.repository.zip";
	  String ftpName = "rtpmsa.raleigh.ibm.com";
	  String login = "kukharuk";
	  String psswd = "EKqlIShu52KsEKqlIShu52Ks";
	  String downloadDir = "C:\\FTP_DWNL\\";
	  String bpmVer = "BPM8010";
	  String exLink = "IWBI";
	  String daily = "/.projects/p2/businessprocessmanager/build/release/" + bpmVer + "." + exLink + "/daily/";
	  
	  


	  
    FTPClient client = new FTPClient();
    FileOutputStream fos = null;
    client.connect(ftpName);
    client.login(login, psswd);
    client.setFileType(FTP.BINARY_FILE_TYPE,FTP.BINARY_FILE_TYPE); 
    client.setFileTransferMode(FTP.BINARY_FILE_TYPE); 
    
    //change working directory
    client.changeWorkingDirectory(daily);
    String[] names = client.listNames();
    System.out.println("Current builds:");
    for (String name : names) {
    	System.out.println(name);
    }
    /**
     * Point for end of searching recommended build
     */
    boolean buildFind = false;
    /**
     * Loop for all files on build path
     */
    for (int count = names.length-1; buildFind == false; count--) {
    	client.changeWorkingDirectory(daily + names[count] + "/linux/zipper/"); //should be fixed with correct path
    	String[] namesInBuild = client.listNames();
    	/**
    	 * For all files on build path do
    	 */
    	for (String name : namesInBuild) {
    		/**
    		 * if file has recommended name that the build is rec
    		 * then change download directory to oldVar + "build name"
    		 */
    		if (name.equals("recommended")) {
    			System.out.println(names[count] + " is a last recommended build");
    			downloadDir +=  names[count] + "\\";
    			buildFind = true; //triger is ON
    			/*
    			 * Verify that the build is not downloaded
    			 * build path can include any downloaded zip files 
    			 */
    			File f = new File(downloadDir + filename);
    			if(f.exists()) {
    				System.out.println(filename + " already downloaded");
    				break;
    			} else {
    				/*
    				 * Creating the build name directory 
    				 */
    				boolean success = (new File(downloadDir)).mkdirs();
        			if (!success) {
        			    System.out.println("Directory creation failed - already exist");
        			}        		    
        			//Strean for downloadead dir
        		    //FileOutputStream fos  = new FileOutputStream(downloadDir + filename);
        			fos = new FileOutputStream(downloadDir + filename);
        		    /*
        		     * Starting downloading the build
        		     */
        			Date dateBefore = new Date();
        		    System.out.println(dateBefore);
    				System.out.println("Start Downloading...");
    				client.retrieveFile(daily + names[count] + "/linux/zipper/externals/installables/" + filename, fos);
    				System.out.println("Done! " + filename + " dropped in: " + downloadDir);
    				Date dateAfter = new Date();
    				System.out.println(dateAfter);
    				fos.close();
    				//disconnect from ftp    
    			    client.disconnect();
    				}
    			}
    		else continue;
    		}
    }
        
    
  } 
}