import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

class PT07Y1 {
	static int uf[];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		
		String sarr[]=br.readLine().trim().split(" ");
		int n=Integer.parseInt(sarr[0].trim()),m=Integer.parseInt(sarr[1].trim());
		int _m=m;
		uf=new int[n];
		Arrays.fill(uf, -1);
		boolean notTree=false;
		while(_m-->0){
			sarr=br.readLine().trim().split(" ");
			if(union(Integer.parseInt(sarr[0].trim())-1, Integer.parseInt(sarr[1].trim())-1)){
				notTree=true;
			}
		}
		if(m==n-1){
			if(notTree){
				pw.println("NO");
			}
			else
				pw.println("YES");
			
		}
		else{
			pw.println("NO");
		}
		pw.flush();pw.close();
		
	}
	public static int find(int in){
		if(uf[in]==-1){
			return in;
		}
		return find(uf[in]);
	}
	public static boolean union(int a,int b){
		int _a=find(a);
		int _b=find(b);
		if(_a!=_b){
			uf[_a]=_b;
		}
		else
			return true;
		return false;
	}
}
