/**
 * Created by Mario on 8/23/16.

public class ExceptionExample {
    void m(){
        throw new java.io.IOException("devise err");

    }
    void n()
    {
        try
        {m();
        }catch (Exception e){System.out.println("exception handled");}
    }
    public static void main(String...as)
    {
        ExceptionExample e1=new ExceptionExample();
        e1.n();
        System.out.println("flow is normal");
    }
}*/
