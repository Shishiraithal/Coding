import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long val = input.nextLong();

		long mid = (val+1) / 2;
		long inc = 1;
		for (long j = 0; j <= val; j++) {
			for (long i = 1; i <= val; i++) {
				if (i == (mid)){
					if(j==0)
						System.out.print(val+" ");
					else
						System.out.print(j+" ");
				}
				else
					System.out.print(val+" ");
			}
			System.out.println();
		}
	}
}
