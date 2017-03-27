import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class BRLADDER {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			//code
			int a1=Integer.parseInt(str[0].trim());
			int b1=Integer.parseInt(str[1].trim());
			
			int a=Math.min(a1, b1),b=Math.max(a1, b1);
			if(b-a==2){
				//
				pw.print("YES");
			}
			else if(b-a==1 && a%2!=0){
				pw.print("YES");
			}
			else{
				pw.print("NO");
			}
			pw.println();
		}

		pw.flush();
		pw.close();
	}
}
