package basics.arrays;

public class SumOfTwoArrays {
	
	public static void sum(int[] arr1, int[] arr2, int n, int m) {
		
		int maxofarray = Math.max(n, m);
		int [] res = new int[maxofarray+1];
		int reslen= res.length-1;
		int carry=0;
		int a1=n-1;
		int a2= m-1;
		
		while(reslen>=0)
		{
            int sum=carry;
              if(a1>=0)
              {
            	  sum += arr1[a1];
              }
              
              if(a2>=0)
              {
            	  sum += arr2[a2];
              }
			carry= sum/10;
			res[reslen--]= sum%10;
			a1--;
			a2--;
			//System.out.println("res " +res[i+1]+" index"+ (i+1));
			
		}
		

		
		if(carry>0)
		{
			res[0]=carry;
		}
		
		for(int s : res)
		{
			System.out.print(s);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		int[] arr1 = {3,1,0,7,5};
		int[] arr2 = {1,1,1,1,1,1};
//		int[] arr1 = {9,9,9,9,9};
//		int[] arr2 = {9,9,9,9,9};
		sum(arr1, arr2, 5,6);
	}

}
