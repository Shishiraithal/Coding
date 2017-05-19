import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class SenateEvacuation {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str = br.readLine().trim();
			String sArr[]=br.readLine().trim().split(" ");
			int val = Integer.parseInt(str);
			//code it
			int arr[]=new int[27];
			for(int i=0;i<val;i++)
				arr[i]=Integer.parseInt(sArr[i]);
			
			int prev=0;
			for(int i=0;i<=26;i++){
				int _m=arr[i];
				while(_m>=2){
					char ch=(char) (('a')+i);
					pw.print(ch+ch+" ");
					_m-=2;
				}
				prev=_m;
			}
			pw.println();
		}
		pw.flush();
		pw.close();
	}
}
