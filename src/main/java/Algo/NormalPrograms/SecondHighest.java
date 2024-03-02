package Algo.NormalPrograms;

public class SecondHighest {
	
	
	public static void getSceonHighest(int[] arr) {
		
		int max1=0;
		int max2=0;
		
		if(arr[0]>arr[1]) {
			max1=arr[0];
			max2=arr[1];
			
		}
		else if(arr[1]>arr[0]) {
			max1=arr[1];
			max2=arr[2];
		}
		
		for(int i=2;i<arr.length;i++)
		{
			
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
				
			}else if(arr[i]>max2 && arr[i]!=max1) {
				max2=arr[i];
				
			}
			
		}
		
		System.out.println(max2);
		
	}
	
	
	public static void main(String[] args) {
		
		
		int[] arr= {33,20,4,34,5,8,29,34,};
		
		getSceonHighest(arr);
		
		
	}

}
