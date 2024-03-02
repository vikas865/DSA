package LeetCode;

public class L1752rotatedarraySorted {

	public static boolean isSorted(int[] arr) {
		
		boolean flag=true;
		int i;
		for(i=1;i<arr.length; i++)
		{
			
			if(arr[i-1]>arr[i])
			{
				flag=false;
				break;
			}
			
			
		}
		
		
		if(flag)
		{
			return true;
		}
		
		
	int pivot=arr.length-i ;
	
	int[] rotatedArray= new int[arr.length];
	for(int j=0;j<arr.length;j++)
		
	{
		rotatedArray[(j+pivot)% (arr.length)]=arr[j];
		
	}
			
		
	for(int s : rotatedArray )
	{
		System.out.println(s);
	}
		
		//System.out.println(arr.length +" "+flag);
		
		return flag;
	}
	
	
	public static void main(String[] args) {
		 int arr[]= {3,4,5,1,2};
		//int [] arr= {2,1,3,4};
		isSorted(arr);
	}
}
