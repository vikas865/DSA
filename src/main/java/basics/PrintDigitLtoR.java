package basics;

public class PrintDigitLtoR {

	public static void printLtoR(int n) {

		int count = CountdigitInNumber.count(n);

		int div = powercalc(count);

		while (n != 0) {

			int ans = n / div;

			n = n % div;
			div /= 10;
			System.out.println(ans + " ->" + n);
		}

	}

	static int powercalc(int n) {
		int res = 1;
		for (int i = 1; i < n; i++) {
			res *= 10;
		}

		return res;
	}

	public static void main(String[] args) {
		printLtoR(123456);

	}

}
