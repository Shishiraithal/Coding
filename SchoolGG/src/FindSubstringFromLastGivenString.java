import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class FindSubstringFromLastGivenString {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String s = br.readLine().trim();
			String str = br.readLine().trim();
			if(str.contains(s)){
				pw.println(str.lastIndexOf(s)+1);
			}
			else
				pw.println(-1);
		}

		pw.flush();
		pw.close();
	}
}
