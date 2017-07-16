import java.io.*;
import java.util.*;

class TEMPLELA {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str = br.readLine().trim();
			//String sArr[]=br.readLine().trim().split(" ");
			int val = Integer.parseInt(str);
			int arr[]=new int[val];
			String strr[]=br.readLine().trim().split(" ");
			int ind=0;
			for(String ss:strr){
				arr[ind++]=Integer.parseInt(ss.trim());
			}
			if(val%2!=0){
				if(arr[0]!=1){
					pw.println("no");
				}
				else{
					int i=0,ran=val/2;
					boolean fail=false;
					for(i=0;i<=(ran);i++)
						if(arr[i]==(i+1)&&(arr[val-i-1]==(i+1))){
							
						}
						else{
							fail=true;
						}
					if(fail)
						pw.println("no");
					else
						pw.println("yes");
				}
			}
			else{
				pw.println("no");
			}
		}
		pw.flush();
		pw.close();
	}
}
