package Practive5trans;

public class IntegerArraysPalindrome {
	
	public static boolean isPalindrome(int[] arr)
	{
		for(int i = 0; i < arr.length; i++) {
			
		
			System.out.println("reverse" +reverse(arr[i]));
			if(arr[i]!=reverse(arr[i]))
			{
				return false;
				
			}
		}
		
		return true;
	}
	
	
	public static int reverse(int num)
	{
		int temp=0;
		while(num!=0)
		{
			temp=(num%10)+temp*10;
			
			num=num/10;
			
			
		}
		
		return temp;
	}
	
	
	public static int print(int num)
	{
		int temp=0;
		while(num!=0)
		{
			temp=(num/10)+temp*10;
			
			num=num/10;
			
			
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {121,131,141};
		System.out.println(isPalindrome(arr));
		
	//	System.out.println(print(123));
		
	}

}
