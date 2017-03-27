import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.TreeSet;


public class MakeDistinctDigitArray {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			str = br.readLine().trim().split(" ");
			//code
int arr[]=new int[100];

for(String st:str)
	for(char ch:st.toCharArray())
		arr[ch]=1;
for(int i='0';i<='9';i++)
	if(arr[i]==1)
		pw.print((char)i+" ");
pw.println();
		}
		pw.flush();
		pw.close();
	}
}
