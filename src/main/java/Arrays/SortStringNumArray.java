package Arrays;

import java.util.Arrays;

public class SortStringNumArray {
	
	public static void sort(int[] nums, String[] strs)
	{
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=1;j<nums.length-i;j++)
			{
				if(nums[i]>nums[j])
				{
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]= temp;
				}
			}
		}
		
		for(int i=0;i<strs.length;i++)
		{
			for(int j=1;j<strs.length-i;j++)
			{
				if(strs[i].compareTo(strs[j])>0)
				{
					String temp=strs[i];
					strs[i]=strs[j];
					strs[j]= temp;
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		 int[] my_array1 = {
		            1789, 2035, 1899, 1456, 2013, 
		            1458, 2458, 1254, 1472, 2365, 
		            1456, 2165, 1457, 2456
		        };
		        
		        // Declare and initialize a string array.
		        String[] my_array2 = {
		            "Java",
		            "Python",
		            "PHP",
		            "C#",
		            "C Programming",
		            "C++"
		        };    
		        
		        sort(my_array1,my_array2);
		        
		        System.out.println(Arrays.toString(my_array1));
		        System.out.println(Arrays.toString(my_array2));
		        
	}

}
