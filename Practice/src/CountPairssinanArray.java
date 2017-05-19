import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class CountPairssinanArray {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str = br.readLine().trim();
			String sArr[] = br.readLine().trim().split(" ");
			int val = Integer.parseInt(str);
			// code it
			int arr[] = new int[val];
			for (int i = 0; i < val; i++)
				arr[i] = Integer.parseInt(sArr[i]);

			// wc
			int count = 0;
			for (int i = 0; i < val; i++) {
				for (int j = i; j < val; j++) {
					if ((i + 1) * arr[i] > (j + 1) * arr[j]){
						count++;
						//System.out.println((i + 1) * arr[i] +" "+ (j + 1) * arr[j]);
					}
				}
			}
			pw.println(count);
		}
		pw.flush();
		pw.close();
	}
}

