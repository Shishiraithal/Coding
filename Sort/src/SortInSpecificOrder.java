import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class SortInSpecificOrder {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine().trim());
		while(t-->0){
			int len=Integer.parseInt(br.readLine().trim());
			String [] arr=br.readLine().trim().split(" ");
			int A[]=new int[len];
			int lI=0;
			for(String s:arr){
				int temp=Integer.parseInt(s.trim());
				if(temp%2!=0)
				A[lI++]=temp*-1;
				else
					A[lI++]=temp;
			}
			Arrays.sort(A);
			
			for(int i=0;i<A.length;i=i+1)
				if(A[i]<0)
					System.out.print((A[i]*-1)+" ");
				else
					System.out.print(A[i]+" ");
			System.out.println();
		}
	}
}
