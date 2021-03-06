import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class TypeOfArray {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			int n=Integer.parseInt(str[0].trim());
			str = br.readLine().trim().split(" ");
			int arr[]=new int[n],i=0;
			for(String st:str)
				arr[i++]=Integer.parseInt(st.trim());
			
			int asc=0,dec=0,max=arr[0];
			for(i=1;i<n;i++){
				if(max<arr[i])
					max=arr[i];
				if(arr[i-1]<=arr[i]){
					asc++;
				}
				else{
					dec++;
				}
			}
			if(dec==0){
				//pw.print("Ascending with maximum element "+max);
				pw.print(max+" 1");
			}
			else if(asc==0){
				//pw.print("Descending with maximum element "+max);
				pw.print(max+" 2");
			}
			else if(dec>=asc){
				//pw.print("Descending rotated with maximum element "+max);
				pw.print(max+" 3");
			}
			else{
				//pw.print("Ascending rotated with maximum element "+max);
				pw.print(max+" 4");
			}
			//code

			pw.println();
		}

		pw.flush();
		pw.close();
	}
}
