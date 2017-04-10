import java.util.Arrays;

//To find disjoint sets..Cycle in graph or not
public class DS_UnionFind {
	public static void main(String[] args) throws Exception {
		int V = 3, E = 3;
		UnionFind graph = new UnionFind(V, E);

		// add edge 0-1
		graph.edge[0].src = 0;
		graph.edge[0].dest = 1;

		// add edge 1-2
		graph.edge[1].src = 1;
		graph.edge[1].dest = 2;

		// add edge 0-2
		graph.edge[2].src = 0;
		graph.edge[2].dest = 2;

		if (graph.isCycle(graph) == 1)
			System.out.println("graph contains cycle");
		else
			System.out.println("graph doesn't contain cycle");
	}
}

class UnionFind{
	int V,E;
	Edge edge[];
	class Edge{
		int src,dest;
	}
	public UnionFind(int v,int e) {
		V=v;//#of vertices
		E=e;//#of edges
		edge=new Edge[e];
		for(int i=0;i<e;i++)
			edge[i]=new Edge();
	}
	
	public int find(int parent[],int node){
		if(parent[node]==-1)
			return node;
		return find(parent,parent[node]);
	}
	
	public void union(int parent[],int source,int destination){
		int sourceSet = find(parent, source);
		int destSet = find(parent,destination);
		parent[sourceSet]=destSet;
	}
	
	public int isCycle(UnionFind graph){
		
		int vertices = graph.V;
		//make set with #of vertices and initialize with -1 as parent..-1 means itself
		int parent[]=new int[vertices];
		for(int i=0;i<vertices;i++)
			parent[i]=-1;
		
		//pick each edge and check can edge make any cycle or not
		int edges=graph.E;
		for(int i=0;i<edges;i++){
			System.out.println(graph.edge[i].src+" ->source,"+graph.edge[i].dest+"->dest");
			int source=find(parent,graph.edge[i].src);
			int dest=find(parent,graph.edge[i].dest);
			System.out.println(source+" "+dest+" "+Arrays.toString(parent));
			if(source==dest)
				return 1;//cycle present
			union(parent, source, dest);
		}
		return 0;
	}
}