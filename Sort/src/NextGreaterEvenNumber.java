import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


class NextGreaterEvenNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine().trim());
		while(t-->0){
			String num=br.readLine().trim();
			if(num.contains("0")||num.contains("2")||num.contains("4")||num.contains("6")||num.contains("8"))
			{
				
			}
			else
				System.out.println(-1);
		}
	}
}
