package arrays;

import java.util.Arrays;

public class RotateArrayByNSteps {
	public static void main(String[] args) {
		//Algorithm
		//Divide array into two parts
		//	Part1:0 to arr.length-nsteps and roate
		//	Part2:arr.length-nsteps to nsteps and rotate
		// rotate (part1+part2);
		
		int arr[]={1,2,3,4,5,6,7};
		int n=2;
		
		//step1
		//part1
		rotateArray(arr,0,arr.length-n-1);
		//part2
		rotateArray(arr,arr.length-n,arr.length-1);
		
		//step2:
		rotateArray(arr,0,arr.length-1);
		
	}

	private static void rotateArray(int[] arr,int startIndex,int endIndex) {
		
		int temp=0;
		while(startIndex<endIndex){
			temp=arr[startIndex];
			arr[startIndex]=arr[endIndex];
			arr[endIndex]=temp;
			
			startIndex++;endIndex--;
		}
		System.out.println(Arrays.toString(arr));
	}
	
}