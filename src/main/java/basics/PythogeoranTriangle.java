package basics;

public class PythogeoranTriangle {

	public static boolean getTraingale(int a, int b , int c)
	{
		int max=a;
		if(b>max)
			max=b;
		
		if(c>max)
			max=c;
		
		
		if(max==a)
		{
			return (a*a)==(b*b)+(c*c);
			
		}
		else if(max==b)
		{
			return (b*b)==(a*a)+(c*c);
		}
		else
			return (c*c)==(b*b)+(a*a);
		
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(getTraingale(5,3,4));

	}

}
