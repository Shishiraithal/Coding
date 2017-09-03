package arrays.searching;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {

		// O(log n)
		//To apply binarySearch array should be sorted order..
		//Good for where multiple queries to check exist in array or not.
		//For single query it is good to go for linerSearch if array is not sorted..becuase sorting takes  o(n*log(n))
		int arr[] = { 1, 2, 3, 4, 5, 6, 8 };
		int find = 1;
		binarySearch(arr, find);
		
		System.out.println(binarySearchRecurison(arr,find,0,arr.length-1));

	}

	//Bala's Implementation
	private static boolean binarySearch(int[] arr, int find) {

		int startIndex = 0, endIndex = arr.length - 1, midIndex = 0;

		boolean isPresent = false;
		while (startIndex <= endIndex) {
			midIndex = (startIndex + endIndex) / 2;
			if (arr[midIndex] == find) {
				isPresent = true;
				break;
			} else if (arr[midIndex] > find) {
				// left
				endIndex = midIndex-1;
			} else {
				// right
				startIndex = midIndex+1;
			}
		}
		if (isPresent)
			System.out.println("Present " + find);
		else
			System.out.println("Not Present " + find);

		return isPresent;
	}
	
	//Bala's Recursion solution for Binarysearch
	private static boolean binarySearchRecurison(int[] arr, int find,int startIndex,int endIndex) {
	
		if(startIndex>endIndex)
			return false;
		
		int middleIndex=(startIndex+endIndex)/2;
		if(arr[middleIndex]==find)
			return true;
		else if(arr[middleIndex]<find)//right
			return binarySearchRecurison(arr, find, middleIndex+1, endIndex);
		else 
			return binarySearchRecurison(arr, find, startIndex, middleIndex-1);
		
	}
}