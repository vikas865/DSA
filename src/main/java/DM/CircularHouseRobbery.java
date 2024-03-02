package DM;

public class CircularHouseRobbery {
	
	
	public static int circularLoot(int[] nums)
	{
		
		
		int[] skipfirsthouse= new int[nums.length-1];
		int[] skipLasthouse= new int[nums.length-1];
		
		for(int i=0;i<nums.length-1;i++)
		{
			skipLasthouse[i]=nums[i];
			skipfirsthouse[i]=nums[i+1];
			
		}
		
		  int res = Math.max(getMaxLoot(skipLasthouse),getMaxLoot(skipfirsthouse));
		
		
		return res;
	}
	
	
	
	public static int getMaxLoot(int[] nums)
	{
		
		int[] res =  new int[nums.length];
		res[0] = nums[0];
		res[1]= nums[1];
		//  nums[n-2]+nums[i], nums[n-1]
		
		
		for(int i = 2; i<nums.length;i++)
		{
		res[i]=	Math.max(res[i-2]+nums[i], res[i-1]);
			
		}
		
		return res[nums.length-1];
	}
	
	
	public static void main(String[] args) {
		
		int[] nums = {2,7,3,1,4,2,8};
		System.out.println(circularLoot(nums));
		
	}

}
