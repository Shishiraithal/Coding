import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


class Love {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		
			String str = br.readLine().trim();
			
			int l=-1,o=-1,v=-1,e=-1;
			for(int i=0;i<str.length();i++){
				if(l==-1&&(str.charAt(i)=='l'||str.charAt(i)=='L'))
					l=i;
				else if(l!=-1&&(str.charAt(i)=='o'||str.charAt(i)=='O'))
					o=i;
				else if(o!=-1&&(str.charAt(i)=='v'||str.charAt(i)=='V'))
					v=i;
				else if(v!=-1&&(str.charAt(i)=='e'||str.charAt(i)=='E'))
					e=i;
			}
			if(l==-1||o==-1||v==-1||e==-1)
			pw.println();
		//}
		pw.flush();
		pw.close();
	}
}