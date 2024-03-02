package basics.baseConversion;

public class AnyBaseSubstraction {
	
	public static int  sub(int n1, int n2, int base) {
		
		int res = 	0;
		int carry = 0;
		int pow = 	1;
		
		while(n1 != 0 || n2 != 0 || carry < 0)
		{
			int a1 = n1%10;
			int a2 = n2%10;
			
			int temp = (a1 - a2)+carry;
			System.out.println(temp);
			int minus= temp <0 ? temp +base: temp ;
			carry = temp<0 ? -1: 0;
			
			res +=  minus * pow;
			
			pow = pow * 10;
			n1 = n1 / 10;
			n2 = n2 / 10;
		}
		
		
		return res;
		
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(sub(1212,236,8));
	}

}
