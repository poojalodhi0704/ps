/**
 * Created by Mario on 8/24/16.
 */
public class ThreadExa implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running");

    }

    public static void main(String[] args) {
        ThreadExa t1=new ThreadExa();
        Thread t2=new Thread(t1);
        t2.start();
    }
}
