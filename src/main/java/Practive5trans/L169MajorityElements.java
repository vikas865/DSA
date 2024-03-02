package Practive5trans;

public class L169MajorityElements {
	
	
	  public static int majorityElement(int[] nums) {
		 //Moore's voting algorithm 
		  int majority=nums[0];
		  int vote=1;
		  
		  //{2,2,1,1,1,2,2}
		 
		  for(int i = 1;i<nums.length ;i++)
		  {
			  
			if(majority==nums[i])
			{
				//increment vote
				vote++;
			}
			else {
				
				vote--;
				
				
			}
			
			if(vote==0)
			{
				majority=nums[i];
				vote=1;
			}
			
			
			  
			
		  }
		  
		  
		  
		  
		  return majority;
	        
	    }
	
	
	public static void main(String[] args) {
	//	int[] nums= {6,5,5};
		//int[] nums= {8,9,8,9,8};
		//int[] nums= {2,2,1,1,1,2,2};
		int[] nums= {1,3,1,1,4,1,1,5,1,1,6,2,2};
		//int[] nums= {3,3,4};
		
		System.out.println(majorityElement(nums));
	}

}
