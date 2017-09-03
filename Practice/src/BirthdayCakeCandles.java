import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class BirthdayCakeCandles {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		
		int n=Integer.parseInt(br.readLine().trim());
		
		String str[] = br.readLine().trim().split(" ");
		
		int max=0,mcount=0;
		for(String s:str){
			int cval=Integer.parseInt(s.trim());
			if(max<cval)
			{
				max=cval;mcount=1;
			}
			else if(max==cval){
				mcount++;
			}
		}
		pw.println(mcount);
		pw.flush();
		pw.close();
	}
}
