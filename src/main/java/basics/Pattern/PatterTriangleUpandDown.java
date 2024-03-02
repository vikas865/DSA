package basics.Pattern;

public class PatterTriangleUpandDown {

	public static void print(int n) {
/*
 * 
*	*	*	*	*	*	*	
	*				*	
		*		*	
			*	
		*	*	*	
	*	*	*	*	*	
*	*	*	*	*	*	*
 */
		
		

		int space = 0;
		int star = n;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <=space; j++) {
				System.out.print("\t");

			}

			int val=star;
			for (int j = 1; j <= star; j++) {
				if(i> 1 && i<=n/2)
				{			
					if(j>1 && j<star)
					System.out.print("\t");
					else
						System.out.print("*\t");
				
				}
				else {
					System.out.print("*\t");
					
				}

			}

			System.out.println();

			if(i <= n/2)
			{
			star = star - 2;
			space++;
			}
			else
			{
				star = star + 2;
				space--;	
			}

		}

	}

	public static void main(String[] args) {
		print(7);
	}

}
