package Practive5trans;

public class L121BestTimeToBuySellStock {

	public static int maxProfit(int[] prices) {
		// {7,1,5,3,6,4}

		int buying_price = prices[0];
		int current_profit = 0;
		int profit = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < buying_price) {
				// find minimum price
				buying_price = prices[i];

			} else {
				current_profit = prices[i] - buying_price;
				profit=Math.max(current_profit, profit);
			}

		}

		return profit;

	}
	
	
	public static int maxProfit1(int[] prices) {
		int min = Integer.MAX_VALUE;
        int max = 0;
	 for(int i : prices){
         min = Math.min(min, i);
         max = Math.max(max, i-min);

     }
     return max;
}
	public static void main(String[] args) {

		//int[] prices = { 7, 1, 5, 3, 6, 4 };
		// int [] prices = {7,6,4,3,1};
		 int [] prices = {2,4,1};

		System.out.println(maxProfit1(prices));
	}

}
