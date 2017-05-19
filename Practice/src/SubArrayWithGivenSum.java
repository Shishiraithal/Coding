import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class SubArrayWithGivenSum {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			//String str = br.readLine().trim();
			String sArr[]=br.readLine().trim().split(" ");
			int n = Integer.parseInt(sArr[0].trim());
			int x = Integer.parseInt(sArr[1].trim());
			sArr=br.readLine().trim().split(" ");
			int arr[]=new int[n];
			int carr[]=new int[n+1];
			int  val=0,i=0;
			carr[0]=0;
			HashMap<Integer,Integer> hm=new HashMap<>();
			hm.put(0, 0);
			for(String s:sArr){
				arr[i]=Integer.parseInt(s.trim());
				val=val+arr[i];
				carr[i+1]=val;
				hm.put(carr[i+1], i+1);
				i++;
			}
			int start=-1,end=-1;
			if(start==-1||end==-1)
				pw.println(-1);
			else
				pw.println((start-1)+" "+(end));
		}
		pw.flush();
		pw.close();
	}
}
