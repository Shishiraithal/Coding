import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class DS_FenwickTree {
	
	static int  BIT[];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			//code

			pw.println();
		}

		pw.flush();
		pw.close();
	}
	
	//ref https://www.hackerearth.com/practice/notes/binary-indexed-tree-or-fenwick-tree/
	// update values
	public void update(int at, int by){
		int n=BIT.length;
		for(;at<n;at+=at&(-at))
			BIT[at]+=by;
			
	}
	//query prefix sum
	public int query(int at){
		int res=0;
		for(;at>=0;at-=at&-at)
			res+=BIT[at];
		return res;
	}
}
