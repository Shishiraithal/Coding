import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

class PPSUM {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			//String sArr[]=br.readLine().trim().split(" ");
			//int val = Integer.parseInt(str);
			//code it
			long d=Long.parseLong(str[0].trim()),n=Long.parseLong(str[1].trim());
			while(d-->0){
			n=(n*(n+1))/2;
			}
			pw.println(n);
		}
		pw.flush();
		pw.close();
	}
}
