import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by Mario on 8/24/16.
 */
public class TestCollectionSort {
    public static void main(String[] args) {
        ArrayList<String> el=new ArrayList<String>();
        el.add("pooja");
        el.add("singh");
        el.add("viku");
        el.add("aadi");
        Collections.sort(el);
        Iterator itr=el.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
