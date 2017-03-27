import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class CheckIfStringIsRotatedByTwoPlaces {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str1 = br.readLine().trim();
			String str2 = br.readLine().trim();
			//System.out.println(str2.substring(0,2));
			if((str2.substring(str2.length()-2)+str2+str2.substring(0,2)).contains(str1))
				pw.print(1);
			else
				pw.print(0);
			//code

			pw.println();
		}

		pw.flush();
		pw.close();
	}
}