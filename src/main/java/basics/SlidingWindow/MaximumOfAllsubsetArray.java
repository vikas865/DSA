package basics.SlidingWindow;

import java.util.Arrays;
import java.util.Stack;

public class MaximumOfAllsubsetArray {

	public static void slidingMax(int[] arr, int window) {
		
		int n = arr.length;
		int[] res = new int[n];
		
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(n-1);
		res[n-1]=n;
		//{ 2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 0, 7, 19, 8, 12, 6 }
		for(int i = n-2; i>=0; i-- )
		{
			
			while(!stk.isEmpty() &&  arr[i]> arr[stk.peek()])
			{
				stk.pop();
			}
			
			if(stk.isEmpty())
			{
				res[i] = n; 
			}
			else
			{
				res[i]= stk.peek();
			}
			
			
			
			stk.push(i);
			
		}
			
		int j =0;
		for(int i =0 ; i<=n-window ;i++)
		{
			j=i;
			
//			if(j<i)
//			{
//				j=i;
//			}
			while(res[j] <  i+window)
			{
				j =res[j];
				//System.out.println("----" + j);
			}
			
			System.out.print(arr[j]+",");
			
		}
		
		
		System.out.println(Arrays.toString(res));
	}

	public static void main(String[] args) {
		int[] arr = { 2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 0, 7, 19, 8, 12, 6 };
		slidingMax(arr, 4);
		System.out.println(Arrays.toString(arr));
		//9,9,8, 12 ,12, 14,14 ,32,32,32,32,19,19,19

	}

}
