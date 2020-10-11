package graphs;
import java.util.*;

public class graphs
{
    private LinkedList<Integer> adj[];

    public Graph(int v){
        adj = new LinkedList[v];
        for(int i = 0;i<v;i++)
        {
            adj[i] = new LinkedList<Integer>();
        }
    }
    public void addEdge(int source, int destination)
    {
        ajd[source].add(destination);
        adj(destination).add(source);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter V and E:");
        int v = sc.nextInt();
        int e = sc.nextInt();
    }

}