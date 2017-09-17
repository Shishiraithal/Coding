import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class ShortestPath {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		HashMap<Integer, TreeSet<Integer>> graph = new HashMap<>();
		HashMap<String, Integer> weights = new HashMap<>();
		int noOfVertices = scan.nextInt();
		int noOfEdges = scan.nextInt();
		for (int i = 0; i < noOfEdges; i++) {
			int start = scan.nextInt();
			int dest = scan.nextInt();
			int weight = scan.nextInt();
			if (!graph.containsKey(start))
				graph.put(start, new TreeSet<>());
			if (!graph.containsKey(dest))
				graph.put(dest, new TreeSet<>());
			graph.get(start).add(dest);
			graph.get(dest).add(start);
			weights.put(start + "-" + dest, weight);
			weights.put(dest + "-" + start, weight);
		}
		System.out.println(graph);
		System.out.println(weights);
		int source = scan.nextInt();// source
		int dest = scan.nextInt();// dest
		HashSet<Integer> isVisited = new HashSet<>();
		HashMap<Integer, Integer> shortestPathDistance = new HashMap<>();
		HashMap<Integer, Integer> shortestPaths = new HashMap<>();

		// source is already visited,because we are starting from source
		shortestPathDistance.put(source, 0);
		shortestPaths.put(0, 0);
		TreeSet<Edge> pickTheBest = new TreeSet(new Comparator<Edge>() {

			@Override
			public int compare(Edge s, Edge e) {
				return s.weight < e.weight ? -1 : 1;
			}
		});
		// source
		pickTheBest.add(new Edge(source, source, 0));
		//System.out.println(pickTheBest + " ----");
		int j = 0;
		while (isVisited.size() != noOfVertices) {
			// pick adjacent vertices
			Edge currentEdge = pickTheBest.pollFirst();
			int current = isVisited.contains(currentEdge.start) ? currentEdge.end : currentEdge.start;
			//System.out.println(current + " --current");
			Iterator<Integer> adj = graph.get(current).iterator();
			while (adj.hasNext()) {
				int adjacentNode = adj.next();
				//System.out.println(adjacentNode);
				if (!isVisited.contains(current) && !isVisited.contains(adjacentNode)) {
					pickTheBest.add(new Edge(current, adjacentNode, weights.get(current + "-" + adjacentNode)));
					if (!shortestPathDistance.containsKey(adjacentNode))
						shortestPathDistance.put(adjacentNode, Integer.MAX_VALUE);
					int sDistance = Math.min(
							shortestPathDistance.get(current) + weights.get(current + "-" + adjacentNode),
							shortestPathDistance.get(adjacentNode));
					if (sDistance != shortestPathDistance.get(adjacentNode)) {
						shortestPathDistance.put(adjacentNode, sDistance);
						shortestPaths.put(adjacentNode, current);
					}
				}
			}
			isVisited.add(current);
			System.out.println(isVisited.size() + " -visited- " + isVisited);
			System.out.println("pick " + pickTheBest);
			/*
			 * if (j > 10) break; j++;
			 */
		}
		System.out.println("Shortest Path.. from " + source + "-" + dest + " is " + shortestPathDistance.get(dest));
		//System.out.println("Shortest path "+shortestPaths );
		int ind=dest;
		String path="";
		while(true){
			path="->"+ind+""+path;
			if(ind==shortestPaths.get(ind))
				break;
			ind=shortestPaths.get(ind);
		}
		System.out.println("Shortest path "+path);
	}
}

class Edge {
	int start, end, weight;

	Edge(int s, int e, int w) {
		this.start = s;
		this.end = e;
		this.weight = w;
	}

	@Override
	public String toString() {
		System.out.println(this.start + " - " + this.end + " - " + this.weight);
		return super.toString();
	}
}

/*
 * 5 6 0 1 20 0 4 10 1 2 4 1 4 5 4 3 1 2 3 1 0 1
 */