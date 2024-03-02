package basics.Pattern;

public class NumberPatternleftTriangle {
/*
 * 
1	
2	3	
4	5	6	
7	8	9	10
 * 

 * 	
 */
	
	public static void print(int n)
	{
		int value=1;
		
		for(int i = 1; i <= n; i++)
		{

			for(int j =1; j <= i; j++)
			{
				System.out.print(value+"\t");
				value++;
			}
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		print(4);
	}

}
