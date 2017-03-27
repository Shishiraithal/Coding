
public class DP_CoinChange {
	public static void main(String[] args) {
		System.out.println(coinChange(new int[]{1,5,8,9,10,17,17,20},5));
		System.out.println(coinChangeDP(new int[]{1,5,8,9,10,17,17,20},5));
	}
	
	//Recursion
	public static int coinChange(int prices[],int length){
		if (length <= 0)
            return 0;
        int min_val = Integer.MAX_VALUE;
        // Recursively cut the rod in different pieces and
        // compare different configurations
        for (int i = 0; i<length; i++)
        	min_val =1+ Math.min(min_val,
            		 coinChange(prices,length-prices[i]));
 
        return min_val;
	}
	
	
	//Dynamic Programming
	public static int coinChangeDP(int coins[],int amout)
    {
		int amoutDP[]=new int[amout+1];
		amoutDP[0]=0;
		int noOfConins=coins.length;
		for(int i=1;i<=amout;i++){
			int min=Integer.MAX_VALUE;
			for(int j=0;j<noOfConins;j++){
				int temp=i-coins[j];
				if(temp>=0)
					min=Math.min(min, amoutDP[temp]);
			}
			amoutDP[i]=min+1;
		}
        return amoutDP[amout];
    }
	
}
