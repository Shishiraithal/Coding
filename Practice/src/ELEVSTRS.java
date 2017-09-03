import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ELEVSTRS {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		float sqrt2=(float) Math.sqrt(2);
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			//String sArr[]=br.readLine().trim().split(" ");
			float n = Float.parseFloat(str[0].trim());
			float v1 = Float.parseFloat(str[1].trim());
			float v2 = Float.parseFloat(str[2].trim());
			
			float stairs=sqrt2*n;
			stairs=stairs/v1;
			
			float evevator=2*n;
			evevator=evevator/v2;
			
			if(evevator<stairs){
				pw.println("Elevator");
			}
			else {
				pw.println("Stairs");
			}
		}
		pw.flush();
		pw.close();
	}
}
