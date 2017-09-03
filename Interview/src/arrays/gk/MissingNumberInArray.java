package arrays.gk;

import java.util.Scanner;

public class MissingNumberInArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		while (t-- > 0) {
			int n = scan.nextInt();// n
			// n-1 integres
			int sumOfNNaturalNumbers = ((n) * (n + 1)) / 2;
			int sum = 0;
			while((n)-->1)
			sum += scan.nextInt();
			//System.out.println(sumOfNNaturalNumbers+" "+sum);
			System.out.println(sumOfNNaturalNumbers - sum);
		}
	}
}
