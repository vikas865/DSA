package basics;

public class AllPrimeFactors {
	
	public static void printBruteForce(int n)
	{
		//time complexity is O(n) ex for prime numbers 13....
		
		
		int i=2;
		while(n!=1)
		{
			System.out.println("Iteration -------"+ i);
			while(n%i==0)
			{
				System.out.println(i);
				n=n/i;
				
			}
			
			i++;
		}
		
		
	}
	
	
	
	public static void printOptimized(int n)
	{
		//time complexity is O(root(n)) ex for prime numbers 13 and composite number
		
		
		int i=2;
		while( i * i <=n )
		{
			System.out.println("Iteration -------"+ i);
			while(n%i==0)
			{
				System.out.println(i);
				n=n/i;
				
			}
			
			i++;
		}
		
		if(n!=1)
		{
			System.out.println(n );
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		//printBruteForce(13);
		printOptimized(90);
		
	}

}
