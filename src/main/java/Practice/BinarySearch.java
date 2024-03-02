package Practice;

public class BinarySearch {
	
	public static int findElement(int[] arr, int val) {
		
		int low =0;
		int high= arr.length-1;
		int mid=0;
		
		while(high>=low) {
			mid=(low+high)/2;
			
			System.out.println("mid"+mid);
			if(arr[mid]==val) {
				
				return mid;
			}
			else if(arr[mid]>val)
			{
				high=mid-1;
				System.out.println("high"+ high);
				low=low;
			}
			else
			{
				low=mid+1;
				System.out.println("low"+low);
				high=high;
			}
			
			
		}
		
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		 int[] arr= {3,5,6,8,12,13,19,21};
		 
		 System.out.println(findElement(arr,13));
		
	}

}
