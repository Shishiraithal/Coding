import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;


public class K_largest {
	public static void main(String[] args) throws Exception {
		int arr[]={1, 23, 12, 9, 30, 2, 50};
		//bubble
		largestKbyBubble(arr);
		
	}
	public static int largestKbyBubble(int arr[]){
		System.out.println(Arrays.toString(arr));
		int len=arr.length;
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(arr[i]>arr[j])
				{
					int tem=arr[i];
					arr[i]=arr[j];
					arr[j]=tem;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
		return 0;
		
	}
}
