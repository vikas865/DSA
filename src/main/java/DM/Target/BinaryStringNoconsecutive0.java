package DM.Target;

public class BinaryStringNoconsecutive0 {
	
	public static void noConsecutive0(int n) {
		
		int[] dp0 = new int[n+1];
		int[] dp1 = new int[n+1];
		dp0[1]=1;
		dp1[1]=1;
				
		
		for(int i =2; i<=n;i++)
		{
			dp1[i]= dp1[i-1]+dp0[i-1];
			dp0[i]= dp1[i-1];
			
		}
		
		
		System.out.println(dp0[n]+dp1[n]);
	}
	
	public static void noConsecutive0withoutArray(int n) {
		
		int dp0 =1;
		int dp1 = 1;
		
				
		
		for(int i =2; i<=n;i++)
		{
			int newdp0= dp1;
			int newdp1= dp0+dp1 ;
			
			dp0=newdp0;
			dp1=newdp1;
		}
		
		
		System.out.println(dp0+dp1);
	}
	public static void main(String[] args) {
		noConsecutive0(5);
		noConsecutive0withoutArray(5);
	}

}
