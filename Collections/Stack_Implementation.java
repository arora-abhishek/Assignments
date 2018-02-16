import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Stack_Implementation {

    private static int maxSize;
    private static int counter=-1;
    protected static ArrayList<Integer> special_stack;
    private static int min_element=0;

   protected static Stack min_stack=new Stack();



    public Stack_Implementation(int maxsize) {

        this.maxSize=maxsize;
        special_stack=new ArrayList<Integer>(maxSize);
    }


    protected  static boolean chkEmpty(ArrayList st)
    {
        if(st.isEmpty())
            return true;
        else
            return false;
    }


    protected static  void push(ArrayList st, int a) {
        if (chkFull())
            System.out.println("Overflow...");
        else {

            if (chkEmpty(st))
                min_element = a;

            else {
                if (min_element > a)
                    min_element = a;
            }

            ++counter;
            st.add(a);
            min_stack.push(min_element);
            System.out.println("Pushed item -> " + a);
        }
    }

    protected static  void pop(ArrayList st)
    {
        if(chkEmpty(st))
            System.out.println("Cannot pop....stack is already empty");
        else
        {
            int a= (int) st.remove(counter);
            System.out.println("Removed item -> "+a);
            if(a==min_element) {
                min_stack.pop();
                min_element=(int)min_stack.peek();

            }

            --counter;
        }

    }

    protected static  void display_stack(ArrayList st)
    {
        Iterator ir=st.iterator();
        while(ir.hasNext())
            System.out.print((int)(ir.next())+" ");
        System.out.println("");
    }



    protected  static boolean chkFull()
    {
        if(counter>=maxSize)
            return true;
        else
            return false;
    }


    protected static  void peek(ArrayList st)
    {
        int a=(int)st.get(counter);
        System.out.println("Top element : "+a);
    }

    protected static void getMin()
    {


        System.out.println("Minimum Element : "+min_element);
    }





    public static void main(String[] args) {

        Stack_Implementation obj1=new Stack_Implementation(10);



        push(special_stack,22);
        push(special_stack,10);
        push(special_stack,12);
        push(special_stack,11);
        push(special_stack,22);
        push(special_stack,19);


        push(special_stack,32);
        push(special_stack,14);
        push(special_stack,7);

        display_stack(special_stack);
        getMin();

        pop(special_stack);
        pop(special_stack);

        display_stack(special_stack);
        peek(special_stack);

       chkFull();
        getMin();

    }

}
