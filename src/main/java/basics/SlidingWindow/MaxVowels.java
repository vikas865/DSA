package basics.SlidingWindow;

import java.util.HashMap;

public class MaxVowels {
	
	
	public static void maxVowel(String str, int k) {
		
		int cnt=0;
		//HashMap<Character, Integer> map = new HashMap<Character, Integer>()
		
		for(int i = 0; i < k; i++)
		{
			if(str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i'
					|| str.charAt(i)== 'o' || str.charAt(i)== 'u')
			{
				cnt++;
			}
			
		}
		 int max=cnt;
		int j=0;
		for(int i=k ;i<str.length(); i++)
		{
			
			if(str.charAt(j)== 'a' || str.charAt(j)== 'e' || str.charAt(j)== 'i'
					|| str.charAt(j)== 'o' || str.charAt(j)== 'u')
			{
				
				cnt--;
				
			}
			
			
			j++;
			
			if(str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i'
					|| str.charAt(i)== 'o' || str.charAt(i)== 'u')
			{
				
				cnt++;
				
			}
			
			
		
			
			
			  max= Math.max(max, cnt);
			
		}
		
		
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		String str ="abciiidef";
		maxVowel(str,3);
	}

}
