import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class Demonitisation {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			String string=str[0].trim();
			str = br.readLine().trim().split(" ");
			String n=str[0].trim(),m=str[1].trim();
			String n1="";
			for(char a:n.toCharArray())
				n1=n1+"1";
			String m1="";
			for(char a:m.toCharArray())
				m1=m1+"1";
			String n11=string.replace(n, n1);
			String m11=string.replace(m, m1);
			String out="";
			for(int i=0;i<n11.length();i++)
				if(n11.charAt(i)!='1'&&m11.charAt(i)!='1')
					out=out+n11.charAt(i);
			if(out.length()==0)
				pw.println(-1);
			else
				pw.println(out);

		}

		pw.flush();
		pw.close();
	}
}
