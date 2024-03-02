package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class L1TwoSums {

	 public static int[] twoSum(int[] nums, int target) {
		 
		 Map<Integer,Integer> numset= new HashMap<Integer,Integer>();
			int[] res = new int[2];
			
			for(int i=0; i<nums.length;i++)
			{
				
					
			
				
				if(numset.containsKey(target-nums[i])) {
					
					//System.out.println(arr[i] +" ->"+numset.get(target-arr[i])+" "+i );
					//res[0]= numset.get(target-nums[i]);
					//res[1]=i;
					
					return new int[] {numset.get(target-nums[i]),i};
					
				}
				
				numset.put(nums[i],i);
				
				
			}
	        return res;
	 }
	
	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		
	

	}
}
