interface  def{

    public void display();


    public static int sum(int a,int b) {

        int sum=a+b;
        return sum;
    }

    default int sub(int a, int b) {

        int sub = a - b;
        return sub;

    }

}




public class Default_Static_Interface implements def{

    @Override
    public void display()
    {
        int a=9,b=10,c=100,d=49;
        int sum=def.sum(a,b);
        System.out.println("Addition of "+a+" and "+b+" is : "+sum);

        int sub=sub(c,d);
        System.out.println("Subtraction of "+c+" and "+d+" is : "+sub);
    }

    public static void main(String[] args) {

        Default_Static_Interface obj=new Default_Static_Interface();

        obj.display();


    }


}
