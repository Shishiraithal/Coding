import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;


public class PermutationsinArray {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			//code
			int n=Integer.parseInt(str[0].trim()),k=Integer.parseInt(str[1].trim());
			String str1[] = br.readLine().trim().split(" ");
			String str2[] = br.readLine().trim().split(" ");
			int count=0;
			int forw[]=new int[n];
			int bakw[]=new int[n];
			for(int i=0;i<n;i++){
				forw[i]=Integer.parseInt(str1[i].trim());
				bakw[i]=Integer.parseInt(str2[i].trim());
			}
			Arrays.sort(forw);
			Arrays.sort(bakw);
			for(int i=0,j=n-1;i<n;i++,j--){
				if(forw[i]+bakw[j]>=k)
					count++;
			}
			if(count==n)
			pw.println(1);
			else
				pw.println(0);
		}

		pw.flush();
		pw.close();
	}
}
