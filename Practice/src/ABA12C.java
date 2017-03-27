import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
class ABA12C {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			//String str = br.readLine().trim();
			String sArr[]=br.readLine().trim().split(" ");
			int n=Integer.parseInt(sArr[0].trim());
			int k=Integer.parseInt(sArr[1].trim());
			sArr=br.readLine().trim().split(" ");
			int arr[]=new int[k];
			//int dp[]=new int[k+1];
			//dp[0]=0;
			for(int i=1;i<=n;i++){
				arr[i-1]=Integer.parseInt(sArr[i-1].trim());
				if(arr[i-1]==-1)
					arr[i-1]=Integer.MIN_VALUE;
				//dp[i]=arr[i];
			}
			/*//code it
			dp[0]=0;
			for(int i=1;i<=k;i++){
				int max=Integer.MIN_VALUE;
				for(int j=0;j<i;j++){
					System.out.println(i+" "+j+" "+(j)+" "+(i-j-1));
					max=Math.max(max,dp[j]+dp[i-j-1]);
				}
				dp[i]=max;
				System.out.println(Arrays.toString(dp));
			}
			*/
			//System.out.println((n-1)+" "+k);
			int val=cutRod(arr,k-1);
			if(val<=0)
			pw.println(-1);
			else
				pw.println(val);
		}
		pw.flush();
		pw.close();
	}
	//Dynamic Programming
		public static int cutRod(int price[],int n)
	    {
	        int val[] = new int[n+1];
	        val[0] = 0;
	        // Build the table val[] in bottom up manner and return
	        // the last entry from the table
	        for (int i = 2; i<=n; i++)
	        {
	            int max_val = Integer.MIN_VALUE;
	            for (int j = 0; j < i; j++){
	            	System.out.println((i-j-1)+" "+j);
	                max_val = Math.max(max_val, 
	                                   price[j] + val[i-j-1]);
	            }
	            val[i-1] = max_val;
	            System.out.println();
	        }
	        //System.out.println(Arrays.toString(val));
	        return val[n];
	    }
}
