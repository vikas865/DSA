package Geeks4Geeks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValleyCount {
	 public static int countingValleys( String path) {
		 
		//Map<Character, Integer> map = new HashMap<Character, Integer>();
		 
		 Stack<Character> stk = new Stack<Character>();
		 
		int check=0;
		int cnt=0;
		 
		 for(int i=0 ; i<path.length();i++)
		 {
		  	check= path.charAt(i)=='U' ? check+1: check-1;
		  	
		  	if(check==0 && path.charAt(i)=='U' )
		  	{
		  		cnt++;
		  	}
			 
		 }
		 
		 
		 return cnt;
		 
	 }
	
	public static void main(String[] args) {
		String path="DDUUUUDD";
		System.out.println(countingValleys(path));
	}

}
