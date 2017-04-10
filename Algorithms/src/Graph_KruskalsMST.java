import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;


//To find shortest path
public class Graph_KruskalsMST {
	public static void main(String[] args) throws Exception {
		
		/*
		primskstra prims=new primskstra(4); 
		prims.addEdge(0, 1, 2);
		prims.addEdge(0, 3, 1);
		prims.addEdge(1, 2, 1);
		prims.addEdge(2, 3, 1);
		prims.addEdge(1, 0, 2);
		prims.addEdge(3, 0, 1);
		prims.addEdge(2, 1, 1);
		prims.addEdge(3, 2, 1);
		prims.shortestPath(0);*/
		
		int V = 4;  // Number of vertices in graph
        int E = 5;  // Number of edges in graph
        Kruskals graph = new Kruskals(V, E);
 
        // add edge 0-1
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 10;
 
        // add edge 0-2
        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 6;
 
        // add edge 0-3
        graph.edge[2].src = 0;
        graph.edge[2].dest = 3;
        graph.edge[2].weight = 5;
 
        // add edge 1-3
        graph.edge[3].src = 1;
        graph.edge[3].dest = 3;
        graph.edge[3].weight = 15;
 
        // add edge 2-3
        graph.edge[4].src = 2;
        graph.edge[4].dest = 3;
        graph.edge[4].weight = 4;
        
        graph.KruskalMST();
	}
}

class Kruskals{
	int V,E;
	Edge edge[];
	class Edge{
		int src,dest,weight;
	}
	public Kruskals(int v , int e) {
		V=v;
		E=e;
		edge=new Edge[e];
		for(int i=0;i<e;i++)
			edge[i]=new Edge();
	}
	
	public int find(int parent[],int src){
		if(parent[src]==-1)
			return src;
		return find(parent, parent[src]);
	}
	
	public void union(int parent[],int src,int dest){
		int x=find(parent, src);
		int y=find(parent, dest);
		parent[x]=y;
	}
	
	public void KruskalMST(){
		//step1 initialize values
		Edge result[] = new Edge[V];
		int parent[]= new int[V];
		for(int i=0;i<V;i++){
			result[i]=new Edge();
			parent[i]=-1;
		}
		
		//step2 sort all edges by weight
		Arrays.sort(edge,(a,b)->a.weight<b.weight?-1:1);

		for(int i=0,ind=0;i<E;i++){
			int src=edge[i].src;
			int dest=edge[i].dest;
			int weight=edge[i].weight;
			int x=find(parent, src);
			int y=find(parent, dest);
			if(x!=y){
				union(parent, src, dest);
				result[ind].src=src;
				result[ind].dest=dest;
				result[ind].weight=weight;
				ind++;
			}
			if(ind==V-1)
				break;
		}
		
		for(int i=0;i<V-1;i++){
			System.out.println("("+result[i].src+","+result[i].dest+") = "+result[i].weight);
		}
		
	}
}