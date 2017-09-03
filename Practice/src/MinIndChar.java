import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class MinIndChar {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str = br.readLine().trim();
			String patt = br.readLine().trim();
			int pattren[]=new int[128];
			for(char ch:patt.toCharArray())
				pattren[ch]++;
			char ch=' ';
			for(char s:str.toCharArray())
				if(pattren[s]>0){
					ch=s;
					break;
				}
			if(ch==' ')
				pw.println("No character present");
			else
				pw.println(ch);
		}
		pw.flush();
		pw.close();
	}
}
