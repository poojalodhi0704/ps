import java.util.Scanner;

/**
 * Created by Mario on 10/23/16.
 */
public class BalancedSubsequence {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        int t=console.nextInt();
        while(t>0)
        {
            String s =console.nextLine();
            char ch []=s.toCharArray();
            int c=0;int c1=0;
            for (int i = 0; i <ch.length ; i++) {
                if(ch[i]=='(')
                {
                    c++;
                }
                else if(ch[i]==')')
                {
                    c1++;
                }


            }
            if(c==c1)
            {
                System.out.println(c+c1);
            }

            t--;
        }
    }
}
