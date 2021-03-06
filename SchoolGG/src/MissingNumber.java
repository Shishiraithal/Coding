import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class MissingNumber {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			//code
			int n=Integer.parseInt(str[0].trim());
			str = br.readLine().trim().split(" ");
			boolean arr[]=new boolean[n+1];
			for(String s:str)
				arr[Integer.parseInt(s)]=true;
			for(int i=1;i<=n;i++)
				if(!arr[i])	{
					pw.println(i);
					break;
				}
		}

		pw.flush();
		pw.close();
	}
}
