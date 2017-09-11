import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

 class MINPERM {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str = br.readLine().trim();
			//String sArr[]=br.readLine().trim().split(" ");
			int val = Integer.parseInt(str);
			//code it
			
			if(val%2==0){
				for(int i=1;i<=(val/2);i++){
					pw.print((2*i)+" "+(2*i-1)+" ");
				}
			}
			else{
				for(int i=1;i<=(val/2);i++){
					if(i==(val/2)){
						pw.print((2*i)+" "+(2*i+1)+" "+(2*i-1));
					}
					else
						pw.print((2*i)+" "+(2*i-1)+" ");
				}
			}
			
			pw.println();
		}
		pw.flush();
		pw.close();
	}
}
