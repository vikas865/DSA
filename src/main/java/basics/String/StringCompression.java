package basics.String;

public class StringCompression {
	
	public static String compression(String str) {
		StringBuilder sb= new StringBuilder(str.charAt(0)+"");
		
			
		
		int cnt=1;
		for(int i =1; i<str.length(); i++)
		{
			char prev= str.charAt(i-1);
			char curr= str.charAt(i);
			
			if( prev == curr)
			{
				cnt++;
				
			}
			else {
				if(cnt >1)
				{
					sb.append(cnt);
				}
				sb.append(curr);
				cnt=1;
			}
			
			
		}
		
		if(cnt >1)
		{
			sb.append(cnt);
		}
		
		return  sb.toString();
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(compression("aaabbcccccccccccdfffgt "));
	}

}
