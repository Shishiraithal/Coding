package arrays;

import java.util.Arrays;

public class ZigZagArray {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		zigZagArray(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void zigZagArray(int[] arr) {
		
		
		//Step1
		boolean flag=false;
		if(arr[0]<arr[1])
			flag=true;
		int index=0,temp;
		while(index<arr.length-1){
			if(flag)
			if(!(arr[index]<arr[index+1])){
				temp=arr[index];
				arr[index]=arr[index+1];
				arr[index+1]=temp;
			}
			
			if(!flag)
				if(arr[index]<arr[index+1]){
					temp=arr[index];
					arr[index]=arr[index+1];
					arr[index+1]=temp;
				}
			flag=!flag;
			index++;
		}
		System.out.println(Arrays.toString(arr));
	}

}