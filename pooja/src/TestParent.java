/**
 * Created by Mario on 8/23/16.
 */
import java.io.*;
public class TestParent {
    void m()
    {
        System.out.println("parent");
    }
}
class Child extends TestParent
{
void m() throws ArithmeticException{
    System.out.println("exception caught");

}
public static void main(String...as)
{
    Child c=new Child();
    c.m();
    System.out.println("child");
}

}

