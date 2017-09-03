import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class MAXOR {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str = br.readLine().trim();
			//
			int n = Integer.parseInt(str);
			//code it
			String sArr[]=br.readLine().trim().split(" ");
			int arr[]=new int[n];
			int i=0;
			for(String str1:sArr)
				arr[i++]=Integer.parseInt(str1);
			int count=0;
			for(i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if((arr[j]|arr[i])==Math.max(arr[i], arr[j]))
						count++;
				}
			}
			pw.println(count);
		}
		pw.flush();
		pw.close();
	}
}
