import java.io.FileOutputStream;

/**
 * Created by Mario on 8/26/16.
 */
public class TestIO {
    public static void main(String[] args) {
        try{
            FileOutputStream fout =new FileOutputStream("abc.txt");
            String s="this is my first program of IO";
            byte []b= s.getBytes();
            fout.write(b);
            fout.close();

        }catch(Exception e){
            System.out.println("Exception occur"+e);
        }
    }
}
