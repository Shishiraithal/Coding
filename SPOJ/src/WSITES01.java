import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.TreeMap;

class WSITES01 {
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
			String str[] = readStrArr();
			Trie trie = new Trie();
			if (str[0].equals("+")) {
				// allow
				trie.insert(str[1], true);
			} else {// block
				trie.insert(str[1], false);
			}
		}
		outputConsole();
		// outputFile();
	}
}

class TrieNode {
	public TrieNode(char ch) {
		value = ch;
		children = new TreeMap<>();
		bIsEnd = false;
		allowcount = 0;
		disallowcount = 0;
	}

	public TreeMap<Character, TrieNode> getChildren() {
		return children;
	}

	public char getValue() {
		return value;
	}

	public void setIsEnd(boolean val) {
		bIsEnd = val;
	}

	public boolean isEnd() {
		return bIsEnd;
	}

	public void setAllowCount(int val) {
		allowcount = val;
	}

	public void setDisAllowCount(int val) {
		disallowcount = val;
	}

	public int getAllowCount() {
		return allowcount;
	}

	public int getDisAllowCount() {
		return disallowcount;
	}

	private char value;
	private int allowcount, disallowcount;
	private TreeMap<Character, TrieNode> children;
	private boolean bIsEnd;
}

// Implements the actual Trie
class Trie {
	// Constructor
	public Trie() {
		root = new TrieNode((char) 0);
	}

	// Method to insert a new word to Trie
	public void insert(String word, boolean allow) {

		// Find length of the given word
		int length = word.length();
		TrieNode crawl = root;

		// Traverse through all characters of given word
		for (int level = 0; level < length; level++) {
			TreeMap<Character, TrieNode> child = crawl.getChildren();
			char ch = word.charAt(level);

			// If there is already a child for current character of given word
			if (child.containsKey(ch)){
				crawl = child.get(ch);
				if (allow) {
					crawl.setAllowCount(crawl.getAllowCount()+1);
				} else {
					crawl.setDisAllowCount(crawl.getDisAllowCount()+1);
				}
			}
			else // Else create a child
			{
				TrieNode temp = new TrieNode(ch);
				if (allow) {
					temp.setAllowCount(1);
				} else {
					temp.setDisAllowCount(1);
				}
				child.put(ch, temp);
				crawl = temp;
			}
		}

		// Set bIsEnd true for last character
		crawl.setIsEnd(true);
	}

	// The main method that finds out the longest string 'input'
	public String getMatchingPrefix(String input) {
		String result = ""; // Initialize resultant string
		int length = input.length(); // Find length of the input string

		// Initialize reference to traverse through Trie
		TrieNode crawl = root;

		// Iterate through all characters of input string 'str' and traverse
		// down the Trie
		int level, prevMatch = 0;
		for (level = 0; level < length; level++) {
			// Find current character of str
			char ch = input.charAt(level);

			// HashMap of current Trie node to traverse down
			TreeMap<Character, TrieNode> child = crawl.getChildren();

			// See if there is a Trie edge for the current character
			if (child.containsKey(ch)) {
				result += ch; // Update result
				crawl = child.get(ch); // Update crawl to move down in Trie

				// If this is end of a word, then update prevMatch
				if (crawl.isEnd())
					prevMatch = level + 1;
			} else
				break;
		}

		// If the last processed character did not match end of a word,
		// return the previously matching prefix
		if (!crawl.isEnd())
			return result.substring(0, prevMatch);

		else
			return result;
	}
	public void doit(){
		TrieNode crawl = root;
		
	}

	private TrieNode root;
}
