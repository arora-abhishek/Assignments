import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee_startingwith_n {

    private String name="";
    private Integer age=0;

    public Employee_startingwith_n(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name+" "+age;
    }

    public static void main(String[] args) {

       List<Employee_startingwith_n> list=new ArrayList<>();

        list.add(new Employee_startingwith_n("Abhishek",22));
        list.add(new Employee_startingwith_n("Munny Singh",26));
        list.add(new Employee_startingwith_n("DJ musertia",24));
        list.add(new Employee_startingwith_n("UT",22));
        list.add(new Employee_startingwith_n("Naman",26));
        list.add(new Employee_startingwith_n("Naveen",28));
        list.add(new Employee_startingwith_n("Noora",29));
        list.add(new Employee_startingwith_n("Arpan",24));
        list.add(new Employee_startingwith_n("Nitin",30));
        list.add(new Employee_startingwith_n("Kunal",31));


        System.out.println(list);
        System.out.println("Employees with names starting with 'N' and age >24 are :");

       list.stream().filter((a) -> a.getName().startsWith("N") && a.getAge()>24).forEach(System.out::println);




    }
}
