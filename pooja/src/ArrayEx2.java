import java.util.Scanner;

/**
 * Created by Mario on 8/27/16.
 */
public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of Elements :--");
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] a = new int[n][m];
        System.out.println("Enter the elements:-");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                a[i][j] = s.nextInt();

            }

        }
        System.out.println("Elements Are:--");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(a[i][j]);
                
            }
            
        }

        }
    }
