/**
 * Created by Mario on 8/22/16.
 */
public class StringMethod {
    public static void main(String...as)
    {
        String s="pooja loves kumar vikramaditya. He is an idiot";

        String s1="PAOSDJKDJFFJFJSKJFSKJSK";
        System.out.println(""+s);

        System.out.println(s.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s.charAt(4));
        System.out.println(s.length());
        System.out.println(s.replace("kumar","bimar"));
        System.out.println(s.startsWith("po"));
        System.out.println(s.endsWith("ot"));
        int a=12;
        String s2=String.valueOf(a);
        System.out.println(a+s2);




    }
}
