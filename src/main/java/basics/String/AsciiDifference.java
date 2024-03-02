package basics.String;

public class AsciiDifference {
	
	
	public static void diffOfASCII(String str) {
		
		char c= str.charAt(0);
		StringBuilder sb= new StringBuilder(c);
		
		for(int i = 1; i<str.length();i++)
		{
			int temp =   str.charAt(i) -c ;
			sb.append(temp);
			sb.append(str.charAt(i));
			c= str.charAt(i);
			
			
		}
		
	//sb.append(str.charAt(str.length()-1));
	
	System.out.println(sb.toString());
		
	}
	
	public static void main(String[] args) {
		diffOfASCII("abdgca");
	}

}
