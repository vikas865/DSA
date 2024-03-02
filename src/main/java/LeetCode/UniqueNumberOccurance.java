package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class UniqueNumberOccurance {

	/*
	 * Given an array of integers arr, return true if the number of occurrences of
	 * each value in the array is unique or false otherwise.
	 */
	
	
    public static boolean uniqueOccurrences(int[] arr) {
    	
		Map<Integer, Integer> countmap = new TreeMap<Integer, Integer>();

		Set<Integer> numSet = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {

			countmap.put(arr[i],countmap.getOrDefault(arr[i], 0) + 1);

		}
		
		
		for(Map.Entry<Integer, Integer> s:countmap.entrySet()) {
			
			if(numSet.add(s.getValue())==false) {
				//return false;
				System.out.println(s.getValue());
				
			}
            else
            {
                numSet.add(s.getValue());
            }
			
		}
		System.out.println(numSet);
        return true;
    }

    
    
    
 public static boolean optimized(int[] arr) {
    	
		Map<Integer, Integer> countmap = new TreeMap<Integer, Integer>();

		

		for (int i = 0; i < arr.length; i++) {

			countmap.put(arr[i],countmap.getOrDefault(arr[i], 0) + 1);

		}
		
		Set<Integer> numSet = new HashSet<Integer>(countmap.values());
	
        return numSet.size()==countmap.size();
    }
	public static void main(String[] args) {

		 int[] arr = {1,2,2,1,1,3};

		//int[] arr = { 3, 5, -2, -3, -6, -6 };
		
		//int[] arr = { 1,2};

		System.out.println(uniqueOccurrences(arr));
		
		
		

		
	}

}
