package DM;

public class HouseRobbery {
	
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
		
		System.out.println(getMaxLoot(nums));
		
	}

}
