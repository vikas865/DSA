package Practice;

public class ShiftZerosRight {
	
	
	public static int[] shiftAllZeros(int[] arr)
	{
		
		//int [] arr= {10,0,22,8,0,5,0};
		 int len=arr.length;
		 int nz=0;
		 int z=0;
		while(nz<len)
		{
		
			if(arr[nz]!=0) {
				int temp=arr[nz];
				arr[nz]=arr[z];
				arr[z]=temp;
				nz++;
				z++;
				
			}
			else {
				nz++;
			}
			
			
		}
		
		return arr;
		
	}
	
	
	public static char[] shiftAllNumbers( String str)
	{
		
		 char[] arr= str.toCharArray();
		 int len=arr.length;
		 int alpha=0;
		 int num=0;
		while(alpha<len)
		{
		
			if(Character.isLetter(arr[alpha])) {
				char temp=arr[alpha];
				arr[alpha]=arr[num];
				arr[num]=temp;
				alpha++;
				num++;
				
			}
			else {
				alpha++;
			}
			
			
		}
		
		return arr;
		
	}


	
	public static void main(String[] args) {
		
		int [] arr= {10,0,22,8,0,5,0};
		int[] res=  shiftAllZeros(arr);
	
		
		for(int i=0;i<res.length;i++)
		{
			
			System.out.print(res[i]+" ");
		}
		
		System.out.println("\n");
	    char[] charres=	shiftAllNumbers("AND456HSE8");
	    
	    for(int i=0;i<charres.length;i++)
		{
			
			System.out.print(charres[i]+" ");
		}
	    
		
	}
}
