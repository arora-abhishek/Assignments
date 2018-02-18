import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class copyPasteFileFromLocation {
    public static void main(String[] args) {

        try{

            FileUtils.copyFile(new File("/home/abhishek/index.txt"),new File("/home/abhishek/Documents/File.txt"));

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
