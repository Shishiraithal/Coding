import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;


public class KeyPair {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			//String str = br.readLine().trim();
			String sArr[]=br.readLine().trim().split(" ");
			int n = Integer.parseInt(sArr[0].trim());
			int x = Integer.parseInt(sArr[1].trim());
			sArr=br.readLine().trim().split(" ");
			HashSet<Integer> in=new HashSet<>();
			for(String s:sArr)
				in.add(Integer.parseInt(s.trim()));
			Iterator<Integer> it=in.iterator();
			boolean yes=false;
			while(it.hasNext())
				if(in.contains(x-it.next()))
					yes=true;
			if(yes)
				pw.print("Yes");
			else
				pw.print("No");
			//code it

			pw.println();
		}
		pw.flush();
		pw.close();
	}
}
