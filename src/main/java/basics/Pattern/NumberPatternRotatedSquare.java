package basics.Pattern;

public class NumberPatternRotatedSquare {
	
	public static void print(int n)
	{
		int space=2;
		int star=1;
		
		int val=1;
		for(int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= space; j++)
			{
				System.out.print("\t");
				
			}
			
			int cval=val;
			
			for (int j = 1; j <= star; j++)
			{
			

					System.out.print(cval+"\t");
					if(j<=star/2)
						cval++;
					else
						cval--;
					
					
				
			}
			
			
			
			System.out.println();
			
			if(i<=n/2)
			{
			space--;
			star +=2;
			val=val+1;
			}
			else {
				space++;
				star -=2;
				val=val-1;
			}
			
			
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		print(5);
	}

}
