import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class FindWhetherPathExist {
	static boolean flag[][];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			// code
			int n = Integer.parseInt(str[0].trim());
			int arr[][] = new int[n][n];
			flag = new boolean[n][n];
			str = br.readLine().trim().split(" ");
			int sourcei = 0, sourcej = 0, desti = 0, destj = 0;
			for (int i = 0, ind = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(str[ind++]);
					if (arr[i][j] == 1) {
						sourcei = i;
						sourcej = j;
					}
					if (arr[i][j] == 2) {
						desti = i;
						destj = j;
					}
				}
			}
			
			pw.println(checkPath(arr, sourcei, sourcej, desti, destj)?1:0);
		}

		pw.flush();
		pw.close();
	}

	private static boolean checkPath(int[][] arr, int sourcei, int sourcej,
			int desti, int destj) {
		if (sourcei == desti && destj == sourcej)
			return true;
		else {
			//System.out.println(sourcei + " " + sourcej);
			boolean a = false, b = false, c = false, d = false;
			if (flag[sourcei][sourcej])
				return false;
			if (sourcei + 1 < arr.length && !flag[sourcei + 1][sourcej]) {
				if (arr[sourcei + 1][sourcej] == 3) {
					a = checkPath(arr, sourcei + 1, sourcej, desti, destj);
					flag[sourcei + 1][sourcej] = true;
				} else if (arr[sourcei + 1][sourcej] == 2) {
					return true;
				}

			}
			if (sourcej + 1 < arr[0].length && !flag[sourcei][sourcej + 1]) {
				if (arr[sourcei][sourcej + 1] == 3) {
					b = checkPath(arr, sourcei, sourcej + 1, desti, destj);
					flag[sourcei][sourcej + 1] = true;
				} else if (arr[sourcei][sourcej + 1] == 2) {
					return true;
				}
			}
			if (sourcei - 1 >= 0 && !flag[sourcei - 1][sourcej]) {
				if (arr[sourcei - 1][sourcej] == 3) {
					c = checkPath(arr, sourcei - 1, sourcej, desti, destj);
					flag[sourcei - 1][sourcej] = true;
				} else if (arr[sourcei - 1][sourcej] == 2) {
					return true;
				}
			}
			if (sourcej - 1 >= 0 && !flag[sourcei][sourcej - 1]) {
				if (arr[sourcei][sourcej - 1] == 3) {
					d = checkPath(arr, sourcei, sourcej - 1, desti, destj);
					flag[sourcei][sourcej - 1] = true;
				} else if (arr[sourcei][sourcej - 1] == 2) {
					return true;
				}
			}
			return a || b || c || d;
		}
	}
}
