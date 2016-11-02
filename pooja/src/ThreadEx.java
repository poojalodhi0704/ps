/**
 * Created by Mario on 8/24/16.
 */
public class ThreadEx extends Thread {
    public void run()
    {
        System.out.println("thread is running");
    }
    public static void main(String[] args) {

        ThreadEx t=new ThreadEx();
        t.run();
    }
}
