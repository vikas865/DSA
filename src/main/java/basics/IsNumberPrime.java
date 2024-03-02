package basics;

public class IsNumberPrime {
	
	public static boolean isPrime(int n)
	{
		
		//Time complexity O(root(n)) 
		if(n<2)
		{
			return false;
		}
		
		if(n==2 || n==3)
		{
			return true;
		}
		
	
		
		for(int i=2; i*i<=n ;i++)
		{
			if(n%i==0 || n%(i+2)==0)
			{
				return false;
			}
			
		}
		
		
		return true;
	}
	
	public static boolean isPrimeMoreEfficient(int n)
	{
		//More efficient Time complexity O(root(n)) 
		//As jump is happening i+6
		
		if(n<2)
		{
			return false;
		}
		
		if(n==2 || n==3)
		{
			return true;
		}
		
		if(n%2==0 || n%3==0)
		{
			return false;
		}
		
		for(int i=5; i*i<=n ;i=i+6)
		{
			if(n%i==0 || n%(i+2)==0)
			{
				return false;
			}
			
		}
		
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(isPrime(49));
		
	}

}
