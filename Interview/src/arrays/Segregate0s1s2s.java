package arrays;

import java.util.Arrays;

public class Segregate0s1s2s {
	public static void main(String[] args) {
		
		int arr[]={0,1,0,0,1,2,0,0,1,2};
		segregate(arr);
		System.out.println("Result :"+Arrays.toString(arr));
	}

	private static void segregate(int[] arr) {
		int startIndex=0,endIndex=arr.length-1;
		
		int zerosIndex=0,twosIndex=arr.length-1;
		
		while((startIndex<=twosIndex)){
			if(arr[startIndex]==0){
				int temp=arr[zerosIndex];
				arr[zerosIndex]=arr[startIndex];
				arr[startIndex]=temp;
				zerosIndex++;startIndex++;
			}
			else if(arr[startIndex]==1){
				startIndex++;
			}
			else{//2
				int temp=arr[twosIndex];
				arr[twosIndex]=arr[startIndex];
				arr[startIndex]=temp;
				twosIndex--;
			}
			System.out.println(Arrays.toString(arr));
			System.out.println(zerosIndex+" "+twosIndex);
		}
		
	}
	
}