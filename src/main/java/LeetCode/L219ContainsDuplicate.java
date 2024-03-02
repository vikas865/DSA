package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class L219ContainsDuplicate {
	
	 public static boolean containsNearbyDuplicate(int[] nums, int k) {
		 
		 Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		 
		 int index1=Integer.MAX_VALUE;
		 int index2=0;
		 boolean flag=false;
		 
		 for(int i = 0; i < nums.length; i++)
		 {
			 if(map.containsKey(nums[i]))
			 {
				
				 
				 index1=map.get(nums[i]);
				 index2=i;
				
				 flag=Math.abs(index1-index2)<=k;
				 if(flag)
					 break;
			 }
			 
			 map.put(nums[i], i);
		 }
	        
		// System.out.println(index1+" "+index2);
		 return flag;
	    }
	 
	 public static void main(String[] args) {
		
		 int[] nums = {1,0,1,1};
		 int k = 1;
		 System.out.println(containsNearbyDuplicate(nums,k));
	}

}
