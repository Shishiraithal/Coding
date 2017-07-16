import java.util.*;
import java.lang.*;
 
class df
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int arr[]=new int[1+a];
		for(int i=0;i<a;i++)
		arr[i]=scan.nextInt();
		int b=scan.nextInt();
		boolean dp[]=new boolean[201];
		for(int i=0;i<b;i++)
		dp[100+scan.nextInt()]=true;
		for(int i=0;i<a;i++)
		if(dp[100+arr[i]])
		System.out.print(arr[i]+" ");
	}
} 