import java.util.Scanner;

/**
 * Created by Mario on 10/23/16.
 */
public class Solution1 {
    public static long gcd(long a,long b)
    {
        if(b==0)
        {
            return a;
        }
        else{
            return gcd(b,a%b);}
    }
    public static long findLcm(long arr[],int n)
    {
        long ans =arr[0];
        for (int i = 1; i <n ; i++) {
        ans =((arr[i]*ans)/(gcd(arr[i],ans)));

        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner console =new Scanner(System.in);
       try {
           int t = console.nextInt();
           while (t > 0) {
               int n = console.nextInt();
               int k = console.nextInt();
               long arr[] = new long[n];
               for (int i = 0; i < n; i++) {
                   arr[i] = console.nextLong();

               }
               for (int i = 0; i <n ; i++) {
                   if(arr[i]<=0)
                   {
                       System.out.println("NO");
                       break;

                   }
                   else
                   {
                       continue;
                   }


               }
               long result = findLcm(arr, n);
               if (result % k == 0) {
                   System.out.println("YES");
               } else {
                   System.out.println("NO");
               }
               t--;
           }
       }catch (Exception e)
       {
           System.out.println(e);
       }
    }
}
