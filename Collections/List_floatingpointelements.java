import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_floatingpointelements {
    public static void main(String[] args) {

        double sum=0.0;

        List<Float> li=new ArrayList<Float>();
        li.add(5.2f);
        li.add(6.2f);
        li.add(7.2f);
        li.add(8.2f);
        li.add(9.2f);

         Iterator iterator=li.iterator();

        System.out.println("Elements are: ");
         while(iterator.hasNext())
         {
             float num=(float)iterator.next();
             System.out.print(num+" ");
             sum+=num;
         }

        System.out.println("");
        System.out.println("Sum ="+sum);


    }
}
