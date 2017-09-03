package arrays;

import java.util.Arrays;

public class PairsSum {
	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		//sort array
		pairsSum(arr,11);
		System.out.println(Arrays.toString(arr));
	}

	private static void pairsSum(int[] arr,int sum) {
		int startIndex=0,endIndex=arr.length-1;
		
		while(startIndex<=endIndex){
			if(arr[startIndex]+arr[endIndex]==sum){
				System.out.println(arr[startIndex]+" "+arr[endIndex]);
				startIndex++;
			}
			if(arr[startIndex]+arr[endIndex]<sum)
				startIndex++;
			else
				endIndex--;
		}
	}
	
}