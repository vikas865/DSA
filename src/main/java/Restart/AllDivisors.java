package Restart;

public class AllDivisors {

	public static void main(String[] args) {
		int n = 25;
		int i = 1;
		for (i = 1; i * i <= n; i++) {
			//System.out.println("Iteration" + i + "->");

			if (n % i == 0)
			{
				System.out.println(i);
			}
			
				

			//System.out.println();

		}

		for (; i > 0; i--) {
		//	System.out.println("Iteration**" + i + "->");
			if (n % i == 0 && i!=n/i)
			{
				 System.out.println(n / i);
			}
		}
	}

}
