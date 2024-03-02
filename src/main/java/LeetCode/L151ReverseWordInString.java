package LeetCode;

import java.util.StringJoiner;

public class L151ReverseWordInString {
	
	 public static String reverseWords(String s) {
		 
		 String[] s1= s.trim().split(" ");

		 
		StringBuilder res =new StringBuilder();
		// StringJoiner res=new StringJoiner(" ");
		 
		 for(int i=s1.length-1 ; i>=1 ;i--)
		 {
			 if(!s1[i].isEmpty())
			 {
			// StringBuilder str= new StringBuilder(s1[i].replace(" ", ""));
			 
			 res.append(s1[i].trim()+" ");
			 }
		 }
	        
		
		 res.append(s1[0].trim());
		//System.out.println(res);
		 return res.toString();
	    }
	
	
	public static void main(String[] args) {
		
		//String s= "the sky is blue";
		String s= "  hello world  ";
		System.out.println(reverseWords(s));
		
	}

}
