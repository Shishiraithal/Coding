import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class BooleanMatrixProblem {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0].trim());
			int m = Integer.parseInt(str[1].trim());

			str=br.readLine().trim().split(" ");
			int inp[][]=new int[n][m];
			int i=0,j=0;
			for(String s:str){
				inp[i][j++]=Integer.parseInt(s.trim());
				if(j==m){
					i++;
					j=0;
				}
			}
			//System.out.println(Arrays.deepToString(inp));
			boolean rows[]=new boolean[n],cols[]=new boolean[m];
			for( i=0;i<n;i++)
				for(j=0;j<m;j++){
					if(inp[i][j]==1){
						rows[i]=true;
						cols[j]=true;
					}
				}
			
			//System.out.println(Arrays.toString(rows));
			//System.out.println(Arrays.toString(cols));
			
			for( i=0;i<n;i++){
				for(j=0;j<m;j++){
					if(rows[i]||cols[j])
						pw.print("1 ");
					else
						pw.print("0 ");
				}
			}
			pw.println();
		}
		pw.flush();
		pw.close();
	}
}
