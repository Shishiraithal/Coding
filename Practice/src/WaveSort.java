import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class WaveSort {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		//inp1
		//int inp[]={1,4,3,2,0,6};
		//inp2
		int []inp={0,1,2,3,4,5,6};
		int len=inp.length;
		
		for(int i=0;i<len;i++){
			if(i%2==0){
				//up to down
				if(i+1<len && inp[i]<inp[i+1])
				{
					//swap
					int temp=inp[i];
					inp[i]=inp[i+1];
					inp[i+1]=temp;
				}
			}else{
				//down to up
				if(i+1<len && inp[i]>inp[i+1])
				{
					//swap
					int temp=inp[i];
					inp[i]=inp[i+1];
					inp[i+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(inp));
		
		pw.flush();
		pw.close();
	}
}
