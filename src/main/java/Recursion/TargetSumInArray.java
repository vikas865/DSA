package Recursion;

public class TargetSumInArray {
	
	public static void getTargetSum(int[] arr,String res, int num, int target,int index) {
		
		if(arr.length==index)
		{
			
			return;
		}
		
		
		if(num==target)
		{
			
			System.out.println(res);
			return ;
			
		}
		
		getTargetSum(arr,res+arr[index]+',',num+arr[index],target,index+1);
		getTargetSum(arr,res,num,target,index+1);
	}
	
	
	
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		
		getTargetSum(arr,"",0,60,0);
		
		
	}

}
