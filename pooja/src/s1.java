import java.io.FileInputStream;
import java.io.SequenceInputStream;

/**
 * Created by Mario on 8/26/16.
 */
public class s1  {
    public static void main(String[] args) throws Exception {
        try
        {
            FileInputStream f1 =new FileInputStream("a.txt");
            FileInputStream f2 =new FileInputStream("b.txt");
            SequenceInputStream sis=new SequenceInputStream(f1,f2);

            int i;
            while((i=sis.read())!=-1)
            {
                System.out.println((char)i);
            }
            sis.close();
            f1.close();
            f2.close();
        }catch(Exception e)
        {
            System.out.println("exception occur");
        }
    }
}
