import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;


public class NextLargerElement {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str = br.readLine().trim();
			//String sArr[]=br.readLine().trim().split(" ");
			int val = Integer.parseInt(str);
			
			String sArr[]=br.readLine().trim().split(" ");
			int arr[]=new int[val];
			for(int i=0;i<val;i++)
				arr[i]=Integer.parseInt(sArr[i]);
			
			int res[]=new int[val];
			Arrays.fill(arr, -1);
			for(int i=0;i<val;i++)
				if(res[i]<=arr[i])
					res[i]=arr[i];
			
			//code it

			pw.println();
		}
		pw.flush();
		pw.close();
	}
}
