package DM;

import java.util.Arrays;
import java.util.Collections;

public class KnapsackSolution {
	
	 static double knapSack(double W, int wt[], int profit[], int n) {
		 //find profit/weight ratio
		 
		 double p=0;
		 int[] pwratio=new int[n];
		 
		 for(int idx = 0; idx< profit.length;idx++ ) {
			 
			 pwratio[idx]=profit[idx]/wt[idx];
			 System.out.println("pwratio" +pwratio[idx]);
		 }
		 //sort based on pw ratio already sorted
		 
		
//		 for(int k=0; k< n ;k++)
//		 {
//			 System.out.println(profit[k]);
//		 }
		 for(int i=0; i<n ;i++)
		 {
			 
			 if(W > 0 && wt[i] < W)
			 {
				 W = W - wt[i];
				 p=p + profit[i];
				 
				 
				 
			 }
			 else if(W > 0)
			 {
				 p=p+ (double)(profit[i] * (double)(W/wt[i]));
				 W=W-(wt[i]* (W/wt[i]));
			 }
			 else {
				 break;
			 }
			 
		 }
		 
		 
		 
		 
		 
		 return p;
	 }
	
	public static void main(String[] args) {
	
			int profit[] = new int[] { 60, 100, 120 }; 
	        int weight[] = new int[] { 10, 20, 30 }; 
	        int W = 40; 
	        int n = profit.length; 
	        System.out.println(knapSack(W, weight, profit, n)); 
		
	}

}
