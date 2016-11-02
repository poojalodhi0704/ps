/**
 * Created by Mario on 8/24/16.
 */
public class ThreadSleep extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                System.out.println(e);

            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
     ThreadSleep th=new ThreadSleep();
        Thread t1=new Thread(th);
        t1.start();
        ThreadSleep ty=new ThreadSleep();
        Thread t2=new Thread(ty);
        t2.start();
    }
}
