import java.util.Arrays;

/**
 * Created by Mario on 8/27/16.
 */
public class ArrayEx {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7,8,9};
        int len=a.length;
        int i,pos;
        System.out.println("Array is:"+ Arrays.toString(a));
        int searchkey=8;
        for(i=0;i<len;i++)
        {
            if(a[i]==searchkey)
            {
                System.out.println("key found:"+searchkey);
                break;
            }
        }
        if(i==len)
        {
            System.out.println("elememt not found");
        }
        else
        {
            System.out.println("element found at position :-"+i);
        }
    }
}
