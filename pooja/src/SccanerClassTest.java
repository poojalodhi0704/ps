import java.util.Scanner;

/**
 * Created by Mario on 8/26/16.
 */
public class SccanerClassTest {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter ur roll no:");
        int rollno=s.nextInt();
        System.out.println("Enter ur name:");
        String name=s.next();
        System.out.println("fee structure");
        double fee=s.nextDouble();
        System.out.println("roll no  :"+rollno+"  name  :"+name+"  fee  :"+fee);
    }
}
