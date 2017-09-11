import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;

class CHEFPDIG {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str = br.readLine().trim();
			HashMap<Character, Integer> hm=new HashMap<>();
			for(char ch:str.toCharArray()){
				if(!hm.containsKey(ch))
					hm.put(ch, 0);
				hm.put(ch, hm.get(ch)+1);
			}
			//System.out.println(hm);
			HashMap<Character, Integer> temp;
			for(int i=65;i<(65+26);i++){
				temp=new HashMap<>();
				for(char ch:(i+"").toCharArray()){
					if(!temp.containsKey(ch))
						temp.put(ch, 0);
					temp.put(ch, temp.get(ch)+1);
				}
				Iterator<Character> itr=temp.keySet().iterator();
				int ccount=0;
				//System.out.println("temp "+temp);
				while(itr.hasNext()){
					char now=itr.next();
					if(hm.containsKey(now)&&hm.get(now)>=temp.get(now))
						ccount+=temp.get(now);
				}
				if(ccount==2)
					pw.print((char)i);
			}
			pw.println();
		}
		pw.flush();
		pw.close();
	}
}
