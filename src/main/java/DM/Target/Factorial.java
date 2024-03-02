package DM.Target;

import java.util.Arrays;

public class Factorial {
	public static int  fact(int n, int[] dp) {
		
		if(n==0)
		{
			return 1;
		}
//		if(dp[n] !=0)
//		{
//			return dp[n];
//		}
		
		System.out.println(n);
			int f= n*fact(n-1,dp);
			dp[n]=f;
			
			//System.out.println(Arrays.toString(dp));
			
			return f;
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(fact(5, new int[6]));
	}

}
