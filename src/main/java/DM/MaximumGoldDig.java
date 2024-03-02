package DM;

import java.util.Arrays;

public class MaximumGoldDig {
	public static int maxGold(int n, int m, int[][] arr) {
		int[][] dp = new int[n][m];

		for (int j = arr[0].length - 1; j >= 0; j--)

		{

			for (int i = arr[0].length - 1; i >= 0; i--) {

				if (j == arr.length - 1)  {
					dp[i][j] = arr[i][j];

				} else if (i == arr[0].length - 1) {
					
					dp[i][j] = Math.max(dp[i][j+1], dp[i-1][j+1])+arr[i][j];

				} else if (i == 0) {
					 dp[i][j] = Math.max(dp[i][j+1], dp[i+1][j+1]) + arr[i][j];
					
				} else {

					int max= Math.max(dp[i][j+1], dp[i+1][j+1]);
					max=Math.max(max,dp[i-1][j+1]);
					 dp[i][j] = max+ arr[i][j];
				}

			}

		}

		System.out.println(Arrays.toString(dp[5]));
		//max of column1
		 int max= dp[0][0];
		for(int i=1; i<dp.length ;i++)
		{
		   max=Math.max(max, dp[i][0]);	
		}
		

		return max;
	}

	public static void main(String[] args) {
		int[][] arr = { { 0, 1, 4, 2, 8, 2 }, { 4, 3, 6, 5, 0, 4 }, { 1, 2, 4, 1, 4, 6 }, { 2, 0, 7, 3, 2, 2 },
				{ 3, 1, 5, 9, 2, 4 }, { 2, 7, 0, 8, 5, 1 } };

		System.out.println(maxGold(6, 6, arr));
	}
}
