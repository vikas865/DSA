package basics.baseConversion;

public class AnyBaseToDecimal {
	
	public static int anyBaseDecimal(int n, int base)
	{
		int p=1;
		int res=0;
		while(n != 0)
		{
			int temp =n % 10;
			n = n / 10;
			
			res += temp * p; 
			p = p * base; 
			
			
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		System.out.println(anyBaseDecimal(1172,8));
	}

}
