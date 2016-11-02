import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Mario on 8/26/16.
 */
public class InputFromUser {
    public static void main(String[] args) throws Exception {

        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(in);

        String name ="";
        while(!name.equals("stop"))
        {
            System.out.println("enter data:");
            name= br.readLine();
            System.out.println("data is:="+name);

        }
        br.close();
        in.close();

    }
}
