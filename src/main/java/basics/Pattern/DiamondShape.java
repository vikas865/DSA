package basics.Pattern;

public class DiamondShape {
	
/* 
 		*
	*	*	*
*	*	*	*	*
	*	*	*	
		*

 * */	
	
	
	public static void print(int n)
	{
		int spc=n/2;
		int str=1;
		
		System.out.println(spc );
		for(int i = 1; i <= n; i++ )
		{			
			for(int j = 1; j<=spc; j++)
			{
				
				System.out.print("\t");
			}
			
			
			for(int k = 1; k<=str; k++)
			{
				
				System.out.print("*\t");
			}
			
			
			System.out.println();
			
			if(i<=n/2)
			{
			str=str+2;
			spc=spc-1;
			}
			else
			{
				
				str=str-2;
				spc=spc+1;
			}
		
		}
		
		
		
	
	}
	
	
	public static void main(String[] args) {
		print(7);
	}

}
