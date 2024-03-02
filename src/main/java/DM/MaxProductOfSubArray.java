package DM;

public class MaxProductOfSubArray {

	public static void getMaxProd(int[] arr) {

		int i = 0;
		int j = arr.length - 1;
		int leftproduct=1;
		int rightproduct=1;
		int maxproduct=Integer.MIN_VALUE;
		int temp;

		while (j!= 0) {
			
		
			
			//multiply from left
			 leftproduct=leftproduct*arr[i];
			 if(leftproduct==0)
				 leftproduct=1;
			 maxproduct=Math.max(maxproduct,leftproduct);
			 System.out.println(maxproduct);
			//multiply from right
			 
			 rightproduct=rightproduct*arr[j];
			 if(rightproduct==0)
				 rightproduct=1;
			 maxproduct=Math.max(maxproduct,rightproduct);
			 System.out.println(maxproduct);
			 
			

			j--;
			i++;
			
			

		}

			System.out.println(maxproduct);
	}

	public static void main(String[] args) {

		//int[] arr = { -2, 0, 1 };
		// int[] arr = { 2,3, 2,0, 16 };

		int[] arr = { 2, 3, -2, -5, 6, -1, 4 };
		getMaxProd(arr);

	}
}
