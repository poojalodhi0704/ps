import java.io.FileWriter;

/**
 * Created by Mario on 8/26/16.
 */
public class FileWriterEx {
    public static void main(String[] args) {
        try
        {
            FileWriter fw=new FileWriter("ac.txt");

            fw.write("this is the program");
            fw.close();
            System.out.print("Success");

        }catch(Exception e)
        {
            System.out.println("Exception occur");
        }
    }
}
