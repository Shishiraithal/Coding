package arrays.gk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class LeadersInAnArray {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine().trim());
			String str[]=br.readLine().trim().split(" ");
			int arr[]=new int[n];
			int ind=0;
			for(String s:str){
				arr[ind++]=Integer.parseInt(s.trim());
			}
			
			int tillMax=Integer.MIN_VALUE;
			for(int i=n-1;i>=0;i--){
				if(tillMax<arr[i])
				{
					tillMax=arr[i];
					System.out.println(arr[i]);
				}
			}

		}
	}

}
/*
2
6
16 17 4 3 5 2
5
1 2 3 4 0
*/
