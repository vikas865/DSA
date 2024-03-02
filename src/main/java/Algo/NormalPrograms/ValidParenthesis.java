package Algo.NormalPrograms;

import java.util.Stack;

public class ValidParenthesis {
	
	public static boolean getparenthesis(String str) {
		
		
		char[] c= str.toCharArray();
//		for(char d : c) {
//			System.out.println(d);
//		}
		
		Stack<Character> stk = new Stack<>();
		boolean flag= false;
		for(int i=0;i<c.length;i++)
		{
			
			if(c[i]=='('  || c[i]=='[' || c[i]=='{' )
				stk.add(c[i]);
			else if(!stk.isEmpty()) 
			{
			 if((stk.peek()=='(' && c[i]==')') || (stk.peek()=='{' && c[i]=='}') || (stk.peek()=='[' && c[i]==']')) {
				stk.pop();
				flag=true;
				
			 }
			 else {
				 return false;
			 }
				
			}
			else {
				return false;
			}
			
			
		}
		
		  if(!stk.isEmpty())
	        {return false;}
		
		
		
		return flag;
	}
	
	
	
	public static void main(String[] args) {
		
		
		//String str="([)]{}";
		String str="(])";
		//String str="]";
		System.out.println(getparenthesis(str));
		
		
	}

}
