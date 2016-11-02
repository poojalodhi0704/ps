import java.io.Console;

/**
 * Created by Mario on 8/26/16.
 */
public class ReadPasswordEX {
    public static void main(String[] args) {
        try {
            Console c = System.console();
            System.out.println("Enter ur passwprd:");
            char[] b = c.readPassword();
            String pass = String.valueOf(b);
            System.out.print(b);
        }catch(NullPointerException e)
        {
            System.out.print(e);
        }
    }
}
