package basics.Pattern;

public class NumberPatternDIgShape {

	/*
1						1	
1	2				2	1	
1	2	3		3	2	1	
1	2	3	4	3	2	1	
	 * 
	 */
	public static void print(int n) {
		// column = 2n-1
		// space= 2n-3

		int space = (2 * n) - 3;
		int lefto = 1;
		for (int i = 1; i <= n; i++) {

			int val=1;
			for (int j = 1; j <= i; j++) {
				System.out.print(val + "\t");
				val++;
			}

			for (int j = 1; j <= space; j++) {
				System.out.print("\t");
			}

			if (i == n) {
				lefto--;
				val--;
			}

			
			for (int j = 1; j <= lefto; j++) {

				val--;
				System.out.print(val + "\t");
				
			}

			System.out.println();
			space -= 2;

			lefto++;

		}

	}

	public static void main(String[] args) {
		print(4);
	}

}
