import java.util.HashMap;
import java.util.Map;

public class Occurrences_of_character {

        public static void main(String[] args) {

            int count=1,j;
            String s="";
            String str1="Hello";
            System.out.println(str1);
            Map<String,Integer> m =new HashMap<String,Integer>();

            int l=str1.length();
            for(int i=0;i<l;i++)
            {
                count=1;
                s=str1.charAt(i)+"";


                if(m.containsKey(s))
                {
                    count=m.get(s);
                    m.put(s,count+1);
                }
                else
                    m.put(s,count);

            }

            for(Map.Entry mp:m.entrySet())
                System.out.println("Character= "+mp.getKey()+" : "+mp.getValue()+" times");



        }


}
