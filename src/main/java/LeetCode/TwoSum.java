package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	
	
	
	public static void main(String[] args) {
		
		//int [] arr = {3,3};
		int [] arr = {3,2,4};
		
		int target=6;
		
		int[] res = new int[2];
		
		Map<Integer,Integer> numset= new HashMap<Integer,Integer>();
		
		
		for(int i=0; i<arr.length;i++)
		{
			
				
		
			
			if(numset.containsKey(target-arr[i])) {
				
				//System.out.println(arr[i] +" ->"+numset.get(target-arr[i])+" "+i );
				res[0]= numset.get(target-arr[i]);
				res[1]=i;
				
			}
			
			numset.put(arr[i],i);
			
			
		}
		
		System.out.println(res[0] +" "+res[1]);
		
		
		
		
		
	}

}
