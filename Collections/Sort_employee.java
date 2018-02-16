import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Sort_employee {

   private Double salary;
   private int age;
   private String name;

    public Sort_employee(int age, double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }



    public static final Comparator<Sort_employee> SalaryComparator = new Comparator<Sort_employee>(){

        @Override
        public int compare(Sort_employee o1, Sort_employee o2) {
            if (o1.salary > o2.salary)
                return 1;
            else if (o1.salary < o2.salary)
                return -1;
            return 0;
        }

    };

    public String toString() {
        return  "name=" + name + ", salary=" + salary + ", age=" + age;
    }


    public static void main(String[] args) {

        Sort_employee obj1=new Sort_employee(22,30000.00,"Abhishek");
        Sort_employee obj2=new Sort_employee(23,25000.00,"Prateek");
        Sort_employee obj3=new Sort_employee(21,28000.00,"Yashi");
        Sort_employee obj4=new Sort_employee(22,22000.00,"Utkarsh");
        Sort_employee obj5=new Sort_employee(21,22500.00,"Varun");


        ArrayList<Sort_employee> al=new ArrayList<>();
        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);

        System.out.println("Data before sorting based on salary : ");

        Iterator ir=al.iterator();
                while(ir.hasNext())
                    System.out.println(ir.next().toString());

        System.out.println("---------------------------------------");
        System.out.println("Data after sorting based on salary : ");

       Collections.sort(al,Sort_employee.SalaryComparator);

        ir=al.iterator();
        while(ir.hasNext())
            System.out.println(ir.next().toString());





    }
}
