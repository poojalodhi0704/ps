import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Mario on 8/24/16.
 */
public class TestLInkedList {
    public static void main(String[] args) {
        LinkedList<String> el=new LinkedList<String>();
        el.add("ravi");
        el.add("poo");
        for (String anEl : el) {
            System.out.println(anEl);
        }


    }
}
