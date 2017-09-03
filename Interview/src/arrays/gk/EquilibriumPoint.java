package arrays.gk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

class EquilibriumPoint {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine().trim());
			String str[] = br.readLine().trim().split(" ");
			int arr[] = new int[n], ind = 0, sum = 0;
			for (String s : str) {
				int temp = Integer.parseInt(s.trim());
				arr[ind] = temp;
				sum += temp;
				ind++;
			}
			int leftSum=0,rightSum=sum;;
			for(int i=0;i<n;i++){
				rightSum=rightSum-arr[i];
				if(leftSum==rightSum){
					System.out.println("Found!! at "+i);
				}
				leftSum+=arr[i];
			}
			System.out.println(sum);
		}
	}
}
