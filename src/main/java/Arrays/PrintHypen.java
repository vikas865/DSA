package Arrays;

public class PrintHypen {

	public static void main(String[] args) {
		int[][] a = new int[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				// Print each element of the array, ensuring a minimum width of 2 characters.
				System.out.print('-'+" ");
			}
			System.out.println();
		}
	}

}
