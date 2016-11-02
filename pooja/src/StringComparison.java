/**
 * Created by Mario on 8/22/16.
 */
public class StringComparison {
    public static void main(String...as)
    {
        String s1="pooja";
        String s2="pooja";
        String s3="POOJA";
        String s4="aadi";
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareToIgnoreCase(s4));
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.concat(s2));

    }
}
