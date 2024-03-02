package Practice;

import java.util.ArrayList;
import java.util.List;

public class TestCode {
	
	
	
	public static String reverse(String s1) {
		
	      String str= s1, nstr="";
	        char ch;
	       
	      System.out.print("Original word: ");
	      System.out.println("Geeks"); //Example word
	       
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        nstr= ch+nstr; //adds each character in front of the existing string
	      }
	      System.out.println("Reversed word: "+ nstr);
	      return nstr;
	    }
	
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> lst= new ArrayList<Integer>();
		 int s=lst.size();
	System.out.println(lst.size());
	
	
	    String s1= "vikas";
	    s1=reverse(s1);
	    System.out.println(s1);
		
		
	}

}
