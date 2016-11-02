import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

/**
 * Created by Mario on 8/26/16.
 */
public class S {
    public static void main(String[] args) {
       try
       {FileOutputStream f1=new FileOutputStream("a.txt");
        FileOutputStream f2=new FileOutputStream("b,txt");
        ByteArrayOutputStream bout=new ByteArrayOutputStream();
        bout.write(139);
        bout.writeTo(f1);
        bout.writeTo(f2);
       bout.flush();
       bout.close();}
        catch(Exception e)
        {
            System.out.println("Exception occur"+e);
        }

    }
}
