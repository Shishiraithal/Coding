package arrays;

import java.util.Arrays;

public class MaximumSumSubarray {
	public static void main(String[] args) {
		
		int arr[]={1,2,-10,4,5,-6,7};
		maximumSum(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void maximumSum(int[] arr) {
		
		int maxSum=arr[0];
		int maxSumSoFar=0;
		
		int sindex=0,eindex=0;
		
		int startIndex=0,endIndex=arr.length-1;
		while(startIndex<=endIndex){
			maxSumSoFar+=arr[startIndex];
			if(maxSumSoFar>maxSum){
				maxSum=maxSumSoFar;
				eindex=startIndex;
			}
			if(maxSumSoFar<0){
				maxSumSoFar=0;
				sindex=startIndex+1;
			}
			startIndex++;
		}
		System.out.println(maxSum+" "+sindex+" "+eindex);
		
	}
	
}