package LeetCode;

public class FirstOccurance {
	
	
	public static int getOccurance(String haystack, String needle) {
		int pos=0;
		int count=0;
		for(int i=0; i<haystack.length(); i++) {
			
			
			//if(haystack.charAt(i)==needle.charAt(count)) {
				
			for(int j=i; j<=haystack.length(); j++)
			{
				
			
			if(haystack.charAt(j)==needle.charAt(count)) {
			
				count++;
				
			}
			else {
				count=0;
				break;
				//return -1;
			}
			//System.out.println(count);
			if(count==needle.length())
			{
				
				//System.out.println(i);
				return i;
				
			}
			
				
			
			}	
		}
	//	}
		if(count==0)
			return -1;
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		//System.out.println(getOccurance("mississippi", "issip"));
		
		String haystack="mississippi";
		String needle="issip";
		
		System.out.println(haystack.indexOf(needle));
				
				
		
		
		
		
	}

}
