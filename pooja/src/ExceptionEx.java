/**
 * Created by Mario on 8/23/16.
 */
public class ExceptionEx {
    public static void main(String...as) {
        System.out.println("hii test");
        try
        {
            int data=30/0;
        }catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("yes");
        }
    }
}
