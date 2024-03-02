package Practive5trans;
//java code to implement the approach
import java.util.*;

public class GCF {
	// Function to find the maximum number
	// of consecutive elements that can be bought
	static int maximumObjects(List<Integer> Costs1,
							List<Integer> Costs2,
							int budget)
	{
		int n = Costs1.size();

		// totalCost = total cost of k objects
		// runningCost to keep sum of Costs2
		int totalCost = 0, runningCost = 0;

		int i = 0, j = 0, ans = 0;

		// Stores elements in descending order
		// to keep maximum in front
		Deque<Integer> dq = new LinkedList<>();

		while (j < n) {
			while (!dq.isEmpty()
				&& Costs1.get(j) >= dq.peekLast())
				dq.removeLast();

			dq.addLast(Costs1.get(j));
			runningCost += Costs2.get(j);

			totalCost = dq.peekFirst()
						+ (j - i + 1) * runningCost;

			// If totalCost > budget
			// slide the window
			if (totalCost > budget) {
				runningCost -= Costs2.get(i);

				// Delete the current maximum
				if (dq.peekFirst() == Costs1.get(i))
					dq.removeFirst();
				i++;
			}
			// Keep storing the max possible
			// number of consecutive objects for
			// totalCost <= budget
			else
				ans = Math.max(ans, j - i + 1);

			j++;
		}
		return ans;
	}

	// Driver code
	public static void main(String[] args)
	{
		List<Integer> Costs1 = Arrays.asList(3, 6, 1, 3, 4);
		List<Integer> Costs2 = Arrays.asList(2, 1, 3, 4, 5);
		int budget = 25;

		// Function Call
		System.out.println(
			maximumObjects(Costs1, Costs2, budget));
	}
}
