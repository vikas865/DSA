package basics.Pattern;

public class LeftTriangle {
	
//*
//* *
//* * *
//* * * *	
	
	public static void print(int k)
	{
		
		for(int i = 1; i <= k  ; i++ )
		{
			for(int j = 1 ; j <= i; j++)
			{ 
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		print(15);
		
	}
	

}
