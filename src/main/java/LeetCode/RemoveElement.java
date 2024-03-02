package LeetCode;

public class RemoveElement {

	public static int removeEle(int[] nums, int val) {
		
		int neq=0;
		int eq=0;
		int cnt=0;
		
		while(neq<nums.length)
		{
			if(nums[neq]!=val)
			{
				//swap
				
				int temp=nums[neq];
				nums[neq]=nums[eq];
				nums[eq]=temp;
				neq++;
				eq++;
				cnt++;
				
			}
			else {
				neq++;
				
			}
			
		}
		return cnt;

	}

	public static void main(String[] args) {

		int[] nums = { 3, 2, 2, 3 };
		int val = 3;
        System.out.println(removeEle(nums, val));
		
        for(int s: nums)
        {
        	System.out.println(s);
        }

	}
}
