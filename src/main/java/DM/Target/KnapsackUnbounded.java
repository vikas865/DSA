package DM.Target;

public class KnapsackUnbounded {
	
	public static void knapsack(int[] w, int[]  v, int target) {
		int[] dp = new int[target+1];
		
		for(int i =1; i<=target; i++)
		{
			int max=0;
			for(int j= 0 ;j< w.length; j++)
			{
				if(w[j]<= i)
				{
					
					int remc = i-w[j];
					int remv=  dp[remc];
					int total = remv+v[j];
					if(total>max)
					{
						max=total;
					}
					
				}
				
			}
			dp[i]=max;
			
		}
		
		System.out.println(dp[target]);
		
	}
	
	public static void main(String[] args) {
		int[] v= {15,14,10,45,30};
		int[] w = {2,5,1,3,4};
		int target =7;
		
		knapsack(w,v,target);
	}

}
