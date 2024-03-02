package basics.Pattern;

public class HalfLeftHalfRight {
/*
  
*  *	*	*		*	*	*	
*	*					*	*	
*							*	
*	*					*	*	
*	*	*			*	*	*
  	
 */
	
	
	public static void print(int n)
	{
		
		int lstar=n/2+1;int rstar=n/2;
		int spc=1;
		
		
		for(int i = 1; i <= n; i++)
		{
			
			for(int j = 1; j <= lstar; j++)
			{
				System.out.print("*\t");
			}
			
			for(int j = 1; j <= spc; j++)
			{
				System.out.print("\t");
			}
			
			for(int j = 1; j <= lstar; j++)
			{
				System.out.print("*\t");
			}
				
			System.out.println();
			
			if(i<=n/2)
			{
			spc = spc +  2;
			lstar= lstar-1;
			}else {
				spc = spc -  2;
				lstar= lstar+1;
			}
			
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		print(5);
	}

}
