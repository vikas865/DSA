package newPrac;

public class Lc9 {
	
	//palindrome
	
	public static boolean isPalindrome(int x) {
		
		if(x<0)
		{
			return false;
		}
		
		
		return x== reverse(x);
	}
	
	
	public static int reverse(int x)
	{
	   int p=10;
	   int ans=0;
		while(x !=0)
		{
			 ans  = ans*p+ x%10 ;
			
			//ans += temp*p; 
			//System.out.println(ans);
			//p =p*10;
			x=x/10;
		}
		//System.out.println(ans);
		
		return ans;
	}
	    
	public static void main(String[] args) {
	System.out.println(isPalindrome(121));
	}

}
