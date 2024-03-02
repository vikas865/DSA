 package Practive5trans;

public class L80AtMost2Duplicate {

	public static int removeDuplicates(int[] nums) {
		
		  if(nums.length<3)
	            return nums.length;

		int indx=2;	
		
		for (int i = 2; i < nums.length; i++) {

			if (nums[i] != nums[indx-2]) {
					
				
				nums[indx]=nums[i];
				indx++;
				
			}
		}

		return indx;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 1,2, 2, 2, 3 };

		System.out.println(removeDuplicates(nums));
  int n=removeDuplicates(nums);
		for (int i = 0; i <n; i++) {
			System.out.print(nums[i]);
		}

	}

}
