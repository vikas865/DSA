package DM;

public class MaxSumOfSubarray {

	
	
	public static int getmaxSum(int[] arr, int k) {
	
		
		int maxsum=Integer.MIN_VALUE;
		
		
		for( int i = 0; i+k <= arr.length; i++) {
			int temp=0;
			for(int j=i; j<i+k;j++) {
				
			temp = temp+arr[j];
			
			
			}
			maxsum=Math.max(maxsum,temp );
			
			
			
		}
		
		return maxsum;
	}
	
	public static int getmaxSumDP(int[] arr, int k) {
		
		int res=0;
		int maxsum= Integer.MIN_VALUE;
		
		for(int i = 0; i < k; i++)
		{
			res +=arr[i];
			
		}
		
		
		int currensum=res;
		for(int j = k; j < arr.length; j++)
		{
			 
			currensum+=arr[j]-arr[j-k];
			maxsum=Math.max(currensum, maxsum);
			
		}
		
		
		
		
		return maxsum;
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {100, 200, 300, 400};
		int k = 2;
		
		System.out.println(getmaxSum(arr,k));
		
		System.out.println(getmaxSumDP(arr,2)  );
	
		
	}
}
