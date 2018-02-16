import java.util.*;

public class Frequency_sort {

    public static void main(String[] args) {
        
        Integer[] arr={1,2,3,2,3,3,4,4,4,4,5,3,5,8,7};
        
        List<Integer> l1=new ArrayList(Arrays.asList(arr));
        
        Set<Integer> set=new LinkedHashSet<Integer>(l1);   // to remove duplicates
        
        List<Integer> l2=new ArrayList<Integer>(set);

        Collections.sort(l2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                Integer a=Collections.frequency(l1,o1);
                Integer b=Collections.frequency(l1,o2);
                
                if(a<b)
                    return 1;
                else if(a>b)
                    return -1;
                else 
                    return 0;

            }
        });

        System.out.println("Original array : ");
        for(int i:arr)
            System.out.print(i+" ");

        System.out.println("\n ----------------------------------------");


        System.out.println("Elements after sorting on basis of frequency : ");
        for(Object i:l2)
            System.out.print((int)i+" ");
    }

  
}
