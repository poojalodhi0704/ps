import java.util.Scanner;

/**
 * Created by Mario on 11/1/16.
 */
public class Solution4545 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        String t = console.nextLine();
        int k = console.nextInt();
        int count = 0,count1;
        char ch1[] = s.toLowerCase().toCharArray();
        char ch2[] = t.toLowerCase().toCharArray();
        int length = Math.min(s.length(), t.length());
        for (int i = 0; i < length; i++) {
            if (ch1[i] == ch2[i]) {
                count++;
            } else {
                break;
            }
        }
        int s_length=ch1.length;
        int t_length=ch2.length;
        int s_delete,s_append;
        s_append=t_length-count;
        s_delete=s_length-count;
        // int total_count =s_append+s_delete;
        // int sub =k-total_count;
        if(k>=s_length+t_length)
        {


                count = s_length;
                count1 = count + 1;
                s_delete = count1;
                s_append = count;

        }
        if(k==s_length+t_length)
        {
            count=s_length;
            s_delete=count;
            s_append=count;
        }
        int total_count =s_append+s_delete;
        int sub =k-total_count;

        if(k>s_length+t_length)
        {
            System.out.println("Yes");
        }
        else
        {
            if(k==total_count)
            {
                System.out.println("Yes");
            }
            else if(total_count<k)
            {
                if(count%2==0)
                {
                    if(sub%2==0)
                    {
                        System.out.println("Yes");
                    }
                    else
                    {
                        System.out.println("No");
                    }
                }
                else
                {
                    if(sub%2!=0)
                    {
                        System.out.println("No");
                    }
                    else
                    {
                        System.out.println("Yes");
                    }
                }
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}

