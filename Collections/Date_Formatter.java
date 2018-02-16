import java.util.Date;
import java.text.SimpleDateFormat;

public class Date_Formatter {
    public static void main(String[] args) {

        Date date=new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("dd-MMMMM-yyyy");
        String str=formatter.format(date);
        System.out.println(str);
    }
}
