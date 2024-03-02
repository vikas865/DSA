package basics.baseConversion;

public class AnyBaseAddititon {
	
	
	public static int  baseAdddition(int n1 , int n2, int base) {
		int res=0;
		int power=1;
		int carry =0;
		while(n1 !=0 || n2 !=0 || carry >0)
		{   
			int temp1 = n1 % 10;
			int temp2 = n2 % 10;
			
			int sum = temp1 + temp2 + carry;
			System.out.println("sum"+sum);
			//carry = sum-base >0 ? 1 : 0;
			carry=sum/base;
			System.out.println("carry" + carry);
			 sum = sum% base;
			//res += sum-base >0 ? (sum-base)*power: sum*power;
			res += sum * power;
			System.out.println("res"+ res);
			n1 = n1 / 10;
			n2 = n2 / 10;
			
			power= power*10;
			System.out.println("-----------------");
			
			
		}
		

		
//		if(carry >0)
//		{
//			res +=carry * power * 10 ;
//			
//		}
		
		
		return res;
		
	}
	
	public static void main(String[] args) {
		System.out.println(baseAdddition(346,7,8));
	}

}
