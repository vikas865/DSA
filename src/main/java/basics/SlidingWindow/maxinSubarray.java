package basics.SlidingWindow;

import java.util.Collections;
import java.util.List;

public class maxinSubarray {
	
	
	public static void maxmin(int[] arr , int k) {
		int i =0 , j=0 , sum= 0;
		 int max = Integer.MIN_VALUE;
		 int min = Integer.MAX_VALUE;
		
		while(j<arr.length)
		{
			sum += arr[j];
			System.out.println(sum);
			
			  if(j-i+1 <k)
	            {
	                
	                j++;
	                
	            }
	            else if(j-i+1 ==k)
	            {
	            	max= Math.max(max, sum);
	            	min = Math.min(min, sum);
	            	
	                i++;
	                j++;
	                sum=  sum-arr[i-1];
	                
	            }
			  
			  
			// System.out.println("-->"+max);
			
			
		}
		 
		
		System.out.println(min+" "+max);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		//int[] arr= {1,3,5,7,9};
		int[] arr = {7, 69, 2, 221, 8974};
		maxmin(arr,4);
		List<Integer> arr1 = List.of(7, 69, 2, 221, 8974);
		//maxminsort(arr1,4);
	}

}
