import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;


public class MMul {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			//code
			int n=Integer.parseInt(str[0]),m=Integer.parseInt(str[1]);
			int mat1[][]=new int[n][m];
			str = br.readLine().trim().split(" ");
			for(int ind=0,i=0;i<n;i++)
				for(int j=0;j<m;j++)
					mat1[i][j]=Integer.parseInt(str[ind++]);
			str = br.readLine().trim().split(" ");
			int n1=Integer.parseInt(str[0]),m1=Integer.parseInt(str[1]);
			int mat2[][]=new int[n1][m1];
			str = br.readLine().trim().split(" ");
			for(int ind=0,i=0;i<n1;i++)
				for(int j=0;j<m1;j++)
					mat2[i][j]=Integer.parseInt(str[ind++]);
			if(m!=n1){
				//invalid
				System.out.print("IMPOSSIBLE");
			}
			else{
				int result[][]=new int[n][m1];
				for(int i=0;i<n;i++){
					for(int j=0;j<m1;j++){
						int tVal=0;
						for(int k=0;k<m;k++){
							tVal+=(mat1[i][k]*mat2[k][j]);
						}
						result[i][j]=tVal;
					}
				}
				//System.out.println("result "+Arrays.deepToString(result));
				for(int i=0;i<n;i++){
					for(int j=0;j<m1;j++){
						System.out.print(result[i][j]+" ");
					}}
				System.out.println();
			}
			pw.println();
		}

		pw.flush();
		pw.close();
	}
}
