import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;


public class occurrence {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str = br.readLine().trim();
			//String sArr[]=br.readLine().trim().split(" ");
			int val = Integer.parseInt(str);
			//code it
			String sArr[]=br.readLine().trim().split(" ");
			int arr[]=new int[val];
			int i=0;
			for(String sval:sArr)
				arr[i++]=Integer.parseInt(sval);
			str = br.readLine().trim();
			//String sArr[]=br.readLine().trim().split(" ");
			int dest = Integer.parseInt(str);
			int res=Arrays.binarySearch(arr, dest);
			 if(res<0)
				 System.out.println(-1);
			 else{
				 
				 int res1=res,res0=res;
				 for(int j=res+1;j<val;j++)
					 if(arr[j]==dest)
						 res1++;
					 else
						 break;
				 for(int j=res-1;j>=0;j--)
					 if(arr[j]==dest)
						 res0--;
					 else
						 break;
				 System.out.println(res0+" "+res1);
				 
					 
			 }

			pw.println();
		}
		pw.flush();
		pw.close();
	}
}
