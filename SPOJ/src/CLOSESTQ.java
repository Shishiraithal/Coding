import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeMap;
import java.util.TreeSet;

class CLOSESTQ {
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
	// static HashMap<Integer, HashSet<Integer>> store;
	static ArrayList<Integer> storeX;
	static ArrayList<Integer> storeY;
	static HashMap<Integer, HashSet<Integer>> removed;

	private static void solve() throws Exception {

		int t = readInt();
		removed = new HashMap<>();
		storeX = new ArrayList<>();
		storeY = new ArrayList<>();
		for (int test = 1; test <= t; test++) {
			String str[] = readStrArr();
			if (str[0].equals("+")) {
				// add
				int x = Integer.parseInt(str[1]);
				int y = Integer.parseInt(str[2]);
				/*
				 * if(!store.containsKey(x)) store.put(x,new HashSet<>());
				 * store.get(x).add(y);
				 */
				storeX.add(x);
				storeY.add(y);
				// System.out.println(store+" "+Arrays.toString(str));
			} else {
				// delete
				// System.out.println(store+" "+Arrays.toString(str));
				int x = Integer.parseInt(str[1]);
				int y = Integer.parseInt(str[2]);
				if (!removed.containsKey(x))
					removed.put(x, new HashSet<>());
				removed.get(x).add(y);
			}
			pw.println(perform());
			// output.append(test + "\n");
		}
		outputConsole();
		// outputFile();
	}

	private static long perform() {

		long min = Long.MAX_VALUE;
		// long now=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
		/*System.out.println(storeX);
		System.out.println(storeY);
		System.out.println(removed);*/
		for (int i = 0; i < storeX.size(); i++) {
			for (int j = i + 1; j < storeX.size(); j++) {
				if (removed.containsKey(storeX.get(i)) && removed.get(storeX.get(i)).contains(storeY.get(i)))
					break;
				if (removed.containsKey(storeX.get(j)) && removed.get(storeX.get(j)).contains(storeY.get(j)))
					continue;
				else {
					// System.out.println(storeX.get(i)+" "+storeX.get(j)+" "+storeY.get(i)+" "+storeY.get(j));
					long now = (storeX.get(i) - storeX.get(j)) * (storeX.get(i) - storeX.get(j))
							+ (storeY.get(i) - storeY.get(j)) * (storeY.get(i) - storeY.get(j));
					if ((now != 0 && now < min))
						min = now;
				}
			}
		}

		if (min == Long.MAX_VALUE)
			return 0;
		else
			return min;
	}

	class points {
		int x, y;

		public void points(int x1, int y1) {
			x = x1;
			y = y1;
		}
	}
}
