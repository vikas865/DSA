package basics.baseConversion;

public class AnyBaaseToAnyBase {
	
	public static int printAnyToAny(int n, int sourcebase, int targetbase )
	{
		int dec= anyBaseToDecimal(n,sourcebase);
		System.out.println(dec);
		
		int res = decimalToAnyBase(dec, targetbase);
	
		
		
		return res;
	}
	
	public static int decimalToAnyBase(int n , int base)
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
	
	
	public static int anyBaseToDecimal(int n, int base)
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
		System.out.println(printAnyToAny(1172, 8, 2));
	}

}
