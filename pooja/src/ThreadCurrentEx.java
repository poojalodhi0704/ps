/**
 * Created by Mario on 8/24/16.
 */
public class ThreadCurrentEx extends Thread {
    public void run()
    {
        System.out.println(Thread.currentThread().getName());

    }
    public static void main(String[] args) {
        ThreadCurrentEx t1=new ThreadCurrentEx();
        ThreadCurrentEx t2=new ThreadCurrentEx();
        t1.start();
        t2.start();

    }
}
