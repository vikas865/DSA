package basics.Pattern;

public class PrintSwastik {
/*
 * 
*	*	*		*	
		*		*	
*	*	*	*	*	
*		*			
*		*	*	*
 * 
 */
	
	public static void print(int n)
	{
	 int star=n;
	 int space=0;
	 
	 
	 for(int i = 1; i <=n ; i++ )
	 {
	
		 
		 
		 for(int j = 1; j<=n; j++)
		 {
			 if(i==1)
			 {
				 if(j> n/2+1 && j<n)
					{
						 System.out.print("\t");
					}	 
					else
					{
						System.out.print("*\t");
					} 
			 } 
			 else if(i<=n/2)
			 {
				 if(j != n/2+1 && j !=n)
					{
						 System.out.print("\t");
					}	 
					else
					{
						System.out.print("*\t");
					} 
				 
			 }else if( i== n/2+1)
			 {
				 System.out.print("*\t"); 
			 }
			 else if( i<n)
			 {
				 if(j > n/2+1 || (j>1 && j < n/2+1))
					{
						 System.out.print("\t");
					}	 
					else
					{
						System.out.print("*\t");
					}  
			 }
			 else
			 {
				 if(j < n/2+1 && j>1)
					{
						 System.out.print("\t");
					}	 
					else
					{
						System.out.print("*\t");
					} 
				 
			 }
			
		 }
		 
		 System.out.println();

	 }
	 

		
	}
	
	public static void main(String[] args) {
		print(5);
	}

}
