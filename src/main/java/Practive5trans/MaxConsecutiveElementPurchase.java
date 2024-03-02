package Practive5trans;

import java.util.TreeSet;

public class MaxConsecutiveElementPurchase {

	public static int getcost(int[] cost1, int[] cost2, int budget) {

		int i = 0, j = 0, n = cost1.length, ans = 0, runningcost = 0, totalcost = 0;

		TreeSet<Integer> tset = new TreeSet<Integer>();

		while (j < n) {
			tset.add(cost1[j]);

			runningcost  += cost2[j];
			//System.out.println("tset.last() "+tset.last());
			totalcost = tset.last() + ((j - i + 1) * runningcost);
			//System.out.println("totalcost"+totalcost);
			//System.out.println("i" + i + "j" + j + " ->" + (j - i + 1));

			if (totalcost > budget) {
				runningcost -= cost2[i];
				tset.remove(cost1[i]);

				i++;
			} else {

				ans = Math.max(ans, (j - i + 1));
			
				//System.out.println(totalcost);
				System.out.println("ans " + ans);

			}

			j++;

		}

		return ans;
	}

	public static void main(String[] args) {
		// formula max(costs1) + k*sum(costs2)<=budget
		int Costs1[] = { 3, 6, 1, 3, 4 }, Costs2[] = { 2, 1, 3, 4, 5 };
		int budget = 25, k = 3;

		System.out.println(getcost(Costs1, Costs2, budget));

	}

}
