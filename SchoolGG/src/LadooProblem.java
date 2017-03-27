import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class LadooProblem {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0].trim());
			str = br.readLine().trim().split(" ");
			int arr[] = new int[1001];
			for (String st : str) {
				arr[Integer.parseInt(st.trim())] = 1;
			}
			// System.out.println(Arrays.toString(arr));
			int pi = 0;
			for (int i = 0; i < 1001; i++)
				pi += arr[i];
			// code
			pw.println(pi);
		}

		pw.flush();
		pw.close();
	}
}
