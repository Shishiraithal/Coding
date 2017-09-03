package Algos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/*input
7
6
1 2
2 4
2 5
3 2
4 7
5 6
*/

public class TopologicalSort {
	public static void main(String[] args) {
		String   a=new String("a");
		String b=new String("a");
		System.out.println(a.hashCode()+" "+b.hashCode());
		System.out.println(a=b);
		Scanner scan=new Scanner(System.in);
		
		int n= scan.nextInt();// #of nodes
		int e=scan.nextInt();//#of edges
		
		HashMap<Integer,HashSet<Integer>> graph=new HashMap<>();
		while(e-->0){
			int s=scan.nextInt(),d=scan.nextInt();
			if(!graph.containsKey(s)){
				graph.put(s,new HashSet<Integer>());
			}
			graph.get(s).add(d);
		}
		System.out.println(graph);
		
		//Topological sort using loops(2stacks and set)
		topologicalSortUsingLoops(graph);
		
		HashSet<Integer> visited=new HashSet<>();
		Stack<Integer> topologicalOrder=new Stack<Integer>();
		Iterator<Integer> nodes=graph.keySet().iterator();
		while(nodes.hasNext()){
			int node=nodes.next();
			if(!visited.contains(node)){
				dfsGraph(node,graph);
			}
			
			
			
			
		}
	}
	
	private static void dfsGraph(int node, HashMap<Integer, HashSet<Integer>> graph) {
		
		
	}


	private static void topologicalSortUsingLoops(HashMap<Integer, HashSet<Integer>> graph) {
		HashSet<Integer> visited=new HashSet<>();
		Stack<Integer> topologicalOrder=new Stack<Integer>();
		Iterator<Integer> nodes=graph.keySet().iterator();
		while(nodes.hasNext()){
			int node=nodes.next();
			if(!visited.contains(node)){
				Stack<Integer> dfs=new Stack<Integer>();
				dfs.push(node);
				while(!dfs.isEmpty()){
					// System.out.println("stuck "+dfs);
					int exporingNode=dfs.peek();
					if(graph.containsKey(exporingNode)){
						Iterator<Integer> neighbourNodes = graph.get(exporingNode).iterator();
						boolean visitedFlag=false;
						while(neighbourNodes.hasNext()){
							int neighbourNode = neighbourNodes.next();
							if(!visited.contains(neighbourNode)){
								visited.add(neighbourNode);
								dfs.push(neighbourNode);
								visitedFlag=true;
							}
						}
						if(!visitedFlag){
							topologicalOrder.push(dfs.pop());//exporingNode
						}
					}
					else
						topologicalOrder.push(dfs.pop());//exporingNode
				}
			}
		}
		//print
		while(!topologicalOrder.isEmpty()){
			System.out.print(topologicalOrder.pop()+", ");
		}
	}
}