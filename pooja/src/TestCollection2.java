/**
 * Created by Mario on 8/24/16.
 */import java.util.*;


public class TestCollection2 {
    public static void main(String...as)
    {

        ArrayList<String> el=new ArrayList<String>();
        el.add("pooa");
        el.add("lodhi");
        ArrayList<String> a=new ArrayList<String>();
        a.add("sono");
        a.add("amit");
        a.retainAll(el);
        Iterator itr=el.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());

        }


    }

}
