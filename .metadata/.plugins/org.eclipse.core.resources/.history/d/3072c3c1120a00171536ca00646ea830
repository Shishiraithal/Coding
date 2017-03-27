import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;


public class UnusualStringSort {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str = br.readLine().trim();
			char[] chr=str.toCharArray();
			
			ArrayList<Character> upper=new ArrayList<Character>(),lower=new ArrayList<Character>();
			for(char ch:chr)
				if('A'<=ch && ch<='Z')
					upper.add(ch);
				else
					lower.add(ch);
			Collections.sort(upper);
			Collections.sort(lower);
			StringBuffer output=new StringBuffer("");
			int fi1=0,ne1=0,fi=upper.size(),ne=lower.size();
			while(fi1<fi && ne1<ne){
				output.append(upper.get(fi1++));
				output.append(lower.get(ne1++));
			}
			while(fi1<fi){
				output.append(upper.get(fi1++));
			}
			while(ne1<ne){
				output.append(lower.get(ne1++));
			}
	
			pw.println(output);
		}

		pw.flush();
		pw.close();
	}
}
