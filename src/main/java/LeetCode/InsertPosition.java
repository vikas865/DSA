package LeetCode;

public class InsertPosition {
	
	public static int getposition(int[] arr, int val) {
		
		int i=0;
		for( i=0;i<arr.length;i++) {
			if(arr[i]==val)
			{
				return i;
			}
			else if(arr[i]>val)
			{
				return i-1;
			}
			
			
		}
		
		return i;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int target = 7;
		
		System.out.println(getposition(nums,target));
		
	}

}
