/**
 * Created by Mario on 8/25/16.
 */
public class ThreadGroupEx implements Runnable {
    @Override
    public void run() {
        System.out.println("name:-"+Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        ThreadGroupEx r =new ThreadGroupEx();
        ThreadGroup t =new ThreadGroup("parent thread");
        Thread t1=new Thread(t,r,"one"); t1.start();
        Thread t2=new Thread(t,r,"two");t2.start();
        Thread t3=new Thread(t,r,"three");t3.start();
        System.out.println("thread group name:-"+t.getName());
        t.list();
    }
}
