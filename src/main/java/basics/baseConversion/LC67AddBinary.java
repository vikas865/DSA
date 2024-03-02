package basics.baseConversion;

public class LC67AddBinary {
	public static String addBinary(String a, String b) {
		int i = a.length()-1, j= b.length()-1;
		int carry=0;
		StringBuilder sb= new StringBuilder();
     while(i >= 0 || j >=0 )
     {
    	 int digit1 = i>=0 ? a.charAt(i--)-'0'  :0;
    	 int digit2 = i>=0 ? b.charAt(j--)-'0'  :0;
    	 int sum = digit1+digit2+carry;
    	 
         sb.insert(0, sum%2);  	 
         carry = sum/2;
     }
		if(carry>0)
		{
			sb.insert(0, carry);
		}
	return sb.toString();
    }
	
	public static void main(String[] args) {
		String a = "11", b = "1";
		System.out.println(addBinary(a,b));
	}
}
