import java.util.Scanner;

/**
 * Created by Mario on 11/1/16.
 */
public class Greedy1 {
    private void activitySelection(int s[],int f[],int activity)
    {
        int i ;
        i=0;
        System.out.print(i);
        for (int j = 1; j <activity ; j++) {
            if(s[j]>=f[i])
            {
                System.out.print(j);
                i=j;
            }
            else {
                continue;
            }


        }
    }
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        int activities =console.nextInt();
        int Starttime [] =new int[activities];
        int finishTime []=new int [activities];
        for (int i = 0; i <activities ; i++) {
            Starttime[i]=console.nextInt();
            finishTime[i]=console.nextInt();
        }
        Greedy1 g =new Greedy1();
        g.activitySelection(Starttime,finishTime,activities);

    }
}
