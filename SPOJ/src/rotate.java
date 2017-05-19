import java.util.*;
public class rotate {
	public static int arr[][], n;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, j;// =input.nextInt(),j=input.nextInt();
		n = input.nextInt();
		int flag = input.nextInt();
		arr = new int[n][n];
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				arr[i][j] = input.nextInt();
			}
		}
		rotate();
		if (flag == 1) {
			for (i = 0; i < n; i++) {
				for (j = 0; j < n; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
		else{
			for (i = n-1; i >=0; i--) {
				for (j = n-1; j >=0; j--) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	public static void rotate() {
		int i, j, temp;
		for (i = 0; i < n; i++) {
			for (j = i; j < n; j++) {
				if (i != j) {
					arr[i][j] ^= arr[j][i];
					arr[j][i] ^= arr[i][j];
					arr[i][j] ^= arr[j][i];
				}
			}
		}
		for (i = 0; i < n / 2; i++) {
			for (j = 0; j < n; j++) {
				arr[j][i] ^= arr[j][n - 1 - i];
				arr[j][n - 1 - i] ^= arr[j][i];
				arr[j][i] ^= arr[j][n - 1 - i];
			}
		}
	}
}