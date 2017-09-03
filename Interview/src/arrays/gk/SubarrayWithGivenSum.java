package arrays.gk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class SubarrayWithGivenSum {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter  pw=new PrintWriter(new OutputStreamWriter(System.out));
		
		int t=Integer.parseInt(br.readLine().trim());
		while(t-->0){
			
			String str[]=br.readLine().trim().split(" ");
			int n=Integer.parseInt(str[0].trim());
			int sum=Integer.parseInt(str[1].trim());
			
			str=br.readLine().trim().split(" ");
			int ind=0;
			int arr[]=new int[n];
			for(String s:str)
				arr[ind++]=Integer.parseInt(s.trim());
			
			System.out.println(Arrays.toString(arr));
			
			int cur_sum=0,startIndex=0;
			for(int i=0;i<n;){
				System.out.println(cur_sum);
				if(cur_sum==sum){
					System.out.println("Found!! "+startIndex+" "+(i-1));
					break;
				}
				else if(cur_sum>sum){
					while(cur_sum>sum && startIndex<i){
						cur_sum=cur_sum-arr[startIndex];
						startIndex++;
					}
				}else{
					cur_sum+=arr[i];
					i++;
				}
			}
			
		}
	}
}
