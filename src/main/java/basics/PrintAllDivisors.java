package basics;

public class PrintAllDivisors {
	
	public static void print(int n)
	{
		
		int i=1;
		for( i=1; i*i<=n; i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
//				if(i!=n/i)
//				System.out.println(n/i);
			}
			
			
		}
		
		
		for(; i>0; i--)
		{
			if(n%i==0 && i != n/i)
			{
				System.out.println(n/i);
			}
			
			
		}
		
	}
	
	public static void main(String[] args) {
		print(25);
		
	}

}
