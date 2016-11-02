import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by Mario on 8/24/16.
 */
public class TestCollectionSort1 {
    public static void main(String[] args) {
        ArrayList el=new ArrayList<>();
        el.add(Integer.valueOf(12));
        el.add(Integer.valueOf(13));
        el.add(Integer.valueOf(14));
        el.add(15);
        Collections.sort(el);
        for (Object anEl : el) {
            System.out.println("" + anEl);

        }
    }
}
