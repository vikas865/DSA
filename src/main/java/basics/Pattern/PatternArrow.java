package basics.Pattern;

public class PatternArrow {

	public static void print(int n)
	{ 
		int Lspace=n/2;
		int Rspace=n/2;
		int star=1;
		
		for(int i= 1; i<=n; i++)
		{
			
			
			for(int j=1; j<=Lspace; j++)
			{
				if(i== n/2 +1)
					System.out.print("*\t");
				else
					System.out.print("\t");
			}
			
			int val=1;
			
			for(int j=1; j<=star; j++)
			{
				System.out.print("*\t");
			}
			
			System.out.println();
			
			if(i<=n/2)
			{
				star++;
			}
			else
			{
				star--;
			}
			
			
			
		}
		
	}
	
	public static void main(String[] args) {
		print(5);
	}
}
