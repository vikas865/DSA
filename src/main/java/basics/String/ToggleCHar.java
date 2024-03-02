 package basics.String;

public class ToggleCHar {
	
	public static String toggleCase(String str)
	{
		
		StringBuilder sb = new StringBuilder(str);
		for(int i=0 ;i< sb.length() ; i++)
		{
			if(sb.charAt(i)>= 'a' && sb.charAt(i)<= 'z')
			{
				char up =(char) (sb.charAt(i) +'A'- 'a');
				sb.setCharAt(i,(up));
				
			}else {
				char lc = (char) (sb.charAt(i)+'a'- 'A');
				sb.setCharAt(i,(char)(lc));
			}
				
			 
		}
		
		
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(toggleCase("AbCDefG"));
		
	}

}
