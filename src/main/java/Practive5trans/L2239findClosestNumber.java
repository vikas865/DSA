package Practive5trans;

public final class L2239findClosestNumber {

	
	public static int get(int[] nums ) {
		
		 int ans = nums[0] , diff = Math.abs(nums[0]);
	        for(int i=1; i<nums.length; i++){
	            if(Math.abs(nums[i]) < diff){
	                ans = nums[i];
	                diff = Math.abs(nums[i]);
	            }
	            if(diff == Math.abs(nums[i]) && nums[i] > ans){
	                ans = nums[i];
	            }
	        }
	        return ans;
	}
	
	
	public static void main(String[] args) {
		//int [] arr = {-4,-2,1,4,8};
		int [] arr ={2,-1,1,2};
		System.out.println(get(arr));
		
	
	}
}
