import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * Created by Mario on 8/26/16.
 */
public class BufferedOutput {
    public static void main(String[] args) throws IOException {

            FileOutputStream fout=new FileOutputStream("f1.txt");
            BufferedOutputStream boq=new BufferedOutputStream(fout);
            String s="this is my buffred input stream";
            byte b[] =s.getBytes();
            boq.write(b);
            boq.flush();
            boq.close();
            fout.close();

            System.out.print("suceess....");


        }
    }

