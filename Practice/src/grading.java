import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class grading {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str = br.readLine().trim();
			int val = Integer.parseInt(str);

			int div=val/5;
			int mod=val%5;
			if(mod>2 && val>=38)
				pw.print((div+1)*5);
			else
				pw.print(val);
			pw.println();
		}
		pw.flush();
		pw.close();
	}
}
