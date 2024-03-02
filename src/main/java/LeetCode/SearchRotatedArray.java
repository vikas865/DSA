package LeetCode;

public class SearchRotatedArray {
	
	public static int search(int[] arr, int target) {
		//{4,5,6,7,8,1,2}
		int l=0;
		int h=arr.length-1;
		int mid=0;
		
		while(h>=l) {
			mid=(h+l)/2;
			if(arr[mid]==target) {
				
				return mid;
				
			}
			else if(arr[l]<arr[mid]) {
				
				if(target<arr[mid] && target>arr[l]) {
					h=mid-1;
				}
				else {
					l=mid+1;
				}
				
				
			}
			else
			{
				if(target>arr[mid] && target<arr[h])
				{
					l=mid+1;
					
				}
				else
				{
					h=mid-1;
				}
				
			}
			
			
			
			
		}
		
		
		
		return mid;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr= {4,5,6,7,8,1,2};
		System.out.println(search(arr,6));
		
	}

}
