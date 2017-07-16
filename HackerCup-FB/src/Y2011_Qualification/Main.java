package Y2011_Qualification;

import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception {
		
		int t = Integer.parseInt(br.readLine());
		int player=0,lead=0;
		for (int test = 1; test <= t; test++) {
			String st[]=br.readLine().trim().split(" ");
			int ta[]=new int[]{Integer.parseInt(st[0],Integer.parseInt(st[1]))};
			int v=ta[0]-ta[1];
			if(v>0){
				if(v>lead){
					lead=v;
					player=1;
				}
			}
			else{
				if(-v>lead){
					lead=-v;
					player=2;
				}
			}
		}
		System.out.println(player+" "+lead);
	}
}
