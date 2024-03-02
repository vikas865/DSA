package basics.Pattern;

public class ReverseDiagonal {
	
/*
 				*	
			*		
		*			
	*				
*					
 
  
  	
 */
	
	public static void print(int n)
	{
		
		for(int i = 1; i <= n; i++)
		{
			
			for(int j =1; j <= n; j++)
			{
				
				if(i+j == n+1)
				{
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
				
				
			}
			
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		print(5);
	}

}
