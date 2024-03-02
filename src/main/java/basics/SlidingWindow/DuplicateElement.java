package basics.SlidingWindow;

import java.util.HashSet;

public class DuplicateElement {
	
	public static boolean duplicateInarray(int[] arr , int k) {
		HashSet<Integer> has = new HashSet<Integer>();
		int newk= k+1;
		for(int i = 0; i < newk; i++)
		{
			has.add(arr[i]);
		}
		
		if(has.size()<newk)
		{
			return true;
		}
		
		int j=0;
		
		for(int i=newk ; i<arr.length; i++)
		{
			if(!has.isEmpty() && has.contains(arr[j]))
			{
				has.remove(arr[j]);
			}
			j++;
			
			has.add(arr[i]);
			
			if(has.size()<newk)
			{
				return true;
			}
		}
		
		
		
		
		return false;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,1}; //k=3
		int[] arr1 = {1,0,1,1};  //k=1
		
		System.out.println(duplicateInarray(arr1,1));
	}

}
