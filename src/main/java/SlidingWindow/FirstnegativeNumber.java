package SlidingWindow;

public class FirstnegativeNumber {
	
	public static void getNegative(int[] arr, int k)
	{
		int i=0, j=0;
		
		while(j<arr.length)
		{
			
			if(j-i+1<k)
			{
				j++;
			}else if(j-i+1==k)
			{
				System.out.println(firstneg(arr, i,j));
				i++;
				j++;
			}
			
			
		}
		
		
		
	}
	
	
	public static int firstneg(int[] arr, int i, int j)
	{
		int val=0;
		while(i<=j)
		{
			if(arr[i]<0)
			{
				val=arr[i];
				return val;
			}
			i++;
		}
		
		return val;
		
	}
	
	public static void main(String[] args) {
		
		int [] arr= {12,-1,-7,8,-15,30,13,28};
		int k=3;
		getNegative(arr,k);
	}

}
