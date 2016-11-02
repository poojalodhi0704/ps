
/**
 * Created by Mario on 8/28/16.
 */
 class Box
{
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public String toString()
    {
        return "Dimensions are" +width+" by"+height+"by"+depth;
    }
}
public class StringEx {
    public static void main(String[] a) {
        StringBuffer sb = new StringBuffer("hello");
        Box b = new Box(11.0,12.00,13.00);
        String s= "Box b:-"+b;
        System.out.println(s);
        String s1="pooja is in love ";
        String s2="pooja";
        System.out.println(s1.codePointAt(3));
        System.out.println(s1.codePointBefore(3));
        System.out.println(s1.codePointCount(1,4));
        System.out.println(s1.contains(s2));
        System.out.println(s1.contentEquals(s2));
        System.out.println(s2.isEmpty());
        System.out.println(s1.offsetByCodePoints(0 ,8));
        sb.capacity();


    }
}