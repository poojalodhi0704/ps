import java.io.*;
import java.util.*;

public class BabyStep {

    public static void main(String[] args) {

        Scanner console= new Scanner(System.in);
        int q = console.nextInt();
        long results;
        while (q>0) {
            for (int i = 0; i < q; i++) {
                int a = console.nextInt();
                int b = console.nextInt();
                int d = console.nextInt();

                results = Count(a, b, d);
                System.out.println(results);
                q--;
            }

        }
    }

    private static long Count(long a, long b, long d)
    {
        long max =Math.max(a,b);
        if (d == 0)
            return 0;
        if (d < a)
            if(d != b)
                return 2;
            else
                return 1;
        if(d < b)
            if(d != a)
                return 2;
            else
                return 1;

        return (long)(d % max) == 0 ? (long)(d / max) : (long)(d / max) + 1;

    }
}
