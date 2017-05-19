import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

class CLIQUED1 {

	private long distances[];
	private Queue<Integer> queue;
	private Set<Integer> settled;
	private int number_of_nodes;
	// private int adjacencyMatrix[][];
	LinkedList graph[];
	Hashtable<Integer, Hashtable<Integer, Long>> weight;
	int size;
	int K, weightK;

	public CLIQUED1(int number_of_nodes, int n, int k, int x) {
		this.number_of_nodes = number_of_nodes;
		distances = new long[number_of_nodes + 1];
		settled = new HashSet<Integer>();
		queue = new LinkedList<Integer>();
		// adjacencyMatrix = new int[number_of_nodes + 1][number_of_nodes + 1];
		size = n;
		graph = new LinkedList[size];
		K = k;
		weightK = x;
		weight = new Hashtable<Integer, Hashtable<Integer, Long>>();

		for (int i = 0; i < size; i++) {
			graph[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int source, int destination, long edgeWeight) {
		// edge with weight
		graph[source].add(destination);
		graph[destination].add(source);

		if (!weight.containsKey(source))
			weight.put(source, new Hashtable<>());

		if (!weight.containsKey(destination))
			weight.put(destination, new Hashtable<>());

		weight.get(source).put(destination, edgeWeight);
		weight.get(destination).put(source, edgeWeight);
	}

	public void dijkstra_algorithm(int source) {
		int evaluationNode;
		if(source<K)
		for(int i=0;i<K;i++)
			distances[i]=weightK;
		else
			for(int i=0;i<K;i++)
				distances[i]=Long.MAX_VALUE;
		for(int i=K;i<size;i++)
			distances[i]=Long.MAX_VALUE;
	
		queue.add(source);
		distances[source] = 0;

		while (!queue.isEmpty()) {
			evaluationNode = getNodeWithMinimumDistanceFromQueue();
			settled.add(evaluationNode);
			evaluateNeighbours(evaluationNode);
		}
	}

	private int getNodeWithMinimumDistanceFromQueue() {
		long min;
		int node = 0;
		Iterator<Integer> iterator = queue.iterator();
		node = iterator.next();
		min = distances[node];

		for (int i = 1; i <= distances.length; i++) {
			if (queue.contains(i)) {
				if (distances[i] <= min) {
					min = distances[i];
					node = i;
				}
			}
		}
		queue.remove(node);
		return node;
	}

	private void evaluateNeighbours(int evaluationNode) {
		long edgeDistance = -1;
		long newDistance = -1;

		for (int destinationNode = 1; destinationNode <= number_of_nodes; destinationNode++) {
			if (!settled.contains(destinationNode)) {
				if (graph[evaluationNode].contains(destinationNode)) {
					edgeDistance = weight.get(evaluationNode).get(destinationNode);
					newDistance = distances[evaluationNode] + edgeDistance;
					if (newDistance < distances[destinationNode]) {
						distances[destinationNode] = newDistance;
					}
					queue.add(destinationNode);
				}
			}
		}
	}

	public static void main(String... arg) throws IOException {
		int adjacency_matrix[][];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			// code
			int n = Integer.parseInt(str[0].trim()), k = Integer
					.parseInt(str[1].trim()), x = Integer.parseInt(str[2]
					.trim()), m = Integer.parseInt(str[3].trim()), s = Integer
					.parseInt(str[4].trim()) - 1;

			// V=n;
			int number_of_vertices = n;
			int source = s;

			// Dijkstra dij=new Dijkstra(n,k,x);
			CLIQUED1 dijkstrasQueue = new CLIQUED1(number_of_vertices, n, k, x);
			int _m = m;
			while (_m-- > 0) {
				str = br.readLine().trim().split(" ");
				int a = Integer.parseInt(str[0].trim()) - 1;
				int b = Integer.parseInt(str[1].trim()) - 1;
				long c = Long.parseLong(str[2].trim());
				dijkstrasQueue.addEdge(a, b, c);
			}
			// print
			// System.out.println(dij.weight);
			dijkstrasQueue.dijkstra_algorithm(s);

			for (int i = 1; i <= dijkstrasQueue.distances.length - 1; i++) {
				//System.out.println(source + " to " + i + " is "
					//	+ dijkstrasQueue.distances[i]);
				System.out.print(dijkstrasQueue.distances[i]+" ");
			}
			System.out.println();
		}
	}
}