import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;


public class LengthOfLargestRegionOf1s {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			int n=Integer.parseInt(str[0].trim()),m=Integer.parseInt(str[1].trim());
			str = br.readLine().trim().split(" ");
			//code
			int arr[][]=new int[n][m];
			int flag[][]=new int[n][m];
			int i=0,j=0;
			int nn[]=new int[n*m];
			int mm[]=new int[n*m],nm=0;
			for(String st:str){
				arr[i][j]=Integer.parseInt(st.trim());
				if(arr[i][j]==1){
					nn[nm]=i;
					mm[nm]=j;
					nm++;
				}
				j++;
				if(j==m){
					j=0;i++;}
			}
			
			for( i=0;i<nm;i++){
				int a1=nn[i],b1=mm[i];
				if(arr[a1][b1]==1){
					//8conditions
					if(a1-1>=0&&b1-1>=0&&arr[a1-1][b1-1]==1){
						
					}
					if(a1-1>=0&&arr[a1-1][b1]==1){
						
					}
					if(a1-1>=0&&b1+1<m&&arr[a1-1][b1+1]==1){
						
					}
					if(b1-1>=0&&arr[a1][b1-1]==1){
						
					}
					if(b1+1<m&&arr[a1][b1+1]==1){
						
					}
					if(a1+1<n&&b1-1>=0&&arr[a1+1][b1-1]==1){
						
					}
					if(a1+1<n&&b1-1>=0&&arr[a1+1][b1]==1){
						
					}
					if(a1+1<n&&b1+1<m&&arr[a1+1][b1+1]==1){
						
					}
							
				}
			}
			pw.println();
		}

		pw.flush();
		pw.close();
	}
}
