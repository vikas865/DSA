package DM;

public class ClimbingStairs {
	
	public static int stairPath(int n, int[] dp) {
		if(n==0)
		{
			return 1;
			
		}
		else if(n<0)
		{
			return 0;
		}
		
		if(dp[n] !=0)
		{
			return dp[n];
		}
		
		System.out.println("hello" +n);
		int n1= stairPath(n-1,dp);
		int n2= stairPath(n-2,dp);
		int n3= stairPath(n-3,dp);
		int res = n1+n2+n3;
		dp[n]=res;
		
		return res;
	}
	
	public static int stairPathTabulation(int n) {
	
		int[] dp = new int[n+1];
		dp[0]=1;
		
		for(int i=1 ;i<=n; i++)
		{
			if(i==1)
			{
				dp[i] = dp[i-1];
			}else if(i==2) {
				dp[i] = dp[i-1] + dp[i-2];
			}
			else {
			dp[i] = dp[i-1] + dp[i-2]+ dp[i-3];
			}
			
		}
		
		
		return dp[n];
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(stairPath(6, new int[7]));
		System.out.println(stairPathTabulation(6));
	}

}
