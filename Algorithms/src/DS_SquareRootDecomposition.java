import java.util.Arrays;

public class DS_SquareRootDecomposition {
	public static void main(String[] args) throws Exception {
		long arr[];
		arr=new long[]{5,3,5,3,2,4,5,3,1,6};
		
		//build
		int size=arr.length;
		int blockSize=(int) Math.ceil(Math.sqrt(size));
		long blocks[]=new long[blockSize];
		
		for(int i=0;i<size;i++){
			blocks[i/blockSize]+=arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(blocks)+" "+blockSize);
		
		//update 
		//suppose at index 5
		int updateIndex=5;
		int updateValue=10;
		long oldValue=arr[updateIndex];
		blocks[updateIndex/blockSize]+=(updateValue-oldValue);
		arr[updateIndex]=updateIndex;
		
		System.out.println(Arrays.toString(blocks)+" "+blockSize);
		
		//query
		//suppose l=3,r=9
		int l=3,r=9;
		long sum=0;
		
		//sum up first overlapping block if any
		for(int start=l;start<(blockSize*(l/blockSize +1));start++){
			sum+=arr[start];
		}

		//sum up non overlapping blocks
		for(int i= (l/blockSize +1);i<(r/blockSize);i++)
			sum+=blocks[i];
		
		//sum up last overlapping block if any
		for(int end=(blockSize*(r/blockSize));end<=r;end++){
			sum+=arr[end];
		}
		
		System.out.println(sum);
		
	}
}
