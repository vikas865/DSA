package DM.Target;

import java.util.Arrays;

public class KnapsackProblem {
	
	public static void knapsack(int[] w, int[]  v, int target) {
		
		int[][] dp = new int[w.length+1][target+1];
		
		for(int i=1; i<dp.length; i++)
		{
			for(int j =1; j<dp[0].length; j++)
			{
				
				if(j>=w[i-1])
				{
					
					if(dp[i-1][j-w[i-1]]+v[i-1] > dp[i-1][j])
					{
						
						int p =  dp[i-1][j-w[i-1]]+v[i-1];
						dp[i][j]=p;
						
						
					}else
					{
						int np =dp[i-1][j];
						dp[i][j]= np;
					}
				
					
					
				}else
				{
					int np =dp[i-1][j];
					dp[i][j]= np;
				}
				
				
			}
			
		}
		
		System.out.println(Arrays.toString(dp[w.length]));
	
		System.out.println(dp[w.length][target]);
		
		
	}
	
	public static void main(String[] args) {
		int[] v= {15,14,10,45,30};
		int[] w = {2,5,1,3,4};
		int target =7;
		
		knapsack(w,v,target);
	}

}
