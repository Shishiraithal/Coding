import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TorqueAndDevelopment {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int n = in.nextInt();
			int m = in.nextInt();
			long x = in.nextLong();
			long y = in.nextLong();
			HashMap<Integer, HashSet<Integer>> graph = new HashMap<>();
			for (int a1 = 0; a1 < m; a1++) {
				int city_1 = in.nextInt();
				int city_2 = in.nextInt();
				if (!graph.containsKey(city_1))
					graph.put(city_1, new HashSet<>());
				if (!graph.containsKey(city_2))
					graph.put(city_2, new HashSet<>());
				graph.get(city_1).add(city_2);
				graph.get(city_2).add(city_1);
			}
			if (x <= y) {
				System.out.println((n) * x);
			} else {
				HashSet<Integer> visited = new HashSet<>();
				long output = 0;
				for (int node = 1; node <= n; node++) {
					if (!visited.contains(node)) {
						Stack<Integer> dfs = new Stack<>();
						dfs.push(node);
						visited.add(node);
						long graphCount = 0;
						while (!dfs.isEmpty()) {
							graphCount++;
							int currentNode = dfs.pop();
							Iterator<Integer> nbrNodes = null;
							if(graph.containsKey(currentNode))
							nbrNodes= graph.get(currentNode).iterator();
							while (nbrNodes!=null && nbrNodes.hasNext()) {
								int nbrNode = nbrNodes.next();
								if (!visited.contains(nbrNode)) {
									dfs.push(nbrNode);
								}
								visited.add(nbrNode);
							}
						}
						// System.out.println("gcount " + graphCount);
						if(graphCount>0)
							output += ((graphCount - 1) * y + x);
					}
				}
				System.out.println(output);
			}
		}
	}
}
