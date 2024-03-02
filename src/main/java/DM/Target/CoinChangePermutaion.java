package DM.Target;

import java.util.Arrays;

public class CoinChangePermutaion {

	public static void changePermutation(int[] arr, int target) {
		int[] dp = new int[target + 1];

		dp[0] = 1;

		for (int i = 1; i < dp.length; i++)

		{
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] <= i) {
//
//					if (j - arr[j] < 0) {
//						dp[i] = 0;
//					} else {
						dp[i] += dp[i - arr[j]];
					//}
				 }
			}

		}

		System.out.println(Arrays.toString(dp));
		System.out.println(dp[target]);
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 6 };
		changePermutation(arr, 10);
	}

}
