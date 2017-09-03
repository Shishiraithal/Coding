package arrays.searching;

import java.util.Arrays;

public class LinearSearch {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 8 };
		int find = 8;
		linearSearch(arr, find);

	}

	//Bala's Implementation
	private static boolean linearSearch(int[] arr, int find) {

		int index = 0, endIndex = arr.length, midIndex = 0;

		boolean isPresent = false;
		while (index < endIndex) {
			if(arr[index ]==find)
			{
				isPresent=true;break;
			}
			index ++;
		}
		if (isPresent)
			System.out.println("Present " + find +" at "+index);
		else
			System.out.println("Not Present " + find+" at "+index);

		return isPresent;

	}
}