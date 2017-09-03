package arrays.sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int arr[]={3,2,4,4,3,2,7};
		mergesort(arr,0,arr.length-1,new int[arr.length]);
	}

	private static void mergesort(int[] arr,int startIndex,int endIndex,int temp[]) {
		if(startIndex>=endIndex)
			return;
		
		int midIndex=(startIndex+endIndex)/2;
		mergesort(arr, startIndex, midIndex,temp);
		mergesort(arr, midIndex+1, endIndex,temp);
		merge(arr, startIndex, midIndex, endIndex,temp);
	}

	private static void merge(int[] arr, int startIndex, int midIndex, int endIndex,int []temp) {
		
		int startIndex1=startIndex,startIndex2=midIndex+1,endIndex1=midIndex,endIndex2=endIndex;
		int start=startIndex,end=endIndex;
		
		while((startIndex1<=endIndex1)&&(startIndex2<=endIndex2))
		{
			if(arr[startIndex1]<=arr[startIndex2]){
				temp[startIndex]=arr[startIndex1];
				startIndex1++;
				startIndex++;
			}
			else{
				temp[startIndex]=arr[startIndex2];
				startIndex2++;
				startIndex++;
			}
		}
		while(startIndex1<=endIndex1){
			temp[startIndex]=arr[startIndex1];
			startIndex1++;
			startIndex++;
		}
		while(startIndex2<=endIndex2){
			temp[startIndex]=arr[startIndex2];
			startIndex2++;
			startIndex++;
		}
		System.out.println(Arrays.toString(arr)+" -");
		System.out.println(Arrays.toString(temp));
		for(int i=start;i<=end;i++){
			arr[i]=temp[i];
		}
	}
	
}