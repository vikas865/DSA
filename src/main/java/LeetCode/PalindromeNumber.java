package LeetCode;

public class PalindromeNumber {
	
	
	public static boolean  findPalindrome(int num) {
		
		
		if (num==Integer.MAX_VALUE)
		return false;
		if (num<0)
		 return false;
		
		
		
		int res=reverseNumberOptimized(num);
		
		if(res==num)
			return true;
		else
			return false;
		
		
		
	}
	
	public static int countNum(int num) {
		
		int cnt=0;
		while(num> 0)
		{
			
					
			num= num/10;
			cnt++;
			
			
		}
		
		System.out.println(cnt);
		
		return cnt;
		
		
	}
	
	public static int reverseNumber(int num) {
		String str="";
		int tmp=0;
		int r=0;
		int cnt=countNum(num);
		int i=1;
		
		while(num> 0)
		{
			
			 tmp=num%10;
			  r=(int) (r+tmp*(Math.pow(10,cnt-i)));
			  i++;
			
			
			num= num/10;
			
			
		}
		
		System.out.println(r);
		return r;
	}
	
	
	public static int reverseNumberOptimized(int num) {
		
		int res=0;
		while(num>0)
		{
			
			int tmp=num%10;
			
			res= res*10+tmp;
			num=num/10;
			
			
		}
		
		
		System.out.println(res);
		
		return res;
	}
	
	
	public static void main(String[] args) {
		int num=12345;
		
		System.out.println(findPalindrome(num));
		
		//System.out.println(Integer.MAX_VALUE);
		
		//reverseNumber(1234);
		
		
		
	}

}
