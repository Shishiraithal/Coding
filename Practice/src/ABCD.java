import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class ABCD {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		
		/*for(int i=0;i<=100000/4;i++)
			System.out.print("ABCD");*/
		int t = Integer.parseInt(br.readLine().trim());
		
		String str = br.readLine().trim();
		int count[]=new int[200];
		for(int i=0;i<str.length();i++)
			count[str.charAt(i)]++;
		String abcd="ABCD".replace(str.charAt(t*2-1),' ').trim();
		if(count['A']>=t){
			abcd=abcd.replace('A', ' ').trim();
		}
		else if(count['B']>=t){
			abcd=abcd.replace('B', ' ').trim();
		}
		else if(count['C']>=t){
			abcd=abcd.replace('C', ' ').trim();
		}
		else if(count['D']>=t){
			abcd=abcd.replace('D', ' ').trim();
		}
		pw.println(str.substring(1)+""+abcd.charAt(0));
	
		pw.flush();
		pw.close();
	}
}
