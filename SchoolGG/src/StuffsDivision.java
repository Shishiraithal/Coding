import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


class StuffsDivision {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			int n=Integer.parseInt(str[0].trim());
			str = br.readLine().trim().split(" ");
			long lv=n*(n+1);
			lv=lv/2;
			long l=0;
			
			for(String s:str)
				l+=Long.parseLong(s.trim());
			//System.out.println(l+" "+lv);
			if(l==lv)
				pw.print("YES");
			else
				pw.print("NO");
			pw.println();
		}

		pw.flush();
		pw.close();
	}
}
