import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Mario on 8/26/16.
 */
public class BufferedInput {
    public static void main(String[] args) throws IOException {
        try{
            FileInputStream fin=new FileInputStream("f1.txt");
            BufferedInputStream bin =new BufferedInputStream(fin);
            int i ;
            while((i =bin.read())!=-1)
            {
                System.out.println((char)i);
            }
            bin.close();
            fin.close();
        }catch(Exception e)
        {
            System.out.println("exception occur"+e);
        }

    }
}
