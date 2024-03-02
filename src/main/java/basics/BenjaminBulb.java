package basics;

public class BenjaminBulb {

///toggle bulb  perfect sauare has n+1 factors
	//ex 1,4, 9 ,16 so these numbers will left on

	public static void bBulb1(int n) {

		boolean[] bulb = new boolean[n + 1];


		
		
		   for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n; j++) {
	                if (j % i == 0) {
	                    bulb[j] = !bulb[j ]; // Toggle the bulb
	                }
	            }
	        }

		for (int i = 1; i <= n; i++) {
			System.out.println(i + "->" + bulb[i]);
		}

	}

	public static void main(String[] args) {

		bBulb1(20);
	}

}
