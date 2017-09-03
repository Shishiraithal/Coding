import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Stack;


public class RatMaze {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine().trim());
		int maze[][]=new int[n][n];
		for(int i=0;i<n;i++){
			String row[]=br.readLine().split(" ");
			int j=0;
			for(String str:row){
				maze[i][j++]=Integer.parseInt(str.trim());
			}
		}
		System.out.println("I/P: "+Arrays.deepToString(maze));
		
		int[][] pathsMaze=RatMazePathsCount(maze);
		
		//if maze have possible paths
		if(pathsMaze[n-1][n-1]>0){
			Stack<Location> dfs=new Stack<Location>();
			Location root=new Location(0,0);
			dfs.push(root);
			while(!dfs.isEmpty()){
				Location now=dfs.pop();
				int x=now.x,y=now.y;
				if(x+1<n && pathsMaze[x+1][y]>0){
					dfs.push(new Location(x+1, y));
				}
				else if(y+1<n){
					dfs.push(new Location(x, y+1));
				}
				System.out.println(now.x+","+now.y);
			}
		}
		
		
		pw.flush();
		pw.close();
	}
	public static int[][] RatMazePathsCount(int[][]maze){
		int size=maze.length;
		int dp[][]=new int[size][size];
		dp[0][0]=1;
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(maze[i][j]!=1){//blocker
					if(j-1>=0)
						dp[i][j]+=dp[i][j-1];
					if(i-1>=0)
						dp[i][j]+=dp[i-1][j];
				}
			}
		}
		System.out.println(Arrays.deepToString(dp));
		System.out.println("Possible paths: "+dp[size-1][size-1]);
		return dp;
		
	}
}
class Location{
	int x,y;
	public Location(int x,int y) {
		this.x=x;
		this.y=y;
	}
}