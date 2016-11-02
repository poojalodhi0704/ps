
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Mario on 8/25/16.
 */
class ThreadPoolEx implements Runnable
{
    private String message;

    public ThreadPoolEx(String s) {
        this.message = s;
    }
    private  void processmessage()
    {
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e)
        {
            System.out.println("exception occur");
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"(start)message:"+message);
        processmessage();
        System.out.println(Thread.currentThread().getName()+"(end):");

    }
}
public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 1; i <10 ; i++) {

            Runnable worker = new ThreadPoolEx("" + i);
            executor.execute(worker);
        }
        executor.shutdown();
        while(!executor.isTerminated())
        {
            System.out.println("finished all thread");
        }
    }
}
