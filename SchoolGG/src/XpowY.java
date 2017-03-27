import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class XpowY {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			int val=Integer.parseInt(str[0].trim());
			
			int sqrt=(int) Math.sqrt(val);
			boolean ty=false;
			//System.out.println(sqrt);
			for(int i=2;i<=sqrt;i++){
				int v=val;
				while(true){
					//System.out.println(v+" -bala");
					if(v==1){
						ty=true;
						break;
					}

					if(v%i==0)
						v=v/i;
					else
						break;					
				}
				if(ty)
					break;
			}
			if(ty||val==1)
				pw.println(1);
			else
				pw.println(0);
		}

		pw.flush();
		pw.close();
	}
}
