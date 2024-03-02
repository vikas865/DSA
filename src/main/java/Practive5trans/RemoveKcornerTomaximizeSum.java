package Practive5trans;

public class RemoveKcornerTomaximizeSum {
	
	public static int getSum(int [] arr ,int k)
	{
		
		int i = 0, j = 0 , ans = 0, n=arr.length;
		int windowsize=k+1;
		int currentmax=0;
		
		
		while(j<n) {
			
			if(j-i+1==windowsize)
			{
				int l=k-k/2;
				int r=k-l;
					currentmax +=arr[j-r];
				i++;
			}
			
			
			
			
			j++;
		}
			
		
		
		return currentmax;
	}
	
	
	public static void main(String[] args) {
//		int [] arr = {11, 49, 100, 20, 86, 29, 72};
//		int k = 4;
		
		int [] arr = {1, 2, 3, 4, 5, 6, 1};
		int k = 3;
		
		System.out.println(getSum(arr,k));
		
		
	}

}
