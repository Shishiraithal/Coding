import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class BuidDependencies {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int nOfVertices = scan.nextInt();
		int nOfEdges = scan.nextInt();
		HashMap<Integer, TreeSet<Integer>> graph = new HashMap<>();
		for (int i = 1; i <= nOfVertices; i++)
			graph.put(i, new TreeSet<>());

		for (int i = 0; i < nOfEdges; i++) {
			int start = scan.nextInt();
			int end = scan.nextInt();
			graph.get(start).add(end);
		}
		System.out.println("graph" + graph);
		// while(stack.size()!=nOfVertices){}
		Stack<Integer> stack = new Stack<>();
		HashSet<Integer> isVisited = new HashSet<>();
		Stack<Integer> dfs = new Stack<>();
		Iterator<Integer> nodes = graph.keySet().iterator();
		while (nodes.hasNext()) {
			int currentNode = nodes.next();
			System.out.println(currentNode+" --"+isVisited);
			dfs=new Stack<>();
			dfs.add(currentNode);
			ArrayList<Integer> queue = new ArrayList<Integer>();
			if (!isVisited.contains(currentNode)) {
				System.out.println(dfs+" "+queue);
				while (dfs.size() != 0) {
					currentNode = dfs.pop();
					queue.add(currentNode);
					// stack.push(currentNode);
					isVisited.add(currentNode);
					Iterator<Integer> adjNodes = graph.get(currentNode).iterator();
					while (adjNodes.hasNext()) {
						int adjNode = adjNodes.next();
						if (!isVisited.contains(adjNode)) {
							isVisited.add(adjNode);
							dfs.push(adjNode);
						}
					}
				}
				System.out.println(queue);
				for (int i = queue.size()-1; i >=0;i--) {
					stack.add(queue.get(i));
				}
			}
		}
		System.out.println(graph);
		System.out.println(dfs);
		System.out.println(stack);
		while(!stack.isEmpty())
			System.out.println(stack.pop());
	}
}