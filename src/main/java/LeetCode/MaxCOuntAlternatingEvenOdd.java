package LeetCode;

public class MaxCOuntAlternatingEvenOdd {

	public static int getcount(int[] arr) {

		int count = 1;
		int maxcount = 0;

		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] % 2 != arr[j - 1] % 2) {
					count += 1;
				}
				else {
					break;
				}
			}

			maxcount = Math.max(maxcount, count);
		}

		return maxcount;
	}

	
	public static int getcountOptimized(int[] arr) {
		
		int count=1;
		int maxcount=1;
		
		int i=1;
		
		while(i<arr.length)
		{
			if(arr[i]%2 != arr[i-1]%2)
			{
				count++;
			}
			else {
				count=1;
			}
			
			maxcount= Math.max(maxcount, count);
			i++;
		}
		
		
		return maxcount;
	}
	
	public static void main(String[] args) {
		int[] arr = { 8, 10, 13, 14 };

		System.out.println(getcount(arr));
		
		System.out.println(getcountOptimized(arr));

	}

}
