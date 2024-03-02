package Practive5trans;

public class HighestSumOfSubArray {
	
	
	public static int getSumMax(int[] nums) {
		int currentmax = nums[0];
		int totalmax = nums[0];
		
		for( int i = 1; i < nums.length; i++) {
			    
			currentmax= Math.max(currentmax, nums[i]+currentmax);
			totalmax= Math.max(totalmax, currentmax );
			
		}
		
		
		return totalmax;
		
		
	}
	
	
	public static int getSumMin(int[] nums) {
		int currentmin = nums[0];
		int totalmin = nums[0];
	
		for(int i = 1; i < nums.length; i++) {
			currentmin= Math.min(currentmin, nums[i]+currentmin);
			totalmin = Math.min(totalmin,currentmin );
			
		}
		
		return totalmin;
	}
	
	
	
	public static void main(String[] args) {
	
		
		int[] nums = {7,1,3,-5};
		
		System.out.println(getSumMax(nums));
		System.out.println(getSumMin(nums));
		
		
		
	}

}
