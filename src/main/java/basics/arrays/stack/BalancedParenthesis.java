package basics.arrays.stack;

import java.util.Stack;

public class BalancedParenthesis {
	
	
	public static boolean isBalanced(String str) {
		Stack<Character> stk = new Stack<Character>();
		
		for(int i = 0; i < str.length(); i++ )
		{
			
			if(! stk.isEmpty() && ( (  str.charAt(i) == ')' && stk.peek()=='(') 
					|| (  str.charAt(i) == '}' && stk.peek()=='{')
					|| (  str.charAt(i) == ']' && stk.peek()=='[')	)  )
			{
				stk.pop();
				
				
			}
			else if(str.charAt(i)== '(' ||  str.charAt(i)== '[' || str.charAt(i)== '{')
			{
				stk.push(str.charAt(i));
			}
			
			
		}
		
		if(stk.isEmpty())
		{
			System.out.println(stk);
			return true;
		}
		
		
		return false;
	}
	
	public static void main(String[] args) {
		String str= "[(a+b)+{(c+d)*(e/f)}]" ;
		
		System.out.println(isBalanced(str));
	}

}
