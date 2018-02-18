import java.util.function.Consumer;

public class TablePrint {
   public static void print(int a){

       System.out.println("Table of "+a+" : ");
       for(int i=1;i<=10;i++)
           System.out.println(a+" * "+i+" = "+(a*i));
   }
   public static void main(String[] args) {

       Consumer<Integer> a=TablePrint::print;
       a.accept(new Integer(3));

    }
}
