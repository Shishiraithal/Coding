package FenwickTrees;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class HORRIBLE {
	public static long BIT[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			// String str = br.readLine().trim();
			String sArr[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(sArr[0].trim()), c = Integer
					.parseInt(sArr[1].trim());
			BIT = new long[n + 1];
			int _c = c;
			while (_c-- > 0) {
				sArr = br.readLine().trim().split(" ");
				if (sArr.length == 4) {
					// update
					int p = Integer.parseInt(sArr[1].trim());
					int q = Integer.parseInt(sArr[2].trim());
					int v = Integer.parseInt(sArr[3].trim());
					updateFromTo(p, q, v);
				} else {
					// query to print
					int p = Integer.parseInt(sArr[1].trim());
					int q = Integer.parseInt(sArr[2].trim());
					pw.println(queryFromTo(p, q));
				}
			}
			// code it
			// pw.println();
		}
		pw.flush();
		pw.close();
	}

	public static void updateAt(int at, int by) {
		for (; at < BIT.length; at += at & -at)
			BIT[at] += by;
	}

	public static void updateFromTo(int from, int to, int by) {
		updateAt(from, by);
		updateAt(to+1, -by);
	}

	public static int query(int to) {
		int res = 0;
		for (; to > 0; to -= to & -to)
			res += BIT[to];
		return res;
	}

	public static int queryFromTo(int from, int to) {
		return query(to) - query(from - 1);
	}
}
