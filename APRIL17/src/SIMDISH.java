import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;


public class SIMDISH {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			HashSet<String> hs=new HashSet<String>();
			for(String st:str){
				hs.add(st.trim());
			}
			str = br.readLine().trim().split(" ");
			//code
			int count1=0;
			for(String st:str){
				if(hs.contains(st.trim())){
					count1++;
				}
			}
			if(count1>=2)
				pw.println("similar");
			else
				pw.println("dissimilar");
		}

		pw.flush();
		pw.close();
	}
}
