import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class Swapallandevenbits {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str = br.readLine().trim();
			//String sArr[]=br.readLine().trim().split(" ");
			int val = Integer.parseInt(str);
			//code it
			StringBuffer bitstr=new StringBuffer(converbitstr(val));
			// System.out.println(converbitstr(val));
			for(int i=0;i<bitstr.length();){
				char iChar=bitstr.charAt(i);
				char i1Char=bitstr.charAt(i+1);
				bitstr.setCharAt(i, i1Char);
				bitstr.setCharAt(i+1, iChar);
				i+=2;
			}
			// System.out.println(bitstr);
			pw.println(convertToNum(bitstr));
		}
		pw.flush();
		pw.close();
	}

	private static Integer convertToNum(StringBuffer bitstr) {
		// TODO Auto-generated method stub
		int res=0;
		int two=1;
		for(int i=bitstr.length()-1;i>=0;i--){
			if(bitstr.charAt(i)=='1')
				res+=(two);
			two*=2;
		}
		return res;
	}

	private static String converbitstr(int val) {
		// TODO Auto-generated method stub
		String res="";
		while(val>0){
			if(val%2==0)
				res=0+res;
			else
				res=1+res;
			val=val/2;
		}
		//System.out.println(res);
		if(res.length()%2==0)
			return res;
		else
			return 0+res;
	}
}
