import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;


public class InterestingPatterns {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			//code
			int n=Integer.parseInt(str[0].trim());
			/*for(int i=1;i<2*n;i++){
				for(int j=1;j<2*n;j++){
					System.out.print(n);
				}
				System.out.println();
			}*/
			String ench="abcdefghijklmnopqrstuvwxyz";
			String out="a";
			for(int i=2;i<=n;i++){
				out=ench.charAt(i-1)+out+ench.charAt(i-1);
			}
			String output[]=new String[n];
			output[0]=out;
			for(int i=1;i<n;i++){
				//System.out.println(output[i-1]+" "+out.charAt(i-1));
				if(output[i-1].contains(""+ench.charAt(i-1)))
					output[i]=output[i-1].replace(""+(ench.charAt(i-1)), ""+(ench.charAt(i)));
			}
			//System.out.println(Arrays.toString(output));
			for(int i=n-1;i>=0;i--){
				//output[i]=output[i].replace(oldChar, newChar)
				for(int j=0;j<n;j++)
					output[i]=output[i].replace((char)('a'+j)+"",(j+1)+"");
			}
			for(int i=n-1;i>=0;i--){
				pw.print(output[i]+" ");
			}
			for(int i=1;i<n;i++){
				pw.print(output[i]+" ");
			}
			pw.println();
		}

		pw.flush();
		pw.close();
	}
}
