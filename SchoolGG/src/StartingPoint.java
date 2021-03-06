import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;


public class StartingPoint {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			//code
			int cX=Integer.parseInt(str[0].trim()),cY=Integer.parseInt(str[1].trim());
			str = br.readLine().trim().split(" ");
			int n=Integer.parseInt(str[0].trim());
			int aX[]=new int[n],aY[]=new int[n];
			str = br.readLine().trim().split(" ");
			int x=cX,y=cY;
			for(int i=0,ind=0;i<2*n;i+=2){
				aX[ind]=Integer.parseInt(str[i].trim());
				aY[ind]=Integer.parseInt(str[i+1].trim());
				
				x=x-aX[ind];
				y=y-aY[ind];

				ind++;
			}
		
			pw.println(x+" "+y);
		}

		pw.flush();
		pw.close();
	}
}
