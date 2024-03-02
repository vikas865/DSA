package basics.Pattern;

public class RightTriangle {
	/*    *
	 	 **
	 	***
	   ****
      *****
      */
	public static void print(int n)
	{
		
		int spc=n-1;
		int str=1;
		
	for(int i=n; i>=1;i--)
	{
		for(int j=1; j<=spc; j++)
		{
			System.out.print(" ");
			
		}
		for(int k=1;k<=str; k++)
		{
			System.out.print("*");
		}
		spc--;
		str++;
		
		System.out.println();
		
	}
	}
	
	
	
	
	public static void main(String[] args) {
		
		print(5);
	}

}
