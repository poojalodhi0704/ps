import java.util.Scanner;

/**
 * Created by Mario on 8/28/16.
 */
public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the no of elements of array n");
        int n=scanner.nextInt();
        int []a=new int[n];
        System.out.println("Enter the elements of n:-");
        for (int i = 0; i <n ; i++) {
            a[i]=scanner.nextInt();

        }
        System.out.println("enter the no of elements of array m:");
        int m =scanner.nextInt();
        int []b=new int[m];
        System.out.println("Enter the elements of m:-");
        for (int j = 0; j<m ; j++) {
            b[j]=scanner.nextInt();

        }

        System.out.println("Elements of m is:-");
        for (int j:b) {
            System.out.println(b[j]);

        }

       }
}
