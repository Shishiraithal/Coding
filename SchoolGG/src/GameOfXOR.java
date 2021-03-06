import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class GameOfXOR {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		//System.out.println(44^0);
		
		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0].trim());
			int arr[] = new int[n];
			str = br.readLine().trim().split(" ");
			int xor = 0, i = 0;
			for (String st : str) {
				arr[i++] = Integer.parseInt(st.trim());
			}

			for (i = 1; i <= n; i++) {
				int temp=(n-i+1)*i;
				if(temp%2!=0){
					xor^=arr[i-1];
				}
			}

			pw.println(xor);
		}

		pw.flush();
		pw.close();
	}
}
