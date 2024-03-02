package newPrac;

public class ClimbStairs {
	
	 public static int climbStairs(int n) {
		 int[] dp = new int[n+1];
		 dp[0]=1;
		 
		 for(int i = 1; i < dp.length ; i++ )
		 {
			 if(i-2<0)
			 {
			 dp[i] = dp[i-1];
			 }else
			 {
				 dp[i]= dp[i-1]+dp[i-2];
			 }
			 
		 }
		 
	        
		 return dp[n];
	    }

	 
	 public static void main(String[] args) {
		System.out.println(climbStairs(3));
	}
}
