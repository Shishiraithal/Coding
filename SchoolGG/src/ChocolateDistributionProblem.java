import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;


public class ChocolateDistributionProblem {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			//code
			int n=Integer.parseInt(str[0].trim());
			str = br.readLine().trim().split(" ");
			int arr[]=new int[n];
			int i=0;
			for(String st:str)
				arr[i++]=Integer.parseInt(st.trim());
			Arrays.sort(arr);
			str = br.readLine().trim().split(" ");
			int m=Integer.parseInt(str[0].trim());
			int min=Integer.MAX_VALUE,j;
			for(i=0,j=m-1;j<n;j++,i++)
				if(arr[j]-arr[i]<min)
					min=arr[j]-arr[i];
			//System.out.println(Arrays.toString(arr));
			pw.println(min);
		}

		pw.flush();
		pw.close();
	}
}
