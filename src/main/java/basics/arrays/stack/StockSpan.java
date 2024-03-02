package basics.arrays.stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
	
	
	public static void getSpan(int[] arr) {
		int n = arr.length;
		int res[] = new int[n];
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(0);
		res[0]=1;
		
		for(int i =1 ; i<n; i++)
		{
			System.out.println(Arrays.toString(res));
			System.out.println(stk);
			System.out.println("-------------");
			while(!stk.isEmpty() && arr[i]> arr[stk.peek()])
			{
			
				stk.pop();
				
				
				
				System.out.println("arr[i]"+ arr[i]);
			}
			
			if(stk.isEmpty())
			{
				res[i]= i+1;
			}
			else
			{
				res[i]=i-stk.peek();
			}
		
			
			stk.push(i);
		}
		

		
		System.out.println(Arrays.toString(res));
		System.out.println(stk);
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,5,9,3,1,12,6,8,7};
		getSpan(arr);
		
	}

}
