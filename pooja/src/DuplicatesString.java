/**
 * Created by Mario on 8/28/16.
 */
import java.util.*;

public class DuplicatesString {
    public void findDuplicate(String str)
    {
        Map<Character,Integer> dupMap= new HashMap<Character, Integer>();
        char ch[]=str.toCharArray();
        for (Character c:ch) {
            if(dupMap.containsKey(c)){
                dupMap.put(c,dupMap.get(c)+1);
            }
            else
            {
                dupMap.put(c,1);
            }

        }
        Set<Character> s=dupMap.keySet();
        for (Character c:s) {
            if(dupMap.get(s)>1)
            {
                System.out.println(c+"->"+dupMap.get(c));


        }



        }
    }
         public static void main(String[]a)
         {
             DuplicatesString s1=new DuplicatesString();
             s1.findDuplicate("hello pooja");
         }

}
