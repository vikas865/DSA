package basics.arrays.stack;

import java.util.Stack;

public class CelebrityProblem {

	public static void printcelebrity(int[][] arr) {
		
		Stack<Integer> stk = new Stack<Integer>();
		
		for(int i =0 ; i < arr.length ;i++)
		{
			stk.push(i);
			
		}
		
		while(stk.size() >=2)
		{
			int i= stk.pop();
			int j = stk.pop();
			
			if(arr[i][j]==1  )
			{
				stk.push(j);
			}
			else {
				stk.push(i);
			}
			
			
			
		}
		
		System.out.println(stk);
		int candid = stk.peek();
		
		for(int i = 0 ;  i<arr.length  ; i++)
		{
			if(i!=candid)
			{
				if(arr[i][candid]==0 || arr[candid][i]==1)
				{
					System.out.println(" No Celebrity");
					return;
				}
				
			}
			
		}
		
		System.out.println("Celebrity :" + candid );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
		printcelebrity(arr);
	}

}
