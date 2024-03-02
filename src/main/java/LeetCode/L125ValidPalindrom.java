package LeetCode;

public class L125ValidPalindrom {
	
	
	public static boolean isPalindrome(String s) {
		
		String regex="[^a-zA-Z0-9]";
		StringBuilder str= new StringBuilder(s.replaceAll(regex,"").toLowerCase());
		System.out.println(str);
		int i=0;
		int j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;
			}
			
			i++;
			j--;
			
		}
		
		
		return true;
	}
	
	
	public static void main(String[] args) {
	//	String s = "A man, a plan, a canal: Panama123";
		//String s = "race a car";
		String s="0P";
		System.out.println(isPalindrome(s));
	}

}
