import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;


public class AtLeastTwoGreaterElements {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			int n=Integer.parseInt(str[0].trim());
			str = br.readLine().trim().split(" ");
			int arr[]=new int[n],i=0;
			for(String st:str)
				arr[i++]=Integer.parseInt(st.trim());
			Arrays.sort(arr);
			for(i=0;i<arr.length-2;i++)
				pw.print(arr[i]+" ");
			pw.println();
		}

		pw.flush();
		pw.close();
	}
}
