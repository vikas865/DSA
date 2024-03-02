package DM;

public class CLimbStairs {

	// only 1 or 2 jumps

	public static int getPossibleWays(int n) {
		if (n == 1)
			return 1;

		int[] num = new int[n + 1];
		num[1] = 1;
		num[2] = 2;

		for (int i = 3; i <= n; i++) {
			num[i] = num[i - 1] + num[i - 2];
		}

		return num[n];
	}

	public static void main(String[] args) {
		// find total count of ways to jump stairs
		System.out.println(getPossibleWays(8));
	}

}
