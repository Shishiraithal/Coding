import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;


public class Graph_BFS {
	public static void main(String[] args) throws Exception {

			GraphBFS g = new GraphBFS(4);
			 
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	 
	        System.out.println("Following is Breadth First Traversal "+
	                           "(starting from vertex 2)");
	 
	        g.BFS(2);
			
	}
}

class GraphBFS{
	int V;
	//Graph contains vertices from 1 to n
	LinkedList [] Graph;

	GraphBFS(int vertices){
		//initializing graph with '# of vertices V'
		this.V=vertices;
		Graph = new LinkedList[vertices+1];
		//Graph contains vertices from 1 to n
		/*for(int i=1;i<=vertices;i++){
			Graph[i]=new LinkedList<>();
		}*/
		//Graph contains vertices from 0 to n-1
		for(int i=0;i<vertices;i++){
			Graph[i]=new LinkedList<>();
		}
	}
	
	public void addEdge(int source,int destination){
		//Graph contains vertices from 1 to n
		Graph[source].add(destination);
	}
	
	public void BFS(int source){
		//Graph contains vertices from 1 to n
		boolean visited[] =new boolean[V+1];
		visited[source]=true;
		LinkedList<Integer> Queue = new LinkedList<Integer>();
		Queue.add(source);
		while(Queue.size()>0){
			int current = Queue.poll();
			System.out.println(current);
			Iterator<Integer> adjacent = Graph[current].iterator();
			while(adjacent.hasNext()){
				int adjacentNode = adjacent.next();
				if(!visited[adjacentNode]){//unvisited node
					visited[adjacentNode]=true;
					Queue.add(adjacentNode);
				}
			}
		}
	}	
}
