import java.util.Scanner;

/**
 * Created by Mario on 8/27/16.
 */
public class ArrayEx3 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no of Elements:-");
        int number = scanner.nextInt();
        int []array=new int[number];

        System.out.println("Enter the elements:-");
        for (int i = 0; i <number ; i++) {
            array[i]=scanner.nextInt();


        }
        System.out.print("Elements are:-");
        for (int i:array) {
            System.out.print(i+",");

        }
        ArrayEx3 a1=new ArrayEx3();
        System.out.println("Sorted array:-");
        a1.sort(array);
        for (int i:array) {
            System.out.print(i+",");

        }

    }
     public void sort(int []array) {
        if (array == null || array.length == 0) {
            return;
        }
        int len =array.length;
        quickSort(0, len - 1,array);
    }
    public void quickSort(int low , int high,int []array)
    {
        int i=low;
        int j=high;
        int pivot = array[ low+(high-low)/2];
        while(i<j)
        {
            while(array[i]<pivot)
            {
                i++;
            }
            while(array[j]<pivot)
            {
                j--;
            }
            if(i<=j)
            {
                exchangeNumbers(i,j);
                i++;
                j--;
            }

        }
        if(low<j)
        {
            quickSort(low,j,array);
        }
        if(i<high)
        {
            quickSort(i,high,array);
        }


    }
    public void exchangeNumbers(int i,int j)
    {
        int temp;
        temp=i;
        i=j;
        j=temp;
    }
}
