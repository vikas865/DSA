package Geeks4Geeks;

public class ClimbingStairs {
	
	public static int climb(int n, int[] dp) {
		//O(2^n) space O(n)
		if(n==0)
		{
			return 1;
		}
		if(n<0)
		{
			return 0;
		}
		
		
		if(dp[n] !=0)
		{
			return dp[n];
		}
		
		int path1 =climb(n-1,dp);
		int path2 =climb(n-2,dp);
		//int path3 =climb(n-3);
		
		int res= path1+path2; //+path3;
		dp[n]=res;
		
		return res;
	}
	
	public static int climbTabulation(int n) {
	// o(n) space O(n)	
		int[] dp = new int[n+1];
		
		dp[0]=1;
		for(int i =1; i<=n; i++)
		{
			
			dp[i] = dp[i-1]+ (i-2 >=0 ? dp[i-2] :0);
			
		}
		
		
		
		return dp[n];
	}
	
	
	
	public static int climbSpaceOptimized(int n) {
	// o(n) space O(1)	
		
		
		int prev0=1;
		int prev1 =1;
		for(int i =2; i<=n; i++)
		{
			
			int newprev= prev1+prev0;
			prev0=prev1;
			prev1= newprev;
			
		}
		
		
		
		return prev1;
	}
	
	static final int MOD = 1000000007; 
	
	private static long[][] multiply(long[][] A, long[][] B)
	{
		long[][] c = new long[2][2];
		c[0][0] =( A[0][0]* B[0][0]+ A[0][1]* B[1][0])% MOD;
		c[0][1] =( A[0][0]* B[0][1]+ A[0][1]* B[1][1])% MOD;
		c[1][0] =( A[1][0]* B[0][0]+ A[1][1]* B[1][0])% MOD;
		c[1][1] =( A[1][0]* B[0][1]+ A[1][1]* B[1][1])% MOD;
		
			
		
		return c;
	}
	
	private static long[][] power(long[][] mat,long n)
	{
		if(n==1)
		{
			return mat;
		}
		
		
		long[][] half=  power(mat,n/2);
		long[][]  res= multiply(half,half);
		
		if(n%2==1)
		{
			res= multiply(mat,res);
		}
		
		
		
		return res;
	}
	
	
	public static long matrixExponent(long n) {
		
		 long[][] mat = {{1,1},{1,0}};
		 
		 mat= power(mat,n-1);
		
		return mat[0][0];
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(climb(5, new int[6]));
		System.out.println(climbTabulation(5));
		System.out.println(climbSpaceOptimized(5));
		System.out.println(matrixExponent(6));
	}

}
