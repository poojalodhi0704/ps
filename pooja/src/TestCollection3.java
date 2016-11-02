import java.util.*;

/**
 * Created by Mario on 8/24/16.
 */
public class TestCollection3 {
    public static void main(String[] args) {
        List<String> el =new LinkedList<String>();
        el.add("ravi");
        el.add("pooja");
        el.add("sachin");
        el.add(1,"allo");
        System.out.println("element in second position:"+el.get(2));
        System.out.println("element in third position:"+el.set(3,"lol"));
        ListIterator<String> itr= el.listIterator();
        System.out.println("forword direction");
        while(itr.hasNext()){
            System.out.println(""+itr.next());
        }
        System.out.println("backword direction");
        while(itr.hasPrevious())
        {
            System.out.println(itr.previous());
        }
    }
}
