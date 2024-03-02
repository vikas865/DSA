package basics.Pattern;

public class PrintW {

	public static void print(int n) {
//diagonal property i==j or i+j=n+1
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (i <= n / 2) {
					if (j == 1 || j == n) {

						System.out.print("*\t");

					} else {
						System.out.print("\t");
					}
				} else if (i == n / 2 + 1) {
					if (j == 1 || j == n || j == n / 2 + 1) {

						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				} else if (i < n) {
					if (j==1 || j==n || i+j==n+1|| i==j) {

						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				}else
				{
					if (j==1 || j==n) {

						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				}
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		print(7);
	}

}
