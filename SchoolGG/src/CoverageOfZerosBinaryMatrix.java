import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class CoverageOfZerosBinaryMatrix {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			// code
			int n = Integer.parseInt(str[0].trim()), m = Integer
					.parseInt(str[1].trim());
			int arr[][] = new int[n][m];
			str = br.readLine().trim().split(" ");
			for (int i = 0, ind = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					arr[i][j] = Integer.parseInt(str[ind++]);
				}
			}
			// System.out.println(Arrays.deepToString(arr));
			int count = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (arr[i][j] == 0) {
						if (j+1<m&&arr[i][j + 1] == 1) {
							count++;
						}
						if (j-1>=0&&arr[i][j - 1] == 1) {
							count++;
						}
						if (i+1<n&&arr[i+1][j] == 1) {
							count++;
						}
						if (i-1>=0&&arr[i-1][j] == 1) {
							count++;
						}
					}
				}
			}
			pw.println(count);
		}

		pw.flush();
		pw.close();
	}
}
