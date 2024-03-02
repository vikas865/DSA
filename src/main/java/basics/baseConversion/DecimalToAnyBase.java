package basics.baseConversion;

public class DecimalToAnyBase {
	
	public static int baseConversion(int n , int base)
	{
		int res=0;
		int p=1;
		while(n != 0)
		{
			
			int temp= n % base;
			n = n / base;
			res +=temp *p;
			p = p * 10;
		}
		
		return res;
	}
	

		
	
	
	public static void main(String[] args) {
		System.out.println(baseConversion(634,8));
	}

}
