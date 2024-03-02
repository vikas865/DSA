package basics.Pattern;

public class SquareRotated {

	/*

		*	
	*		*	
*				*	
	*		*	
		*	

	 
	 */
	public static void print(int n) {
		int ospace = n / 2;
		int innerspace = -1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= ospace; j++) {

				System.out.print("\t");

			}

			System.out.print("*\t");

			for (int k = 1; k <= innerspace; k++) {

				System.out.print("\t");
			}
			
			if(i>1 && i<n)
			{
				System.out.print("*\t");
			}
			
			System.out.println();

			if (i <= n / 2) {
				ospace--;
				innerspace += 2;
			} else {
				ospace++;
				innerspace -= 2;

			}

		}

	}

	public static void main(String[] args) {
		print(5);
	}
}
