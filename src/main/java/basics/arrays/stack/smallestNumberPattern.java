package basics.arrays.stack;

import java.util.Stack;

public class smallestNumberPattern {

	public static void smallestPattern(String str)
	{
		int j=1;
		Stack<Integer> stk = new Stack<Integer>();
		for(int i =0 ; i< str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(ch=='d')
			{
				
				stk.push(j);
				j++;
				
			}else if(ch == 'i')
			{
				stk.push(j); 
				j++;
				
				
				while(stk.size() >0)
				{
					System.out.print(stk.pop());
				}
				 
				//System.out.print(j);
				
				
			}
			
		}
		
		stk.push(j); 
		
		while(stk.size() >0)
		{
			System.out.print(stk.pop());
		}
		
		
	}
	
	
	public static void main(String[] args) {
		String str= "ddiddidd";
		smallestPattern(str);
		
	}
}
