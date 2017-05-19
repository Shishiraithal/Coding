import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

class DISHLIFE {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			//code
			int n=Integer.parseInt(str[0].trim()),k=Integer.parseInt(str[1].trim());
			boolean[] arr=new boolean[k+1];
			int count=0;
			boolean some=false;
			while(n-->0){
				str = br.readLine().trim().split(" ");
				int i=Integer.parseInt(str[0].trim());
				int tCount=0;
				for(int j=1;j<=i;j++){
					int temp=Integer.parseInt(str[j]);
					if(!arr[temp]){
						count++;
						arr[temp]=true;
					}
					else
						tCount++;
				}
				if(tCount==i){
					// some
					some=true;
					//break;
				}
			}
			if(count!=k)
				pw.print("sad");
			else if(some)
				pw.print("some");
			else
				pw.print("all");
			pw.println();
		}

		pw.flush();
		pw.close();
	}
}
