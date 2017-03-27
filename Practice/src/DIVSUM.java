import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;

class DIVSUM {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str = br.readLine().trim();
			// String sArr[]=br.readLine().trim().split(" ");
			int val = Integer.parseInt(str);
			// code it
			int out = 0;
			HashSet<Integer> set = new HashSet<>();
			for (int i = 1; i < val; i++) {
				if (val % i == 0 && i!=1) {
					if (set.contains(i) || set.contains(val / i))
						break;
					else {
						if(i!=val/i)
						out += (i + val / i) ;
						else
							out+=i;
						set.add(i);
						set.add(val / i);
					}
				}
				if(i==1)
					out = 1;
			}
			pw.println(out);
		}
		pw.flush();
		pw.close();
	}
}
