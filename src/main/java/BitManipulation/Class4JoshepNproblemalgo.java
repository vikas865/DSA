package BitManipulation;

public class Class4JoshepNproblemalgo {
	
	public static void algo(int n) {
		
		int pow = power(n);
		int l= n-pow;
		int ans= 2*l+1;
		System.out.println(ans);
	}
	
	
	public static int power(int n) {
		int i=1;
		while(i*2<= n)
		{
			i= i*2;
			//System.out.println(i);
		}
		
		return i;
		
	}
	
	public static void main(String[] args) {
		// n= 2^x + l
		// 2l+1
		algo(17);
	}

}
