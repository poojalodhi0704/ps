import java.io.FileInputStream;

/**
 * Created by Mario on 8/26/16.
 */
public class SimpleREad {
    public static void main(String[] args) {
        try
        {
            FileInputStream fin =new FileInputStream("abc.txt");
            int i;
            while((i=fin.read())!=-1)
            {
                System.out.println((char)i);
            }
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occur"+e);
        }
    }
}
