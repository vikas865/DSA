package basics.arrays;

public class BarCHart {
	
	public static void barChart(int[] arr, int n) {
		int max =arr[0];
		
		for(int i=1 ; i<n ;i++)
		{
			max= Math.max(max, arr[i]);
		}
		
		
		for(int i=max; i>0; i--)
		{
			
			for(int j=0 ; j<n ;j++)
			{
				if(arr[j]==i)
				{
					System.out.print("*\t");
					arr[j]--;
				}
				else
				{
					System.out.print("\t");
				}
				
				
			}
			System.out.println();
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {3,1,0,7,5};
		int n=5;
		
		barChart(arr,n);
		
	}

}
