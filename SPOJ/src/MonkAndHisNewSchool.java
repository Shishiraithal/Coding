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
import java.util.Iterator;

class MonkAndHisNewSchool {
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

		int arr[] = readIntArr();
		int dist = arr[0], k = arr[1], cost = arr[2];
		arr = readIntArr();
		int narr[] = new int[k + 1];
		for (int i = 0; i <= k; i++) {
			if (i >= k)
				narr[i] = dist - arr[i - 1];
			else if (i - 1 >= 0)
				narr[i] = arr[i] - arr[i - 1];
			else
				narr[i] = arr[i];

		}
		
		/*
		 * while(cost-->0){ int maxind=0,max=Integer.MIN_VALUE; for(int
		 * i=0;i<=k;i++){ if(max<narr[i]) { max=narr[i]; maxind=i; } }
		 * narr[maxind]--; if(maxind-1>=0) narr[maxind-1]++; else break; //
		 * System.out.println(Arrays.toString(narr)); }
		 */
		/*int max = Integer.MIN_VALUE;
		for (int i = 0; i <= k; i++) {
			if (max < narr[i]) {
				max = narr[i];
			}
		}*/
		output.append(recsol(cost, narr));
		// System.out.println(Arrays.toString(narr));
		outputConsole();
		// outputFile();
	}

	private static int recsol(int cost, int[] narr) {
		if (cost == 0) {
			// min value
			int max = Integer.MIN_VALUE;
			int k = narr.length;
			for (int i = 0; i < k; i++) {
				if (max < narr[i]) {
					max = narr[i];
				}
			}
			return max;
		} else {
			ArrayList<Integer> maxind = new ArrayList<>();
			int max = Integer.MIN_VALUE;
			int k = narr.length;
			for (int i = 0; i < k; i++) {
				if (max < narr[i]) {
					max = narr[i];
					maxind=new ArrayList<>();
					maxind.add(i);
				}
				else if(max==narr[i])
					maxind.add(i);
			}
			int min=Integer.MAX_VALUE;
			for(int a:maxind){
				if(a-1>=0){
					narr[a-1]++;
					narr[a]--;
					int nv=recsol(cost-1, narr);
					if(nv<min)
						min=nv;
					narr[a]++;
					narr[a-1]--;
				}
				else{
					return narr[a];
				}
			}
			return min;
		}
	}
}
