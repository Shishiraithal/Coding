import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;


class ROWSOLD {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		long t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str = br.readLine().trim();
			//code
			ArrayList<Long> ones = new ArrayList<Long>();
			ArrayList<Long> zeros = new ArrayList<Long>();
			
			boolean begin=true;
			long onesCount=0,zerosCount=0;
			for(int i=0;i<str.length();i++){
				 if(begin&&str.charAt(i)=='0') //neglecting begining trailing zeros
					 continue;
				else if(begin&&str.charAt(i)=='1'){
					begin=false;
					onesCount=1;
				}
				else if(str.charAt(i)=='1'){
					if(zerosCount>0)
						zeros.add(zerosCount);
					zerosCount=0;
					onesCount++;
				}
				else{// 0
					if(onesCount>0)
						ones.add(onesCount);
					onesCount=0;
					zerosCount++;
				}
			}
			if(zerosCount>0)
				zeros.add(zerosCount);
			// System.out.println(ones+" "+zeros);
			
			long total=0;
			long continueOnes=0;
			for(int i=0;i<ones.size();i++){
				//formula : no.of1's * (no.of0's+1)
				total=total+((ones.get(i)+continueOnes)*(zeros.get(i)+1));
				continueOnes+=ones.get(i);
			}
			if(ones.size()==0||zeros.size()==0)
				pw.print(0);
			else
				pw.print(total);
			pw.println();
		}

		pw.flush();
		pw.close();
	}
}
