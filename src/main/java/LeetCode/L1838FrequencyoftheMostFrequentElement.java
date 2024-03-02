package LeetCode;

import java.util.Stack;

public class L1838FrequencyoftheMostFrequentElement {

	public static int maxFrequency(int[] nums, int k) {

		Stack<Integer> stk = new Stack<>();
		stk.push(nums[nums.length - 1]);
		int cnt = 0;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (!stk.isEmpty() && nums[i] < stk.peek())

			{

				// System.out.println(nums[i] );

				if (stk.peek() == nums[i] + (stk.peek() - nums[i]) && k-(stk.peek() - nums[i])>=0) {
					k -= (stk.peek() - nums[i]);
					nums[i] += (stk.peek() - nums[i]);
					cnt++;
				} else {
					cnt = 0;
				}
				// System.out.println(cnt);
				if (k == 0)
					break;

				stk.pop();

			}
			stk.push(nums[i]);

		}

		return cnt + 1;
	}

	public static void main(String[] args) {

		int[] nums = {3,9,6};
		int k = 2;

		System.out.println(maxFrequency(nums, k));

	}

}
