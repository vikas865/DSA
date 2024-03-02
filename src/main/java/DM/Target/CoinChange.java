package DM.Target;

import java.util.Arrays;

public class CoinChange {
	public static void change(int[] arr, int target) {
		int[] dp = new int[target + 1];
		dp[0] = 1;
		for (int i = 0; i < arr.length; i++) {

			for (int j = arr[i]; j < dp.length; j++) {

				int val = arr[i];
				dp[j] += dp[j-val];

			}

		}

		System.out.println(Arrays.toString(dp));
		System.out.println(dp[target]);

	}

	

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5 };
		change(arr, 7);
	}

}
