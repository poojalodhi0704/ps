import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by Mario on 8/24/16.
 */
class Student
{
    int rollno;
    String name;
    int age;

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}
class ComparatbleAge implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        Student s1=(Student)o1;
        Student s2=(Student)o2;
        if(s1==o1)
        {
            return 0;
        }
        else if(s2==o2)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
class ComparatableName implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        Student s1=(Student)o1;
        Student s2=(Student)o2;
        return s1.name.compareTo(s2.name);
    }
}
public class Simple {
    public static void main(String[] args) {
        ArrayList el= new ArrayList<>();
        el.add(new Student(12,"pooja",24));
        el.add(new Student(13,"rani",34));
        Iterator itr=el.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
