package basics.arrays.stack;

import java.util.Arrays;
import java.util.Stack;

public class HistogramArea {

	public static int area(int[] arr) {
		
		int[] rightboundary = leastvalueTowardsRight(arr);
		int[] leftboundary  = leastvalueTowardsLeft(arr);
		
		int maxarea = 0;
		for(int i=0; i < arr.length ;i++)
		{
			int width = rightboundary[i]- leftboundary[i] -1;
			int area = arr[i] * width;
		 
		 	if(area > maxarea)
		 	{
		 		maxarea=area;
		 	}
		}
		
		return maxarea;

	}

	public static int[] leastvalueTowardsLeft(int[] arr) {

		int n = arr.length;
		int[] res = new int[n];
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(0);
		res[0] = -1;
		// { 6, 2, 5, 4, 5, 1, 6 };
		for(int i = 1; i < n; i++)
		{
			
			while(! stk.isEmpty() && arr[i] < arr[stk.peek()])
			{
				stk.pop();
			}
			
			if(stk.isEmpty())
			{
				res[i]= -1;
			}
			else
			{
				res[i]= stk.peek();
			}
			
			stk.push(i);
		}
		
		
		System.out.println(Arrays.toString(res));

		return res;

	}

	public static int[] leastvalueTowardsRight(int[] arr) {

		int n = arr.length;
		int[] res = new int[n];
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(n - 1);
		res[n - 1] = n;
		// { 6, 2, 5, 4, 5, 1, 6 };

		for (int i = n - 2; i >= 0; i--) {

			while (!stk.isEmpty() && arr[i] < arr[stk.peek()]) {
				stk.pop();
			}

			if (stk.empty()) {
				res[i] = n;
			} else {
				res[i] = stk.peek();
			}

			stk.push(i);
		}

		System.out.println(Arrays.toString(res));

		return res;

	}

	public static void main(String[] args) {
		int arr[] = { 6, 2, 5, 4, 5, 1, 6 };
		 System.out.println(area(arr));
		//leastvalueTowardsRight(arr);
	}

}
