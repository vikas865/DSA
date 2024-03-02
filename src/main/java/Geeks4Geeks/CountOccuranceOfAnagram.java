package Geeks4Geeks;

import java.util.HashMap;

public class CountOccuranceOfAnagram {
	
	
	public static void findAnagaram(String str,String pattern ) {
		
		int k = pattern.length();
		int i=0 , j=0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		while(j<str.length())
		{
			map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0)+1);
			
			if(j-i+1<k)
			{
				j++;
			}else if(j-i+1==k)
			{
				
				
			}
			
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		String str= "aabaabaa";
		String pattern ="aaba";
		findAnagaram(str, pattern);
	}

}
