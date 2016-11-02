import java.io.Console;

/**
 * Created by Mario on 8/26/16.
 */
public class ConsoleEx {
    public static void main(String[] args) throws Exception {

       try {
           Console c = System.console();
           System.out.println("Enter ur name:");
           String n = c.readLine();
           System.out.println("name is" + n);
       }catch(Exception e)
       {
           System.out.print("Exception occur");
       }
       finally {
           System.out.println(" Exception handled");
       }
    }
}
