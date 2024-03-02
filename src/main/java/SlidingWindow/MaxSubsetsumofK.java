package SlidingWindow;

public class MaxSubsetsumofK {

	public static int maxSum(int[] arr, int k) {

		int i = 0, j = 0, ans = 0, res = 0;

		while (j < arr.length) {
			res += arr[j];

			if (j - i + 1 < k) {
				j++;

			} else if (j - i + 1 == k) {
				ans = Math.max(ans, res);

				res -= arr[i];

				i++;
				j++;
			}

		}

		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 8, 2, 9, 1 };
		int k = 3;
		System.out.println(maxSum(arr, k));

	}

}
