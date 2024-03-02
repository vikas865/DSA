package basics;

public class ReverseAnumber {
	
	
	public static void reverse(int n)
	{
		while(n!=0)
			
		{
			int res=n%10;
			
			n=n/10;
			System.out.println(res+ " "+n);
		}
		
	}
	
	public static void main(String[] args) {
		reverse(123456);
		
	}

}
