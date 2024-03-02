package basics;

public class FindAllprimeNumbers {

	public static void allPrime(int n) {
		// All prime Brute force
		// time complexity will ne n*n or n*root(n) if isprime is called

		if(n>3)
		{
			System.out.println("Prime " + 2);
			System.out.println("Prime " + 3);
		}
		
		for (int i = 5; i <= n; i++) {
			int cnt = 0;
			for (int j = 2; j * j <= n  ; j++) {
				
				if (i % j == 0) {
					cnt++;
					break;
				}

			}

			if (cnt == 0) {
				System.out.println("Prime " + i);
			}

		}

	}
	public static void AllPrimeSeiveAlgo(int n)
	{
		//time complexity  n(1/2+1/3+1/5+1/7.... progression of prime number(log(log(n))
	// O(nlog(log(n))
		
		boolean[] isprime= new boolean[n+1];
	
		for(int i = 2 ; i*i<=n; i++)
		{
			
			if(isprime[i]==false)
			{
				
				for(int j=i*i ; j<=n; j=j+i)
				{
					isprime[j]=true;
					//System.out.println("Prime "+ j +"-->"+isprime[j]);
				}
				//System.out.println("***********");
				
			}
				
			
		}
		
		for(int i=2; i<=n ;i++)
		{
			//System.out.println("Prime "+ i +"-->"+isprime[i]);
			if(isprime[i] == false)
			{
			 	System.out.println("Prime "+ i +"-->"+isprime[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		allPrime(15);
		//AllPrimeSeiveAlgo(10);
	}

}
