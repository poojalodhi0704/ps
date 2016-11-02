/**
 * Created by Mario on 8/23/16.
 */
public class TestThrow {
    static void chae(int age)

    {
             if(age<18)
             {
                 throw new ArithmeticException("not valid");


             }
             else
             {
                 System.out.println("welcome to vote");
             }

    }
    public static void main(String...as)
    {
        chae(20);
        System.out.println("lol");
    }


}
