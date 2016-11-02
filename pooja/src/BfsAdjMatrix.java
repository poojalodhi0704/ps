import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Mario on 10/26/16.
 */
public class BfsAdjMatrix {
    private Queue<Integer> queue ;
    public BfsAdjMatrix() {
        queue =new LinkedList<Integer>();
    }
    public void bfs(int adjMatrix[][],int source)
    {
        int noofnodes =adjMatrix[source].length-1;
        boolean visited []= new boolean[noofnodes+1];
        visited[source]=true;
        queue.add(source);
        int element ,i;
        while(!queue.isEmpty())
        {
            element =queue.remove();
            i=element;
            System.out.print(i);
            while(i<=noofnodes)

            {
                if(adjMatrix[element][i]==1&&visited[i]==false)
                {
                    queue.add(i);
                    visited[i]=true;
                }
i++;
            }

        }
    }

    public static void main(String...as)
    {
        Scanner console =new Scanner(System.in);
        int t =console.nextInt();
        try
        {
            int m =console.nextInt();//m=no of vertices

            int adjMatrix [][]=new int[m+1][m+1];
            for (int i = 1; i <=m ; i++) {
                for (int j = 1; j <=m ; j++) {
                    adjMatrix[i][j]=console.nextInt();
                }
            }
            int source =console.nextInt();
            BfsAdjMatrix bfm =new BfsAdjMatrix();
            bfm.bfs(adjMatrix,source);

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
