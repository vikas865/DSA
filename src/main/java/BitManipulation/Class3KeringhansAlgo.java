package BitManipulation;

public class Class3KeringhansAlgo {

	public static void algo(int n) {
		
		int cnt=0;
		while(n!=0)
		{
			int x = n & (-n);
			cnt++;
			n= n-x;
			
		}
		System.out.println(cnt);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		algo(57);

	}

}
