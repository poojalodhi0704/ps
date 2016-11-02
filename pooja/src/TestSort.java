import java.util.*;

/**
 * Created by Mario on 8/24/16.
class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student st) {
        if (age == st.age) {
            return 0;
        } else if (age > st.age) {
            return 1;

        } else {
            return -1;
        }
    }
}


public class TestSort {
    public static void main(String[] args) {

        ArrayList<Student> s=new ArrayList<Student>();
        s.add(new Student(12,"pooja",14));
        s.add(new Student(13,"harsh",20));
        s.add(new Student(14,"love",23));

        for (Student st:s) {
                System.out.println(""+st.rollno+""+st.name+""+st.age);
            
        }
        

    }
}
*/