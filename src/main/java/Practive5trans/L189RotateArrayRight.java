package Practive5trans;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class L189RotateArrayRight {
	
	
	
	   public static void rotate(int[] nums, int k) {
		   //{1,2,3,4,5,6,7}
		   //5,6,7,1,2,3,4
	
	
			int n=nums.length;
			
			reverse(nums,0,n-1);
			reverse(nums,0,k-1);
			reverse(nums,k,n-1);
			   
	        
	    }
	   
	   
	   public static void reverse(int[] nums,int i, int j) {
		   
		   int lo=i;
		   int hi=j;
		   while(lo<=hi) {
			   int temp=nums[lo];
			   nums[lo]=nums[hi];
			   nums[hi]=temp;
			   lo++;
			   hi--;
			   
		   }
		   
	   }
	   
	   public static void main(String[] args) {
		int [] nums= {1,2,3,4,5,6,7};
		  // int [] nums= {-1,-100,3,99};
		rotate(nums,3);
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+" ");
	}

}
