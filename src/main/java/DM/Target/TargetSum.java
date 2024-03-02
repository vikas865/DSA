package DM.Target;

public class TargetSum {
	
	public static void sumsubset(int[] arr , int target)
	{
		boolean [][] dp = new boolean [arr.length+1][target+1];
		
		for(int i = 0; i< dp.length ; i++)
		{
			
			for(int j = 0 ; j< dp[0].length ; j++)
			{
				
				if(i==0 && j==0)
				{
					dp[i][j]= true;
				}else if(i==0) {
					dp[i][j]= false;
				}else if(j==0)
				{
					dp[i][j]= true;
				}else
				{
					if(dp[i-1][j]== true)
					{
						dp[i][j]= true;
					}else
					{
						int val= arr[i-1];
						if(j>=val)
						{
							if(dp[i-1][j-val]== true)
							{
								dp[i][j]= true;
							}
							
						}
								
						
					}
					
				}
					
				
			}
			
		}
		
		System.out.println(dp[arr.length][target]);
		
		
	}
	
	public static void main(String[] args) {
		int[] arr= {4,2,7,1,3};
		sumsubset(arr,10);
		
	}

}
