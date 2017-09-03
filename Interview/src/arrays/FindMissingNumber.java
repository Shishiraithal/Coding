package arrays;

import java.util.Arrays;

public class FindMissingNumber {
	public static void main(String[] args) {
		
		int arr[]={1,2,4,5,6};
		findMissingNumberUsingXOR(arr);
		findMissingNumberUsingSum(arr);
	}

	private static void findMissingNumberUsingXOR(int[] arr) {
		//Main algo is x^x=0;0^0=0;		x^0=x;0^x=x;, means x odd number if xors= x; x even number of xors= 0;
		int startIndex=0,endIndex=arr.length-1;
		
		int xor=0;
		while((startIndex<=endIndex)){
			xor^=arr[startIndex];
			startIndex++;
		}
		startIndex=1;
		endIndex=arr.length+1;
		while((startIndex<=endIndex)){
			xor^=startIndex;
			startIndex++;
		}
		System.out.println(xor);
	}
	
	private static void findMissingNumberUsingSum(int[] arr){
		int sum=((arr.length+1)*(arr.length+2))/2;
		for(int val:arr)
			sum=sum-val;
		System.out.println(sum);
	}
	
}