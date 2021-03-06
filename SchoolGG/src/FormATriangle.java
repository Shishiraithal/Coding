import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;

public class FormATriangle {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			// code
			int n = Integer.parseInt(str[0].trim());
			str = br.readLine().trim().split(" ");
			int arr[] = new int[n], i = 0;
			for (String st : str)
				arr[i++] = Integer.parseInt(st.trim());
			Arrays.sort(arr);
			int count = 0;
			boolean check [][][]= new boolean[n][n][n];
			for (i = 0; i < n - 2; i++) {
				for (int j = i + 1; j < n - 1; j++) {
					for (int k = j + 1; k < n; k++) {
						if (i < n && j < n && k < n) {
							if (!check[i][j][k]) {
								if (arr[i] + arr[j] > arr[k] && arr[i] + arr[k] > arr[j] && arr[j] + arr[k] > arr[i])
									count++;
								check[i][j][k]=true;
							}
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
