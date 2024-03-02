package Practive5trans;

public class L26RemoveDuplicatefromArray {
	
	  public static int removeDuplicates(int[] nums) {
		  int first=0;
		 
		  for(int i=1;i<nums.length;i++)
		  {
			  if(nums[first]!=nums[i]) {
				  
			    first++;
			    nums[first]=nums[i];
				
				  
				 
				  
			  }
			 
		  }
		  
		  return first+1;
	  }
	
	

	public static void main(String[] args) {
		
		int[] nums= {1,1,2};
	
		System.out.println(removeDuplicates(nums));
		
		 for(int i=0;i<removeDuplicates(nums);i++)
		 {
			 System.out.println(nums[i]);
		 }

	}

}
