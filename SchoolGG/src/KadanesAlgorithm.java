import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class KadanesAlgorithm {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			//code
			int n=Integer.parseInt(str[0].trim());
			str=br.readLine().trim().split(" ");
			int arr[]=new int[n],i=0;
			for(String st:str)
				arr[i++]=Integer.parseInt(st.trim());
			int curMax=arr[0];
			int gMax=Integer.MIN_VALUE;
			for(i=1;i<n;i++){
				curMax=Math.max(curMax,curMax+arr[i]);
				gMax=Math.max(curMax,gMax);
			}
			pw.println(gMax);
		}

		pw.flush();
		pw.close();
	}
}
