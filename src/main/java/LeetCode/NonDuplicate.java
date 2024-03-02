package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class NonDuplicate {
	
	public static int removeDupliacte( int[] nums ) {
		
		int curr=0;
		int next=1;
		int cnt=0;
		int[] res=new int[nums.length-1];
	 
	
	while(next<nums.length)
		{
			if(nums[next]==nums[curr])
			{
				
			
				
				next++;
				
				
			}else {
				res[cnt]=nums[curr];
				cnt++;
				curr=next;
				next++;
				
				
			}
			
		}
	
	System.out.println("count"+cnt+"next="+next);
	
	if(res[cnt]!=nums[next-1])
	{
		res[cnt++]=nums[next-1];
	}	
		
	        
	
	
		for(int j=0; j<res.length;j++)
		{
			
			System.out.print(res[j]);
		}
			
		nums=res;
		
		System.out.println();
		
		for(int j=0; j<res.length;j++)
		{
			
			System.out.print(nums[j]);
		}
		
		
		
		
		return cnt;
	}
	
	
	 public static int removeDuplicates1(int[] nums) {
         int i=0;
      for(int j=1;j<nums.length;j++){
          if(nums[i]!=nums[j]){
              i++;
              nums[i]=nums[j];
          }
      }
  	for(int j=0; j<nums.length;j++)
	{
		
		System.out.print(nums[j]);
	}
         return i+1;
          }
	
	
	public static void main(String[] args) {
		
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		//int[] arr = {1,1,2};
		
		System.out.println(removeDuplicates1(arr));
		
	}

}
