/**
 * Created by Mario on 8/24/16.
 */
public class TestaThreadMethod extends Thread {
    public void run()
    {
        for (int i = 0; i < 10; i++) {
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
        TestaThreadMethod t1=new TestaThreadMethod();
        TestaThreadMethod t2=new TestaThreadMethod();
        TestaThreadMethod t3=new TestaThreadMethod();
        System.out.println("get name t1:"+t1.getName());
        System.out.println("get name t2:"+t2.getName());
        System.out.println("get name t3:"+t3.getName());
        t1.start();
        t2.start();
        t3.start();
        System.out.println("get id t1:"+t1.getId());
        System.out.println("name set");
        t1.setName("sono");
        System.out.println("set name:"+t1.getName());
    }
}
