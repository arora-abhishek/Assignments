import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class Stack_Implementation {

    private  int maxSize;
    private  int top;
    private  int len;
    protected  int[] special_stack;
    protected  List<Integer> min;
    private  int min_element;


    public Stack_Implementation(int maxsize) {

        this.maxSize = maxsize;
        special_stack = new int[maxSize];
        min = new ArrayList<>();
        min_element=0;
        top=-1;
        len=0;
    }


    protected boolean isEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }


    protected  boolean isFull() {
        if (top >= maxSize)
            return true;
        else
            return false;
    }


    protected int peek() {
        if(isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        return special_stack[top];

    }


    protected void push(int a) {

        if (isFull()) {
            System.out.println("Overflow...");
            throw new ArrayIndexOutOfBoundsException();
        }

        else {

            if (isEmpty())
                min_element = a;

            else {

                if (min_element >= a)
                    min_element = a;
            }

            ++top;
            special_stack[top] = a;
            min.add(min_element);
            System.out.println("Pushed item -> " + a);
            ++len;
        }
    }

    protected int pop() {
        if (isEmpty()) {
            System.out.println("Cannot pop....stack is already empty");
            throw new NoSuchElementException("Underflow Exception");
        }

        else {
            int rem = special_stack[top];
            --top;

            if (rem == min_element) {
                min.remove(min.size() - 1);
                min_element = (int) min.get(min.size());
                --len;

            }

            return rem;
        }

    }

    protected void display() {
        if (len == 0)
        {
            System.out.print("Empty\n");

            return ;

        }
        for (int i = top; i >= 0; i--)
            System.out.print(special_stack[i] + " ");
        System.out.println();
    }


    protected int getMin() {


        return min_element;
    }


}

class SpecialStack {

    public static void main(String[] args) throws IOException {

        Stack_Implementation obj1 = new Stack_Implementation(10);
        System.out.println("Stack Operations");
        System.out.println(" Press 1. for push, 2. for pop, 3. for display, 4. for peek, 5. for minimum element");


        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int option = Integer.parseInt(br.readLine());


        do {
            switch (option) {
                case 1:
                    try {

                        System.out.println("Enter any number");
                        int num = Integer.parseInt(br.readLine());
                        obj1.push(num);
                        break;
                    }
                    catch (Exception e)

                    {

                        System.out.println("Error : " + e.getMessage());

                    }


                case 2:
                    try {

                        int rem = obj1.pop();
                        System.out.println("Element removed -> " + rem);
                        break;
                    }
                    catch (Exception e)

                    {

                        System.out.println("Error : " + e.getMessage());

                    }

                case 3:
                    obj1.display();
                    break;

                case 4:
                    try{
                        int peek = obj1.peek();
                        System.out.println("Topmost element -> " + peek);
                        break;
                    }
                    catch (Exception e)

                    {

                        System.out.println("Error : " + e.getMessage());

                    }

                case 5:
                    int min = obj1.getMin();
                    System.out.println("Minimum element -> " + min);
                    break;

                default:
                    System.out.println("Wrong choice");

            }

        System.out.println("Stack Operations");
        System.out.println(" Press 1. for push, 2. for pop, 3. for display, 4. for peek, 5. for minimum element");

        option = Integer.parseInt(br.readLine());



        }while (option >= 1 && option <= 5) ;
    }

}

