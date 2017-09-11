import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

 class CHEFSUM {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str = br.readLine().trim();
			//String sArr[]=br.readLine().trim().split(" ");
			int val = Integer.parseInt(str);
			String sarr[]=br.readLine().trim().split(" ");
			int arr[]=new int[val],i=0;
			for(String s:sarr){
				arr[i++]=Integer.parseInt(s.trim());
			}
			int min=Integer.MAX_VALUE,ind=-1;
			for(i=0;i<val;i++){
				if(min>arr[i]){
					min=arr[i];
					ind=i;
				}
			}
			pw.println(ind+1);
		}
		pw.flush();
		pw.close();
	}
}
