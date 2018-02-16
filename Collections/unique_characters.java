import java.util.HashSet;
import java.util.Set;

public class unique_characters {
    public static void main(String[] args) {

        String str="Hello";
        Set<String> set=new HashSet<>();
        System.out.println(str);

        for(int i=0;i<str.length();i++)
        {
            set.add(str.charAt(i)+"");
        }

        System.out.println("Unique Characters in above String are :");

        for(String i:set)
            System.out.println(i);
    }
}
