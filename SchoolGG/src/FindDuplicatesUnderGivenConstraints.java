import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

class FindDuplicatesUnderGivenConstraints {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		
		int t=Integer.parseInt(br.readLine().trim());
		while(t-->0){
			String str[]=br.readLine().trim().split(" ");
			//code
			int arr[]=new int[10];
			int i=0;
			for(String s:str){
				arr[i++]=Integer.parseInt(s.trim());
			}
			for(i=0;i<10;i++)
				if(i+1<10&&arr[i]==arr[i+1]){
					pw.print(arr[i]);
					break;
				}
			pw.println();
		}

		pw.flush();pw.close();
	}
}
