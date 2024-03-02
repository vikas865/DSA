package BitManipulation;

public class Class2RightmostSetBit {
	
	
	
	public static void getRMSB( int n)
	{
		 int comp1 = ~n;
		 int comp2 =comp1 +1;
		 
		 System.out.println(comp1);
		 System.out.println(comp2);
		 System.out.println(n&comp2);
		 //or -n is 2's complement of n
		 
		 System.out.println(n & -n);
		 
		
	}
	
	public static void main(String[] args) {
		// 1100
		
		int n=72 ;
		getRMSB(n);
		
	}

}
