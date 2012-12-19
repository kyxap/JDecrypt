//import java.io.*;
//import java.net.URL;
//import java.net.URLConnection;
//import java.*;
//
//public class ftpUpload1
//  {    
//
//   public static void main(String a[]) throws IOException
//{
//          ftpUpload1 obj = new ftpUpload1();
//          URL url1 = new URL("ftp://vbalamurugan:vbalamurugan@192.168.6.38/ddd.txt" );
// File dest = new File("D:/rvenkatesan/Software/ddd.txt");
//       obj.ftpUpload1(dest, url1);
//
//     public void ftpDownload(File destination,URL url) throws IOException
// { 
// BufferedInputStream bis = null;
// BufferedOutputStream bos = null;
// try
// {
//  URLConnection urlc = url.openConnection();
//
//
//
//bis = new BufferedInputStream( urlc.getInputStream() );
//   bos = new BufferedOutputStream( new 
//                  FileOutputStream(destination.getName() ) );
//
//   int i;
//   //read byte by byte until end of stream
//   while ((i = bis.read())!= -1)
//   {
//    // bos.write(i);
//    bos.write(i);
//   }
//   System.out.println("File Downloaded Successfully");
//  }
//  finally
//  {
//   if (bis != null)
//    try
//   {
//     bis.close();
//   }
//   catch (IOException ioe)
//   {
//    ioe.printStackTrace();
//   }
//   if (bos != null)
//    try
//   {
//     bos.close();
//   }
//   catch (IOException ioe)
//   {
//    ioe.printStackTrace();
//   }
//  }
//
//  }
//        }
//
//       }