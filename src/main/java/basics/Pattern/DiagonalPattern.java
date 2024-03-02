package basics.Pattern;

public class DiagonalPattern {
/*
 *					
	*				
		*			
			*		
				* 
 	
 */
	public static void print(int n) {
		
		for( int i = 1; i <= n ; i++)
		{
			
			for ( int j=1; j<= n; j++)
			{
				if(i==j)
					System.out.print("*\t");
				else
					System.out.print("\t");
					
			}
			//System.out.print("*");
			
			System.out.println();
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		print(5);
	}
	

}
