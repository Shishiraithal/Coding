import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
 class CHEFMOVR {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str1 = br.readLine().trim();
			String sArr[]=br.readLine().trim().split(" ");
			int n = Integer.parseInt(str1);
			
			int arr[]=new int[n];
			int i=0;	
			long count=0;
			for (String str:sArr){
				arr[i]=Integer.parseInt(str.trim());
				count+=arr[i];
				i++;
			}
			long det=count/n,res=0;
			for(int v:arr){
				if(det>v)
					res+=det-v;
			}
			//code it
			pw.println(res);
		}
		pw.flush();
		pw.close();
	}
}
