/**
 * Created by Mario on 8/22/16.
 */
public class Test {
    int Rollno;
    String name;
    String city;

    public Test(int rollno, String name, String city) {
        Rollno = rollno;
        this.name = name;
        this.city = city;
    }
    public String toString(){
        return Rollno+""+name+""+city;
    }

    public static void main(String...as)
    {
        Test t1 =new Test(11,"pooja","jab");
        Test t2= new Test(12,"love","jas");
        System.out.println(t1);
        System.out.println(t2);
    }
}
