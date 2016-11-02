import java.util.Scanner;

/**
 * Created by Mario on 11/2/16.
 */
public class BabyStep {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        int q=console.nextInt();
        while(q>0)
        {
            int a=console.nextInt();
            int b=console.nextInt();
            int d=console.nextInt();
            int max =Math.max(a,b);
            int min =Math.min(a,b);
            int startPoint=0;
            int count =0;
            int flag =0;
            for ( int i = 0; i <Math.random() ; i++) {


                startPoint+=max;
                count++;
                if(startPoint==d)
                {
                    flag=1;

                    break;

                }
                else
                {
                    if(startPoint>d)
                    {
                        startPoint-=max;
                        startPoint+=min;
                        if(startPoint==d)
                        {
                            flag=1;
                            break;
                        }

                    }
                }

            }
            if(flag==1)
            {
                System.out.println(count);
            }
            q--;
        }
    }
}
