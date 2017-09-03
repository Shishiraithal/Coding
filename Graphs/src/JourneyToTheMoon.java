import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class JourneyToTheMoon {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
	static PrintWriter outputFile;
	static StringBuilder output = new StringBuilder("");

	// 0-D
	private static int readInt() throws NumberFormatException, IOException {
		return Integer.parseInt(br.readLine().trim());
	}

	private static long readLong() throws NumberFormatException, IOException {
		return Long.parseLong(br.readLine().trim());
	}

	private static String readStr() throws NumberFormatException, IOException {
		return br.readLine().trim();
	}

	private static float readFloat() throws NumberFormatException, IOException {
		return Float.parseFloat(br.readLine().trim());
	}

	private static double readDouble() throws NumberFormatException, IOException {
		return Double.parseDouble(br.readLine().trim());
	}

	private static char readChar() throws NumberFormatException, IOException {
		return br.readLine().trim().charAt(0);
	}

	// 1-D
	private static String[] readStrArr() throws NumberFormatException, IOException {
		return br.readLine().trim().split(" ");
	}

	private static int[] readIntArr() throws NumberFormatException, IOException {
		String[] sarr = readStrArr();
		int arr[] = new int[sarr.length];
		int i = 0;
		for (String str : sarr)
			arr[i++] = Integer.parseInt(str.trim());
		return arr;
	}

	private static long[] readLongArr() throws NumberFormatException, IOException {
		String[] sarr = readStrArr();
		long arr[] = new long[sarr.length];
		int i = 0;
		for (String str : sarr)
			arr[i++] = Long.parseLong(str.trim());
		return arr;
	}

	private static float[] readFloatArr() throws NumberFormatException, IOException {
		String[] sarr = readStrArr();
		float arr[] = new float[sarr.length];
		int i = 0;
		for (String str : sarr)
			arr[i++] = Float.parseFloat(str.trim());
		return arr;
	}

	private static double[] readDoubleArr() throws NumberFormatException, IOException {
		String[] sarr = readStrArr();
		double arr[] = new double[sarr.length];
		int i = 0;
		for (String str : sarr)
			arr[i++] = Double.parseDouble(str.trim());
		return arr;
	}

	// 2-D
	private static String[][] readStrMatrix(int n, int m) throws NumberFormatException, IOException {
		String str[][] = new String[n][m];
		int _n = n, i = 0;
		while (_n-- > 0) {
			str[i++] = br.readLine().trim().split(" ");
		}
		return str;
	}

	private static int[][] readIntMatrix(int n, int m) throws NumberFormatException, IOException {
		int arr[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			arr[i] = readIntArr();
		}
		return arr;
	}

	private static long[][] readLongMatrix(int n, int m) throws NumberFormatException, IOException {
		long arr[][] = new long[n][m];
		for (int i = 0; i < n; i++) {
			arr[i] = readLongArr();
		}
		return arr;
	}

	private static float[][] readFloatMatrix(int n, int m) throws NumberFormatException, IOException {
		float arr[][] = new float[n][m];
		for (int i = 0; i < n; i++) {
			arr[i] = readFloatArr();
		}
		return arr;
	}

	private static double[][] readDoubleMatrix(int n, int m) throws NumberFormatException, IOException {
		double arr[][] = new double[n][m];
		for (int i = 0; i < n; i++) {
			arr[i] = readDoubleArr();
		}
		return arr;
	}

	// OUTPUT
	// save output in a file
	public static void outputFile() throws FileNotFoundException {
		// path of output file /home/binjarapu/Desktop/CodeOutputs
		outputFile = new PrintWriter(new FileOutputStream(new File("/home/binjarapu/Desktop/CodeOutputs/output.txt")));
		outputFile.println(output);
		outputFile.flush();
		outputFile.close();
	}

	// show console output
	public static void outputConsole() throws FileNotFoundException {
		pw.print(output);
		pw.flush();
		pw.close();
	}

	public static void main(String[] args) throws Exception {
		solve();
	}

	// CodeJam format pw.println("Case #" + test + ":");
	// append output with output globale variable
	private static void solve() throws Exception {

		int tarr[] = readIntArr();
		int n=tarr[0],t=tarr[1];
		HashMap<Integer,HashSet<Integer>> graph=new HashMap<>();
		for(int i=0;i<n;i++)
			graph.put(i, new HashSet<Integer>());
		for (int test = 1; test <= t; test++) {
			tarr=readIntArr();
			graph.get(tarr[0]).add(tarr[1]);
			graph.get(tarr[1]).add(tarr[0]);
		}
		// System.out.println(graph);
		
		//iterate all vertices
		ArrayList<Long> connects=new ArrayList<Long>();
		long totalConnected=0;
		HashSet<Integer> visited=new HashSet<Integer>();
		for(int i=0;i<n;i++){
			Stack<Integer> connect=new Stack<>();
			if(!visited.contains(i) &&  graph.get(i).size()>0){
				visited.add(i);
				connect.add(i);
				long countConnected=0;
				while(!connect.isEmpty()){
					countConnected++;
					int nnode=connect.pop();
					Iterator<Integer> neighbours=graph.get(nnode).iterator();
					while(neighbours.hasNext()){
						int nei=neighbours.next();
						if(!visited.contains(nei)){
							visited.add(nei);
							connect.push(nei);
						}
					}
				}
			//	System.out.println(countConnected);
				connects.add(countConnected);
				totalConnected+=countConnected;
			}
		}
		
		long notConnected=n-totalConnected;
		//System.out.println(notConnected);
		connects.add(notConnected);
		long val=0;
		for(int i=0;i<connects.size();i++){
			for(int j=i+1;j<connects.size();j++){
				val+=(connects.get(i)*connects.get(j));
			}
		}
		val+=((notConnected*(notConnected-1))/2);
		if(t==0)
			output.append(n*(n-1));
		else
			output.append(val);
		outputConsole();
		// outputFile();
	}
}
/*
5 3
0 1
2 3
0 4
*/