import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class HelpJoey {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			int c = Integer.parseInt(str[0].trim()), s = Integer
					.parseInt(str[1].trim());

			// code
			/*
			 * int scc=(int)Math.min(c/2, s); c=c-c/2;
			 */
			// sccsc 
			// scc
			int out = 0;
			while (s > 0) {
				if (2 * s <= c) {
					c = c - 2 * s;
					out =  s + c / 4;
					break;
				}
				s--;
			}
			// cc cc
			pw.println(out);
		}

		pw.flush();
		pw.close();
	}
}
