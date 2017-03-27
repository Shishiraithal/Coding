import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class StringWithNumbersAtItsEnd {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			String string=str[0].trim();
			String num="";
			for(int i=string.length()-1;i>=0;i--){
				if('0'<=string.charAt(i)&&string.charAt(i)<='9'){
					num=string.charAt(i)+""+num;
				}else
					break;
			}
			int lenn=string.length()-num.length();
			if(lenn==Integer.parseInt(num))
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
