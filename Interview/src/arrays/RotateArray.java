package arrays;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,5,6,7};
		rotateArray(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void rotateArray(int[] arr) {
		int startIndex=0,endIndex=arr.length-1;
		
		int temp=0;
		while(startIndex<endIndex){
			temp=arr[startIndex];
			arr[startIndex]=arr[endIndex];
			arr[endIndex]=temp;
			
			startIndex++;endIndex--;
		}
	}
	
}