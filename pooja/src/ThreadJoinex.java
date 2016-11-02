/**
 * Created by Mario on 8/24/16.
 */
public class ThreadJoinex extends Thread
{
    public void run()
    {
        for (int i = 1; i <5 ; i++) {
            try{
            Thread.sleep(500);
        }catch(Exception e)
        {
            System.out.println(e);
        }

            System.out.println(i);

        }
    }

    public static void main(String[] args) {
        ThreadJoinex t=new ThreadJoinex();
        ThreadJoinex t1=new ThreadJoinex();
        ThreadJoinex t2=new ThreadJoinex();
        t.start();
        try{
            t.join(1400);
        }catch(Exception e)
        {
            System.out.println(e);

        }
        t1.start();
        t2.start();
    }
}
