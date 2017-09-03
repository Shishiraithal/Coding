import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.security.KeyStore.Entry;
import java.util.TreeMap;

public class LOSTMAX {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");

			TreeMap<Integer, Integer> tm=new TreeMap<>();
			int len=0;
			for(String s:str){
				int val=Integer.parseInt(s.trim());
				if(!tm.containsKey(val))
					tm.put(val, 0);
				tm.put(val,tm.get(val)+1);
				len++;
			}
			len=len-1;
			tm.put(len,tm.get(len)-1);
			java.util.Map.Entry<Integer, Integer> e=tm.pollLastEntry();
			if(e.getValue()>0){
				pw.println(e.getKey());
			}
			else{
				pw.println(tm.pollLastEntry().getKey());
			}
		}
		pw.flush();
		pw.close();
	}
}
