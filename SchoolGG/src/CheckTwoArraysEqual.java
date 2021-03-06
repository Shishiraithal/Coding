import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class CheckTwoArraysEqual {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			int n=Integer.parseInt(str[0].trim());
			int arr[]=new int[1001];
			int zero=0;
			str=br.readLine().trim().split(" ");
			for(String st:str){
				arr[Integer.parseInt(st.trim())]++;
				zero++;
			}
			str=br.readLine().trim().split(" ");
			for(String st:str){
				arr[Integer.parseInt(st.trim())]--;
				if(arr[Integer.parseInt(st.trim())]>=0)
					zero--;
				else{
					zero=1001;
					break;
				}
			}
			if(zero!=0||zero>1000)
				pw.println(0);
			else
				pw.println(1);
			
			//code
		}

		pw.flush();
		pw.close();
	}
}
