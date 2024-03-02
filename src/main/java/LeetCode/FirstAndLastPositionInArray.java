package LeetCode;

public class FirstAndLastPositionInArray {
	
	
	public static int[] getPosition(int[] arr, int val) {
		//{5,7,7,8,8,10}
		
		int l=0;
		int h=arr.length-1;
		int mid=0;
		int[] res= {-1,-1};
		
		while(h>=l) {
			mid=(h+l)/2;
		//	System.out.println("mid"+ mid);
			if(arr[mid]==val) {
				res[0]=mid;
				h=mid-1;
				
				
			
				//System.out.println(mid);
				// break;
			}else if(val<arr[mid])
			{
				h=mid-1;
			}
			else
			{
				l=mid+1;
			}
			
			
		}
		
		 l=0;
		 h=arr.length-1;
		 mid=0;
		
		while(h>=l) {
			mid=(h+l)/2;
		//	System.out.println("mid"+ mid);
			if(arr[mid]==val) {
				res[1]=mid;
				l=mid+1;
				
				
			
				//System.out.println(mid);
				// break;
			}else if(val<arr[mid])
			{
				h=mid-1;
			}
			else
			{
				l=mid+1;
			}
			
			
		}
		
		
		
		return res;
	}
	
	
	public static void main(String[] args) {
		
		int arr[]= {5,7,7,8,8,10};
		int val=6;
		 int[] res=getPosition(arr,val);
		 for(int i:res) {
			 System.out.println(i);
		 }
		
	}

}
