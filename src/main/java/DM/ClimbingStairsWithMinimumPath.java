package DM;

import java.util.Arrays;

public class ClimbingStairsWithMinimumPath {

	public static int stairsJump(int num , int[] jump)
	{
		Integer[] res = new Integer[num+1];
		res[num]=0;
		
		
		for(int i =num-1 ; i>=0; i--)
		{
			
			if(jump[i]>0)
			{
				int min= Integer.MAX_VALUE;
			for(int j=1;j <= jump[i] && i+j< res.length ;j++)
			{
				if(res[i+j] != null)
				{
				
				min = Math.min(min, res[i+j]);
				}
			}
			
			if(min != Integer.MAX_VALUE)
			{
				res[i]= min+1;
			}
			else
			{
				res[i]= null;
			}
			}
		}
		
		System.out.println(Arrays.toString(res));
		
		return res[0];
	}
	
	
	public static void main(String[] args) {
		
		int[] jump = {3,2,4,2,0,2,3,1,2,2};
		System.out.println(stairsJump(10,jump));
		
	}
}
