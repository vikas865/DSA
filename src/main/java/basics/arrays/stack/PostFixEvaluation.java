package basics.arrays.stack;

import java.util.Stack;

public class PostFixEvaluation {
	
	public static void evaluate(String str) {
		
		Stack<Integer> val = new Stack<Integer>();
		Stack<String> in = new Stack<String>();
		Stack<String> pre = new Stack<String>();	
		
		for( int i = 0 ; i < str.length(); i++) {
			char ch= str.charAt(i);
			if(Character.isDigit(ch))
			{
				val.push(ch-'0');
				in.push(ch+"");
				pre.push(ch+"");
			}else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' )
			{
				int val2= val.pop() ;
				int val1 = val.pop();
				val.push(operation(val1,val2,ch));
				// infix
				String val2in= in.pop() ;
				String val1in = in.pop();
				String inchar= '('+ val1in + ch + val2in + ')';
				in.push(inchar);
				
				
				String val2pre= pre.pop() ;
				String val1pre = pre.pop();
				String incharpre= ""+ch +val1pre+ val2pre   ;
				pre.push(incharpre);
				
			}
			
			
			
		}
		
		System.out.println(val.peek());
		System.out.println(in.peek());
		System.out.println(pre.peek());
		System.out.println(pre);
		
	}
	
	
	public static int operation(int v1, int v2, int op) {
		
		if( op == '+' )
		{
			return v1 + v2;
		}else if(op == '-' )
		{
			return v1 - v2;
			
		}
		else if(op == '*' )
		{
			return v1 * v2;
			
		}
		else {
			return v1 / v2;
		}
	}
	
	public static void main(String[] args) {
		
		String str= "264*8/+3-";
		evaluate(str);
		
	}

}
