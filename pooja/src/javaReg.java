/**
 * Created by Mario on 8/22/16.
 */
import java.util.regex.*;

public class javaReg {
    public static void main(String...as)
    {
       Pattern p=Pattern.compile(".s");
        Matcher m=p.matcher("as");
        boolean b=m.matches();
        boolean b2=Pattern.compile(".s").matcher("as").matches();
        boolean b1=Pattern.matches(".s","as");
        System.out.println(b+" "+b1+" "+b2);
        System.out.println(Pattern.matches("[amn]","a"));


    }
}
