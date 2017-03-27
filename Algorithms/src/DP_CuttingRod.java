
public class DP_CuttingRod {

	public static void main(String[] args) {
		System.out.println(CuttingRod(new int[]{1,5,8,9,10,17,17,20},5));
		System.out.println(cutRodDP(new int[]{1,5,8,9,10,17,17,20},5));
	}
	
	//Recursion
	public static int CuttingRod(int prices[],int length){
		if (length <= 0)
            return 0;
        int max_val = Integer.MIN_VALUE;
        // Recursively cut the rod in different pieces and
        // compare different configurations
        for (int i = 0; i<length; i++)
            max_val = Math.max(max_val,
            		prices[i] + CuttingRod(prices, length-i-1));
 
        return max_val;
	}
	
	
	//Dynamic Programming
	public static int cutRodDP(int price[],int n)
    {
        int val[] = new int[n+1];
        val[0] = 0;
        // Build the table val[] in bottom up manner and return
        // the last entry from the table
        for (int i = 1; i<=n; i++)
        {
            int max_val = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++)
                max_val = Math.max(max_val, 
                                   price[j] + val[i-j-1]);
            val[i] = max_val;
        }
        return val[n];
    }
	
}
