/**
 * Created by Mario on 8/23/16.
 */
import java.io.IOException;
public class TestThrows {
    void m()throws IOException
    {
        System.out.println("exception occur");
    }
    void n() throws IOException
    {
        m();
        System.out.println("Excwption occur");
    }
    void p()
    {
        try
        {n();}catch(Exception e){ System.out.println("exception caught");}
    }
    public  static void main(String...as)
    {
        TestThrows t1=new TestThrows();
        t1.p();
        System.out.println("flow is normal");
    }
}
