package basics.arrays.stack;

import java.util.Arrays;
import java.util.Stack;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class NextGreateElemet {

	public static void nextGreater(int[] arr) {
		int n = arr.length - 1;

		int[] res = new int[arr.length];
		res[n] = -1;
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(arr[n]);
		
		for (int i = n - 1; i >= 0; i--) {

			while (!stk.isEmpty() && arr[i] > stk.peek()  ) {

				stk.pop();
				  

			}
			if (stk.isEmpty() ) {
				res[i] = -1;
			} else {
				res[i] = stk.peek();
			}

		
			stk.push(arr[i]);
		}

		System.out.println(Arrays.toString(res));
	}

	public static void main(String[] args) {

		int[] arr = { 2, 5, 9, 3, 1, 12, 6, 8, 7 };
		nextGreater(arr);

	}

}
