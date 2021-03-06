import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class ReplaceTheBit {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			Integer bitsNum=Integer.parseInt(str[0].trim());
			int kFlip=Integer.parseInt(str[1].trim());
			
			String bits="";
			while(bitsNum>0){
				if(bitsNum%2==0)
					bits='0'+bits;
				else
					bits='1'+bits;
				bitsNum/=2;
			}
			StringBuffer sb=new StringBuffer(bits);
			sb.setCharAt(kFlip-1,'0');
			pw.println(Integer.parseInt(sb.toString(),2));
		}

		pw.flush();
		pw.close();
	}
}
