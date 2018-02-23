import java.io.*;

//import org.apache.commons.io.FileUtils;
//
public class copyPasteFileFromLocation {
    public static void main(String[] args) {
//
//        try{
//
//            FileUtils.copyFile(new File("/home/abhishek/index.txt"),new File("/home/abhishek/Documents/File.txt"));
//
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }

        try
        {
            InputStream is = new FileInputStream("/home/abhishek/index.txt");
            OutputStream os = new FileOutputStream("/home/abhishek/Documents/File.txt");
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
               }

               is.close();
               os.close();
        }
        catch(Exception e)
            {
                System.out.println("Error : "+e.getMessage());
            }


    }
}
