package basics.arrays.stack;

import java.util.ArrayList;
import java.util.Stack;

public class DuplicateBrackets {
	
	public static boolean getduplicate(String str) {
		
		Stack<Character> stk = new Stack<Character>();
		
		for(int i=0; i<str.length();i++)
		{
			
			if( str.charAt(i)==')')
			{
				if(stk.peek() == '(')
				{
					System.out.println(stk.toString());
					return true;
				
				}
				else {
					
					while(stk.peek() != '(')
					{
						stk.pop();
					}
					stk.pop();
				}
			}else {

				stk.push(str.charAt(i));
				//System.out.println(stk.toString());
			}
			
			
			
			
		}
		
		System.out.println(stk.toString());
		
		return false;
	}
	
	public static void main(String[] args) {
		
		//String str="((a+b) + (c+d))"; //false
		String str="(a+b) + ((c+d))"; //true
		System.out.println(getduplicate(str));
	}

}
