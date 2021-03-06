import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class SumOfTwoSquares {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			//code
			int n=Integer.parseInt(str[0].trim());
			int sq=(int) Math.sqrt(n);
			int down=0;
			boolean sqsum=false;
			for(int i=0;i<=sq;i++){
				if(isPerfectSquare(n-i*i)){
					sqsum=true;break;
				}
			}
			if(sqsum)
				pw.print("1");
			else
				pw.print("0");

			pw.println();
		}

		pw.flush();
		pw.close();
	}

	private static boolean isPerfectSquare(int n) {
		int sq=(int) Math.sqrt(n);
		if(sq*sq==n)
			return true;
		else
			return false;
		
	}
}
