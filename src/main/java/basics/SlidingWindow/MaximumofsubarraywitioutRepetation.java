package basics.SlidingWindow;

import java.util.HashMap;

public class MaximumofsubarraywitioutRepetation {

	
	public static void maxSum(int[] arr, int k)
	{
		int sum=0 , ans=0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<k;i++)
		{
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			
			
			sum += arr[i];
			
		}
		
		if(map.size()==k)
		{
			ans=sum;
		} 
		
		int j=0;
		for(int i=k; i<arr.length;i++)
		{
			
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			
			
			sum =  sum - arr[j]+arr[i];
			if(map.get(arr[j])>1)
			{
				map.put(arr[j], map.get(arr[j])-1);
			}
			else {
				
				map.remove(arr[j]);
			}
			
			j++;
			
			if(map.size()==k) {
				ans= Math.max(ans, sum);
			}
				
		}
		
		System.out.println(ans);
		
	}
	
	public static void main(String[] args) {
		int[] arr= {1,5,4,2,9,9,9};
		maxSum(arr,3);
	}
}
