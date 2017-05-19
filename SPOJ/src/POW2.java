import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

class POW2 {
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

		int t = readInt();
		for (int test = 1; test <= t; test++) {
			long val = readLong();
			long _val=val;
			boolean pow2 = true;
			while (val > 0) {
				if (val % 2 == 0)
					val = val / 2;
				else if(val==1)
					break;
				else {
					pow2 = false;
					break;
				}
			}
			if(pow2 && _val!=0)
				output.append("YES\n");
			else
				output.append("NO\n");
		}
		outputConsole();
		// outputFile();
	}
}
