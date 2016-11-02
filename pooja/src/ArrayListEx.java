import java.util.*;

/**
 * Created by Mario on 8/24/16.
 */
public class ArrayListEx {
    public static void main(String...as)
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("pooja");
        al.add("ravi");

        al.add("vikram");
        al.add("aditya");
        Iterator itr=al.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        }
    }

