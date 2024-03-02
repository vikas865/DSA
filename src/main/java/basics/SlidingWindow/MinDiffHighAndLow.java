package basics.SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;

public class MinDiffHighAndLow {

	public static void minDiff(int[] arr, int k) {
		
		int min = Integer.MAX_VALUE;
		int max= Integer.MIN_VALUE;
		int diff = 0;
		
		Arrays.sort(arr);
		
	
		
		for(int i = 0; i< arr.length-k+1; i++ )
		{
			if(diff==0)
			{
				diff= arr[i+k-1]-arr[i];
			}
			else
			{
				diff= Math.min(diff,arr[i+k-1]-arr[i] );
			}
			
			
		}
		
		System.out.println( diff );
	}
	
	public static void main(String[] args) {
		int[] arr= {9,4,1,7};
		int k =2;
		minDiff(arr,k);
		
	}
}
