import java.util.ArrayList;

/**
 * Created by Mario on 8/24/16.
 */
public class TestCollection {
    public static void main(String...as)
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        for (String ob:al) {
            System.out.println(ob);

        }
    }
}
