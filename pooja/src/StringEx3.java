import java.util.Scanner;

/**
 * Created by Mario on 8/29/16.
 */
public class StringEx3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter ur String");
        String n=scanner.nextLine();
        String value="";
        int count=0;
        for (int i = 0; i <n.length() ; i++) {
            final char ch=n.charAt(i);
            for (int j = 0; j <n.length() ; j++) {
                if(ch==n.charAt(j))
                        {
                            count++;
                        }

            }
            if(!(count>0))
            {
                value=value+ch;}
        }
         System.out.println(""+value);

        }
    }

