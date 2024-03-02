package DM;

import java.util.Arrays;

public class MinimumCostPath {

	public static int minCost(int row, int col, int[][] mat) {

		int[][] dp = new int[row][col];
		dp[row - 1][col - 1] = mat[row - 1][col - 1];

		for (int i = dp.length - 1; i >= 0; i--) {
			

			for (int j = dp[0].length-1; j >= 0; j--) {
				if (i == dp.length - 1 && j == dp[0].length-1) {

					//min = Math.min(min, dp[i][j + 1]);
					dp[i][j] =  mat[i][j];
				} else if (j == dp[0].length-1) {
					// min = Math.min(min, dp[i][j]);
					//min = Math.min(min, dp[i + 1][j]);
					dp[i][j] = dp[i + 1][j] + mat[i][j];

				} else if(i == dp.length - 1)
				{
					//min = Math.min(min, dp[i][j + 1]);
					dp[i][j] = dp[i][j + 1] + mat[i][j];
				}
				else
				{

					dp[i][j] = Math.min(dp[i][j + 1], dp[i + 1][j])+ mat[i][j];
					
					

				}

			}

		}

		System.out.println(Arrays.toString(dp[0]));

		return dp[0][0];
	}

	public static void main(String[] args) {

		int[][] mat = { { 2, 8, 4, 1, 6, 4, 2 }, { 6, 0, 9, 5, 3, 8, 5 }, { 1, 4, 3, 4, 0, 6, 5 },
				{ 6, 4, 7, 2, 4, 6, 1 }, { 1, 0, 3, 7, 1, 2, 7 }, { 1, 5, 3, 2, 3, 0, 9 }, { 2, 2, 5, 1, 9, 8, 0 } };

		System.out.println(minCost(7, 7, mat));

	}

}
