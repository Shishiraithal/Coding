import java.util.Arrays;

public class Graph_FloydWarshallSP {
	private static final Integer INF = 9999;

	public static void main(String[] args) throws Exception {
		int graph[][] = { {0,   5,  INF, 10},
                {INF, 0,   3, INF},
                {INF, INF, 0,   1},
                {INF, INF, INF, 0}
              };
		FloydWarshall fw = new FloydWarshall();
		fw.floydWarshallAllPairSP(graph);
	}
}

class FloydWarshall{
	
	public void floydWarshallAllPairSP(int graph[][]){
		//weighted graph
		int v=graph.length;
		int dist[][]=new int[v][v];
		//intitialize itself distance with 0
		for(int i=0;i<v;i++)
			dist[i][i]=0;
		//assign weight of the edge value
		for(int i=0;i<v;i++){
			for(int j=0;j<v;j++){
				dist[i][j]=graph[i][j];
			}
		}
		//perform dp
		for(int i=0;i<v;i++)
		{
			for(int k=0;k<v;k++)
			{
				for(int j=0;j<v;j++)
				{
					if(dist[i][j]>dist[i][k]+dist[k][j])
						dist[i][j]=dist[i][k]+dist[k][j];
				}
			}
		}
		
		System.out.println(Arrays.deepToString(dist));
	}
	
}

//[[0, 5, 8, 9], [9999, 0, 3, 4], [9999, 9999, 0, 1], [9999, 9999, 9999, 0]]