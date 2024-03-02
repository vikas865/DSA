package LeetCode;

public class L55LengthofLastWord {
	
	
	 public static int lengthOfLastWord(String s) {
		 
		 //System.out.println(s.split(" "));
		 String[] allwords = s.split(" ");
		// System.out.println(allwords);
		 
		 for(String s1 : allwords )
			 System.out.println(s1);
		 
		 if(allwords[allwords.length-1].isEmpty())
			 return allwords[allwords.length-2].length();
		 
		
		 
		 return allwords[allwords.length-1].length();
		 
	 }
	 
	 
	 
	 public static void main(String[] args) {
		//String s= "Hello World";
		String s= "   fly me   to   the moon  ";
		System.out.println(lengthOfLastWord(s));
	}

}
