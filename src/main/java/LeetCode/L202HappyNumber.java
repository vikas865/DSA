package LeetCode;

public class L202HappyNumber {
	
	 public static int powerCalc(int input)
	    {
	        int comp=input;
	        int sum = 0;

	        while(comp>0)
	        {
	            sum+= (comp%10) * (comp%10);
	            comp/=10;
	        }
	        System.out.println(sum + " sum");
	        return sum;
	    }

	    public static boolean isHappy(int n) {

	        do
	        {
	        System.out.println(n);
	        n =powerCalc(n);
	        }while(n>4);  //7, 10, 13, 31, and so on.

	        if(n==1)
	        {
	            return true;
	        }
	        return false;
	        
	    }
	
	
	public static void main(String[] args) {
		
	System.out.println(isHappy(7));
		
	}

}
