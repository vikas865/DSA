package basics.Pattern;

public class InvertedrightTriangle {
/*
 * * * * * 
  * * * * 
    * * * 
      * * 
        * 	
 */
	
	
	public static void print(int n)
	{
		
		int sp=0;
		int str=n;
		for(int i = 1; i <= n; i++)
		{
			for(int k = 1; k <=sp; k++)
			{
				System.out.print("  ");
			}
			
			for(int j = 1; j <=str; j++)
			{
				System.out.print("* ");
			}
			
		
			
			
			sp++;
			str--;
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		print(5);
		
	}

}
