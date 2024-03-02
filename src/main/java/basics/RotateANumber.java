package basics;

public class RotateANumber {

	public static int rotate(int n, int k) {

		int num = n;

		int len = length(num);
		k = k % len;
		if (k < 0) {
			k = k + len;
		}
		int div = (int) Math.pow(10, k);
		
		int multiplier = (int) Math.pow(10, len-k);
		n = (n % div) * multiplier + (n / div);

		System.out.println(n);

		return n;
	}

	static int length(int n1) {

		int count = 0;

		while (n1 != 0) {
			n1 = n1 / 10;
			count++;
		}

		return count;
	}

	static int reverse(int n) {
		int temp = 0;
		while (n != 0) {
			temp = temp * 10 + n % 10;
			n = n / 10;
		}

		return temp;

	}

	public static void main(String[] args) {

		// System.out.println(rotateRight(23457, 3));
		System.out.println(rotate(23457, -2));

	}

}
