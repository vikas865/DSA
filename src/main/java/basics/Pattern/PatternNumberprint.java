package basics.Pattern;

public class PatternNumberprint {
	
	// i C j+1 = i C j * (i-j)  / (j+1)
	
	public static void print(int n)
	{
		
		for(int i=0; i<n; i++)
		{
			int icj=1;
			for(int j=0 ;j<=i ; j++)
			{
				
				System.out.print(icj+"\t");
			   int 	icjp1= icj *(i-j) / (j+1);
			   icj = icjp1;
			}
			
			System.out.println();
			
		}
		
	}
	
	public static void main(String[] args) {
		print(5);
	}

}
