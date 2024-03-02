package basics;

public class SquareRoot {
	
	public static int root(int n) {
		long x=1;
		 while(x*x <=n )
		 {
			x++; 
		 }
		
		 
		 return (int) n-1;
	}
	
	public static void main(String[] args) {
		System.out.println(root(8));
	}

}
