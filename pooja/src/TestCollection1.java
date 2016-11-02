import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Mario on 8/24/16.
 */
class StudentE
{
    int rollno;
    String name;
    int age;

    public StudentE(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}
public class TestCollection1 {
    public static void main(String...as) {
        StudentE s1 = new StudentE(111, "pooja", 13);
        StudentE s2 = new StudentE(12, "aditya", 12);
        StudentE s3 = new StudentE(133, "kumar", 18);


        ArrayList<StudentE> el = new ArrayList<StudentE>();
        el.add(s1);
        el.add(s2);
        el.add(s3);

        Iterator itr = el.iterator();
        while(itr.hasNext())
        {
            StudentE st= (StudentE)itr.next();
            System.out.println("rollno: "+st.rollno+" name: "+st.name+" age "+st.age);


        }

    }


}
