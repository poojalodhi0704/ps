/**
 * Created by Mario on 8/22/16.
 */
import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexEx {
    public static void main(String...as)
    {
        Console console= System.console();

        if(console==null) {
            System.err.println("no console");
            System.exit(1);

        }


        while(true)

    {
            Pattern pattern = Pattern.compile(console.readLine("enter ur regex"));
        Matcher matcher=pattern.matcher(console.readLine("enetr ur string to search:"));
            boolean found=false;
            while(matcher.find())
            {
                System.out.println("i found the text"+matcher.group()+"starting at index"+matcher.start()+"and ending at index"
                +matcher.end());
                found =true;
            }
            if(!found)
            {
                System.out.println("no matches found");
            }
        }

    }

}
