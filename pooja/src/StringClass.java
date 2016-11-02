/**
 * Created by Mario on 8/28/16.
 */
public class StringClass {
    public static void main(String[] args) {
        String s="pooja";
        StringBuffer sb=new StringBuffer(s);
        System.out.println(""+sb);
        System.out.println(""+sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(4));
        System.out.println(sb.append(s));

    }
}
