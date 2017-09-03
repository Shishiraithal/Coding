package arrays.searching;

import java.util.Arrays;

public class SearchOnSortedRotatedArray {
	public static void main(String[] args) {

		// O(log n)
		// To apply binarySearch array should be sorted order..
		// Good for where multiple queries to check exist in array or not.
		// For single query it is good to go for linerSearch if array is not
		// sorted..becuase sorting takes o(n*log(n))
		int arr[] = { 4, 5, -2, -1, 0, 1, 2, 3 };
		int find = 2;
		
		//Step1: find pivot
		int pivot=binarySearchToFindPivot(arr, 0, arr.length-1);
		System.out.println("Pivot "+pivot);
		
		//Step2: find element in array by divide using pivot  by checking (0 to pivot) or (pivot to arr.length-1)
		if(arr[0]<=find && find<=arr[pivot-1]){
			// apply binarysearch on 0 to pivot-1
			System.out.println(binarySearch(arr,find,0,pivot-1));
		}
		else{
			//apply binarysearch on pivot to arr.length-1
			System.out.println(binarySearch(arr,find,pivot,arr.length-1));
		}

	}


	// Bala's Recursion solution for Binarysearch
	private static int binarySearchToFindPivot(int[] arr, int startIndex, int endIndex) {

		if (startIndex > endIndex)
			return -1;

		int middleIndex = (startIndex + endIndex) / 2;
		if ((middleIndex+1 < arr.length) && (arr[middleIndex] > arr[middleIndex+1]))
			return middleIndex+1;
		else if (arr[middleIndex] > arr[0])// right
			return binarySearchToFindPivot(arr, middleIndex + 1, endIndex);
		else //left
			return binarySearchToFindPivot(arr, startIndex, middleIndex - 1);

	}
	
	//Bala's binary search recursion
	private static boolean binarySearch(int[] arr, int find, int startIndex, int endIndex) {
		
		if(startIndex>endIndex)
			return false;
		
		int midIndex=(startIndex+endIndex)/2;
		if(arr[midIndex]==find)
			return true;
		else if(arr[midIndex]<find){
			//right
			return binarySearch(arr, find, midIndex+1, endIndex);
		}
		else{
			//left
			return binarySearch(arr, find, startIndex, midIndex-1);
		}
			
	}

}