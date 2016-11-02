

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Mario on 8/27/16.
 */
public class ArrayEx1 {
    public static void main(String[] args) {
        int u, x, sk,n,flag=1,loc=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of elements:-");
        n=s.nextInt();
        int a[]=new int[n];

        System.out.println("enter the elements");
        for (int i = 0; i <n ; i++) {
            a[i]=s.nextInt();

        }
        System.out.print("elements are:");
        for (int i:a) {
            System.out.println(i);

        }

        System.out.println("enter the element, you want to search:");
        sk=s.nextInt();
        for ( int i = 0; i <n ; i++) {
            if(a[i]==sk)
            {
                System.out.println("element found:-"+sk);
                break;
            }

        }
        for (int i = 0; i <n ; i++) {

            if (i == n) {
                System.out.println("element not found");
            }


        }
        System.out.println("Enter the element that u want to delete:-");
        x=s.nextInt();

        for (int i = 0; i <n ; i++) {
            if (a[i] == x) {
                flag = 1;
                loc = i;
                break;
            } else {
                flag = 0;
            }
        }
            if(flag==1)
            {
                for (int i= loc+1; i <n ; i++) {
                    a[i-1]=a[i];
                }
                System.out.println("After deleting an element");
                for (int i = 0; i < n-2; i++) {
                    System.out.print(a[i]+",");
                    
                }
                System.out.println(a[n-2]);
            }else
            {
                System.out.println("element not found");

        }







        }


        }



