package DM;

public class CoinChange {

	public static int getminCoin(int[] arr, int target) {

		int[] mincoins = new int[target + 1];

		for (int i = 1; i < mincoins.length; i++) {

			mincoins[i] = Integer.MAX_VALUE;

			for (int c : arr) {

				if (c <= i && mincoins[i - c] != Integer.MAX_VALUE) {
					mincoins[i]= Math.min(mincoins[i], 1+mincoins[i-c]);
				}
			}

		}
		
		for (int a : mincoins) {
			System.out.print(a+"->");
		}
		
		

		return 0;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 5};
		
		getminCoin(arr,11);

	}

}
