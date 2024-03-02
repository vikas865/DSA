package basics;

public class InverseOfNumber {
	
	
	public static void inverse(int n) {
		
	
		int index=0;
		int sum=0;
		while(n!=0)
		{
			int res=n%10;
			 index++;
			 sum += index *(int) Math.pow(10,res-1);
			 System.out.println(sum);
			 //len--;
			n=n/10;
		}
		
		System.out.println(sum);
	}
	
	
	static int length(int n)
	{
		int cnt=0;
		while(n!=0)
		{
			n=n/10;
			cnt++;
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		inverse(15234);
	}

}
