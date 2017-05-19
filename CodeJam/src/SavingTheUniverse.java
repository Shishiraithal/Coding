import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;

public class SavingTheUniverse {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		int caseInd = 1;
		while (t-- > 0) {
			int n=Integer.parseInt(br.readLine().trim());
			int _n=n;
			HashSet<String> hs=new HashSet<String>();
			while(_n-->0){
				hs.add(br.readLine());
			}
			int q=Integer.parseInt(br.readLine().trim());
			HashSet<String> _hs=new HashSet<String>();
			_hs.addAll(hs);
			int upcount=0;
			while(q-->0){
				String now=br.readLine();
				if(_hs.contains(now)){
					_hs.remove(now);
					if(_hs.size()==0){
						upcount++;
						_hs.addAll(hs);
						_hs.remove(now);
					}
					System.out.println(upcount);
				}
				// System.out.println(_hs);
				
				
			}
			pw.println("Case #" + (caseInd++) + ": "+(upcount));
		}
		pw.flush();pw.close();
	}
}
