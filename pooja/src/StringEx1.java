import java.util.Scanner;

/**
 * Created by Mario on 8/28/16.
 */
public class StringEx1 {
    public static void main(String[] args) {

        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ur name:");
        name = scanner.nextLine();
        System.out.println("ur name :-" + name);

        char[]ch={'a','b','c','d','e','f'};
        String s= new String( ch, 2,3);
        System.out.println(s);
        String s1="pooja";
        System.out.println("String:-"+s1);
        System.out.println(name.length());
        String s2="this is my program of string."+"String litrals,"+"and always allow to find";
        System.out.println(s2);

    }
}
