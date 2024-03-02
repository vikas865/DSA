package basics.Pattern;

public class NumberPatternfibionaci {

	public static void print(int n)
	{
		
		int a=0 , b=1;
		
		for(int i=1; i <=n; i++)
		{
			
			for(int j = 1; j <= i; j++)
			{
				
				System.out.print(a+"\t");
				int c= a + b;
				a=b;
				b=c;
			}
			System.out.println();
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		print(5);
	}
}
