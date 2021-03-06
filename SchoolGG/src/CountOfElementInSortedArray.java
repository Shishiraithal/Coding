import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class CountOfElementInSortedArray {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int arr[]={1,1,2,3,3,3,4,5};
		int n=arr.length;
		int val=1;
		
		System.out.println(BinarySearch(arr,n, val,true));
	}

	private static int BinarySearch(int[] arr,int size, int val,boolean first) {
		int low=0;
		int high=size-1;
		int mid=0,result=0;
		while(low<=high){
			mid=(low+high)/2;
			if(arr[mid]==val){
				if(first){
					result=mid;
					high=mid-1;
				}
				else{
					result=mid;
					low=low+1;
				}
			}
			else if(val<arr[mid]){
				high=mid-1;
			}
			else{
				low=mid+1;
			}
		}
		return result;
	}
}
