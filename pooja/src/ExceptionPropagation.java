import java.lang.*;

/**
 * Created by Mario on 8/23/16.
 */
public class ExceptionPropagation {
    void m()
    {
        int data = 30/0;
    }
    void n()
    {

    m();
    }
    void p()
    {
        try {
        n();
    }
    catch(java.lang.Exception e){
        System.out.println("exception handle");}
    }
    public static void main(String...as)
    {
        ExceptionPropagation e=new ExceptionPropagation();
        e.p();
        System.out.println("flow is normal");
    }
}
