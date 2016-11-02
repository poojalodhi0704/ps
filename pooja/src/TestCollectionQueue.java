import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Mario on 8/24/16.
 */
public class TestCollectionQueue {

    public static void main(String[] args) {
        PriorityQueue<String> q=new PriorityQueue<String>();
        q.add("pooja");
        q.add("aman");
        q.add("aba");
        q.add("aca");
        System.out.println("element:"+q.element());
        System.out.println("peek:"+q.peek());
        Iterator itr = q.iterator();
        while(itr.hasNext())
        {
            System.out.println(""+itr.next());
        }
        q.remove();
        q.poll();
        Iterator itr2=q.iterator();
        while (itr2.hasNext())
        {
            System.out.println(""+itr2.next());
        }
    }
}
