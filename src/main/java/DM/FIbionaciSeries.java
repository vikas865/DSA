package DM;

public class FIbionaciSeries {
	
	public static int fib(int n, int[] dp)
	{
		
		if(n==0 || n==1)
		{
			return n;
			
		}
		
		if(dp[n] !=0)
		{
			return dp[n];
		}
		
		System.out.println("heelo"+n);
		int fib1 = fib(n-1,dp);
		int fib2=fib(n-2,dp);
		int fibn=fib1+fib2;
		dp[n]=fibn;
		
		return fibn;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(fib(5,new int[6]));
	}

}
