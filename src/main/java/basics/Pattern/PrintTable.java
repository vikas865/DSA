package basics.Pattern;

public class PrintTable {
	
	public static void print(int n)
	{
		
		for(int i=1; i <= 10 ;i++)
		{
			System.out.println(n+" * "+i+" = "+ i*n);
			
		}
		
	}
	
	public static void main(String[] args) {
		print(5);
	}

}
