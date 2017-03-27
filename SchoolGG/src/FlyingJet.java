import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class FlyingJet {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		long vals[] = new long[61];
		for (int i = 1, k = 1,j=0; i < 61; i++) {
			if (i % 2 != 0) {
				vals[i] = (long) Math.pow(k++, 4);
			}else{
				vals[i]=(long) (7*Math.pow(3, j++));
			}
		}
		
		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0].trim());

			
			// code

			pw.println(vals[n]);
		}

		pw.flush();
		pw.close();
	}
}
