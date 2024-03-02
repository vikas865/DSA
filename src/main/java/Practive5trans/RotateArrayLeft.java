package Practive5trans;

public class RotateArrayLeft {
	
	
	 public static void rotateLeft(int[] arr, int k) {
		//7654321
		 
		 int n= arr.length-1;
		 reverse(arr,0,n);
		 reverse(arr,n-k+1,n);
		 reverse(arr,0,n-k);
		 
		 
	 }
	 
	 public static void reverse(int[] arr, int start, int end)
	 {
		 while(start<end)
		 {
			 int temp=arr[start];
			 arr[start]= arr[end];
			 arr[end] =temp;
			 start++;
			 end--;
			 
		 }
	 }
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		//3,4,5,6,7,1,2
		
		rotateLeft( arr,  2);
		
		for( int i=0;i<arr.length; i++)
		{
			System.out.print(arr[i]+",");
		}
	}

}
