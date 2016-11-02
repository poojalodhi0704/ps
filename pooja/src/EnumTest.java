import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Mario on 8/26/16.
 */
public class EnumTest  {
    public static void main(String[] args)throws IOException {
        try {
            FileInputStream f = new FileInputStream("abc.txt");
            FileInputStream f1 = new FileInputStream("abc.txt");
            FileInputStream f2 = new FileInputStream("abc.txt");
            Vector v = new Vector();
            v.add(f);
            v.add(f1);
            v.add(f2);
            Enumeration e = v.elements();
            SequenceInputStream bin=new SequenceInputStream(e);
            int i=0;
            while((i=bin.read())!=-1)
            {
                System.out.println((char)i);
            }
        }catch(Exception s)
        {
            System.out.println("Exception :"+s);
        }

    }
 }
