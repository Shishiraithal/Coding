import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class AppleAndOranges {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		String str[]=br.readLine().trim().split(" ");
		int s = Integer.parseInt(str[0].trim());
		int t = Integer.parseInt(str[1].trim());
		
		str=br.readLine().trim().split(" ");
		int a = Integer.parseInt(str[0].trim());
		int b = Integer.parseInt(str[1].trim());
		
		str=br.readLine().trim().split(" ");
		int m = Integer.parseInt(str[0].trim());
		int n = Integer.parseInt(str[1].trim());
		
		int acount=0,ocount=0;
		str=br.readLine().trim().split(" ");
		for(String st:str)
		{
			int v=a+Integer.parseInt(st.trim());
			if(s<=v && v<=t)
				acount++;
		}
		str=br.readLine().trim().split(" ");
		for(String st:str)
		{
			int v=b+Integer.parseInt(st.trim());
			if(s<=v && v<=t)
				ocount++;
		}
		pw.println(acount+"\n"+ocount);
		pw.flush();
		pw.close();
	}
}
