package StringPractice;

public class StringCompression {

	public static String getCompressedString( String str) {
		//aabbcccddaeef
		//String res = ""+str.charAt(0);
		StringBuilder res= new StringBuilder(str.charAt(0)+"");
		//System.out.println(res);
		int count=1;
		for( int i = 1; i<str.length();i++) {
			char current=str.charAt(i);
			char prev=str.charAt(i-1);
			
			if(current==prev) {
				count++;
				
			}
			else {
				
				if(count>1)
				{
					res=res.append(count);
					count=1;
					//System.out.println(res+count);
				}
				res=res.append(str.charAt(i));
				
				
			}
			
			
		}
		
		if(count>1)
		{
			res=res.append(count);
			count=1;
			
		}
		
		
		
		return res.toString();
	}
	
	
	public static void main(String[] args) {
	String str="aabbcccddaeeff";	
	System.out.println(getCompressedString(str));
	}
}
