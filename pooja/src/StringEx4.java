import java.util.Scanner;

/**
 * Created by Mario on 8/29/16.
 */
public class StringEx4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter ur String:");
        String word = scanner.nextLine();
        System.out.println("enter the anagram String:");
        String anagram = scanner.nextLine();
        if (word.length() != anagram.length()) {
            System.out.println("String are not anagram");
        }
        char[] c = word.toCharArray();
        for (char ch : c) {
            int index = anagram.indexOf(ch);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
                System.out.print(anagram);
            }
        }
    }
}
