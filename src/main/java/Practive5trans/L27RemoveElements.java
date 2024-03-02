package Practive5trans;

public class L27RemoveElements {
	
	
	 public static int removeElement(int[] nums, int val) {
	        
			int cnt=0;
			

	        for(int i=0; i<nums.length;i++){
	            if(nums[i]!=val){
	                nums[cnt]=nums[i];
	                cnt++;
	            }

	        }
			
			return cnt;

	        
	    }
	
	
	public static void main(String[] args) {
		int[] nums = {3,2,2,3};
		int val = 3;
		int n=removeElement(nums,val);
		System.out.println(n);
		for (int i=0;i<n;i++)
			System.out.println(nums[i]);
	}

}
