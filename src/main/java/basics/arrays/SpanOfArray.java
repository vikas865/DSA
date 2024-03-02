package basics.arrays;

public class SpanOfArray {
	
	public static int  span(int arr[], int n) {
	
		
		int min=arr[0];
		int max=arr[0];
		for(int i =1 ; i<n ;i++)
		{
			min= Math.min(min,arr[i]);
			max= Math.max(max, arr[i]);
			
		}
		
		return max-min;
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {15,30,40,4, 11,9};
		int n=6;
		System.out.println(span(arr,n));
		
	}

}
