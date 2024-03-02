package basics.SlidingWindow;

public class VariableMinSizeSubarraySum {
	
	public static void minsum(int[] arr, int target) {
		int sum=0;
		int ans=0;
		int j=0;
		
		for(int i=0; i< arr.length; i++)
		{
			sum += arr[i]; 
			while(sum>=target)
			{
				
				if(ans==0)
				{
					ans= i-j+1;
				}
				else {
					ans = Math.min(ans, i-j+1);
				}
				
				sum= sum-arr[j];
				j++;
				
				
			}
			
			
		}
		System.out.println(ans);
		
	}
	
	public static void main(String[] args) {
		int[] arr= {2,3,1,2,4,3};
		int target=7; 
		minsum(arr,target);
	}

}
