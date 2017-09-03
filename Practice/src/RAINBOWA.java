import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class RAINBOWA {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str = br.readLine().trim();
			//
			int val = Integer.parseInt(str);
			//code it
			String sArr[]=br.readLine().trim().split(" ");
			int forward[]=new int[val],backward[]=new int[val];
			boolean flag=false;
			for(int i=0,j=val-1;i<val;i++,j--){
				forward[i]=Integer.parseInt(sArr[i].trim());
				backward[j]=forward[i];
				if(backward[j]>7)
					flag=true;
			}
			// System.out.println(Arrays.toString(forward));
			// System.out.println(Arrays.toString(backward));
			int ind=0;
			if(!flag)
			for(int v=1;v<=7;v++){
				boolean jf=false;
				// System.out.println(ind+" "+v+" bef");
				for(;ind<val;){
					if(!(forward[ind]==backward[ind] && forward[ind]==v)){
						if(!((forward[ind]==backward[ind] && (forward[ind]==v+1||forward[ind]==6))))
							flag=true;
						break;
					}
					else{
						ind++;
						jf=true;}
				}
					//System.out.println(ind+" "+v);
				if(flag)
					break;
				if(!jf){
					flag=true;break;
				}
			}
			if(!flag){
				pw.println("yes");
			}
			else
			{
				pw.println("no");
			}
		}
		pw.flush();
		pw.close();
	}
}
