import java.util.regex.Pattern;

/**
 * Created by Mario on 8/22/16.
 */
public class JavaReg1 {
    public static void main(String...as)
    {
        System.out.println("quantifier:?");
        System.out.println(Pattern.matches("[amz]","z"));
        System.out.println(Pattern.matches("[amz]","aaaa"));
        System.out.println(Pattern.matches("[amn]","amn"));
        System.out.println("quatifier:");
        System.out.println(Pattern.matches("[amn]+","aa"));
        System.out.println(Pattern.matches("[amn]+","ammmnn"));
        System.out.println(Pattern.matches("[aman]+","amanaz"));
        System.out.println(Pattern.matches("[anam]*","amaaan"));
        System.out.println(Pattern.matches("\\d","a"));
        System.out.println(Pattern.matches("\\D","1"));
        System.out.println(Pattern.matches("\\w","asd"));
        System.out.println(Pattern.matches("\\W","ASD"));
        System.out.println(Pattern.matches("\\s"," pk"));
        System.out.println(Pattern.matches("\\b","sdnskdns"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","asd4"));


    }
}
