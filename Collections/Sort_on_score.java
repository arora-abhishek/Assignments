import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Sort_on_score {


        private double score,age;
        private String name;

        public Sort_on_score(double age, double score, String name) {
            this.age = age;
            this.score = score;
            this.name = name;
        }



        public static final Comparator<Sort_on_score> scoreComparator = new Comparator<Sort_on_score>(){

            @Override
            public int compare(Sort_on_score o1, Sort_on_score o2) {
                if (o1.score > o2.score)
                    return 1;
                else if (o1.score < o2.score)
                    return -1;
                else {
                   return o1.name.compareTo(o2.name);
                }
            }

        };

        public String toString() {
            return  "name=" + name + ", score=" + score + ", age=" + age;
        }


        public static void main(String[] args) {

            Sort_on_score obj1=new Sort_on_score(22,30000.00,"Abhishek");
            Sort_on_score obj2=new Sort_on_score(23,25000.00,"Prateek");
            Sort_on_score obj3=new Sort_on_score(21,30000.00,"Yashi");
            Sort_on_score obj4=new Sort_on_score(22,22000.00,"Utkarsh");
            Sort_on_score obj5=new Sort_on_score(21,22500.00,"Varun");



            ArrayList<Sort_on_score> al=new ArrayList<>();
            al.add(obj1);
            al.add(obj2);
            al.add(obj3);
            al.add(obj4);
            al.add(obj5);

            System.out.println("Data before sorting based on score : ");

            Iterator ir=al.iterator();
            while(ir.hasNext())
                System.out.println(ir.next().toString());

            System.out.println("---------------------------------------");
            System.out.println("Data after sorting based on score : ");

            Collections.sort(al, Sort_on_score.scoreComparator);

            ir=al.iterator();
            while(ir.hasNext())
                System.out.println(ir.next().toString());





        }
    }


