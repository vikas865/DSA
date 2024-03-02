package basics;

public class GCDandLCM {
	
	public static int GCD(int n1, int n2)
	{
		
		//time complexity in worst case O(min+1)
		int min = n1<n2 ? n1: n2;
		
		
		for (int i=min ; i>1; i--) {
			
			if(n1%i ==0  && n2%i==0)
			{
				return i;
				
			}
			
		}
		
		return -1;
		
		
		
	}
	
	
	
	
	public static int EulidGCD(int a, int b) {
		
		
		while(a != b)
		{
			if(a > b)
			{
				a=a-b;
			}else {
				b=b-a;
			}
			
			
		}
		
		return a;
	}
	
	
	
	public static int GrabielGCD(int a, int b) {
		//time complexity is log(min(a,,b)
		
		while(a !=0 && b!=0)
		{
			if(a > b)
			{
				a=a % b;
			}else {
				b=b % a;
			}
			
			
		}
		
		if(a !=0)
			return a;
		else 
			return b;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(GCD(18,12));
		System.out.println(EulidGCD(18,12));
		System.out.println(GrabielGCD(18,12));
	}
	

}
