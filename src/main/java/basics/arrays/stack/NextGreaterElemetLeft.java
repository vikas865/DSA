package basics.arrays.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElemetLeft {

	public static void usingLeftIteration(int[] arr) {

		int n = arr.length;
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(0);

		int[] res = new int[n];
		for (int i = 1; i < n; i++) {

			while (!stk.isEmpty() && arr[i] > arr[stk.peek()]) {
				int pos = stk.peek();
				res[pos] = arr[i];
				stk.pop();
			}

			stk.push(i);
		}

		while (!stk.isEmpty()) {
			res[stk.peek()] = -1;
			stk.pop();

		}

		System.out.println(Arrays.toString(res));

	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 9, 3, 1, 12, 6, 8, 7 };
		usingLeftIteration(arr);
	}
}
