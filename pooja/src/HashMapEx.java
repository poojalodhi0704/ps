import java.util.HashMap;
import java.util.*;

/**
 * Created by Mario on 8/24/16.
 */
public class HashMapEx {
    public static void main(String[] args) {
        Hashtable<Integer,String> hm;
        hm = new Hashtable<Integer, String>();
        hm.put(12,"pooja");
        hm.put(13,"kumar");
        hm.put(14,"aditya");
        hm.put(15,"vikram");
        for (Map.Entry m: hm.entrySet()) {
            System.out.println(""+m.getKey()+""+m.getValue());

        }

    }
}
