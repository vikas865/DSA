package Practive5trans;

public class L55JumpGame {

	public static boolean canJump(int[] nums) {
		
		
		int finalposition=nums.length-1;
		
		
		for (int i = nums.length-2;i >=0 ;i-- )
		{
			if(i+nums[i]>= finalposition)
			{
				finalposition=i;
			}
			
		}
		
	

		return finalposition==0;
	}

	public static void main(String[] args) {
		// int[] nums = {2,3,1,1,4};
		 int[] nums = {1,2,3};
		//int[] nums = { 3, 2, 1, 0, 4 };
		System.out.println(canJump(nums));
	}

}
