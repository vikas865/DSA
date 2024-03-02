package Practive5trans;

public class L122BestTimeToBuyandSellStockII {
	
	
	 public static int maxProfit(int[] prices) {
		 
		 int buyingprice=prices[0];
		 int current_price=0;
		 int maxProfit=0;
		 
	
		 for(int i=1;i<prices.length;i++)
		 {
			 if(prices[i]<buyingprice) {
				 buyingprice=prices[i];
				 System.out.println("Buying price"+buyingprice);
			 } 
			 else {
			 
			 current_price=prices[i]- buyingprice;
			 System.out.println("current_price"+current_price);
			 maxProfit=Math.max(maxProfit,current_price+maxProfit);
			 buyingprice=prices[i];
			}
		 }
		 
	        return maxProfit;
	    }

	public static void main(String[] args) {
	// int[] prices= {7,1,5,3,6,4};
	// int[] prices= {1,2,3,4,5};
		int[] prices= {5,4,3,2,1};
	// int[] prices= {7,1,3,4};
	 System.out.println(maxProfit(prices));
	 

	}

}
