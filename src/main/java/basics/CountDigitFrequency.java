package basics;

public class CountDigitFrequency {

	public static void getFrequency(int n, int k)
	{ 
		int cnt=0;
		
		while(n!=0)
		{
			int temp= n%10;
			if(temp== k)
			{
			  cnt++;
			}
			
			n = n/10;
		}
		System.out.println(cnt);
		
	}
	
	
	public static void main(String[] args) {
		getFrequency(99346928,9);
	}
}
