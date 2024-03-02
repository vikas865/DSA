package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class NumberofAnagrams {
	
	public static int getAnagaramcount(String str, String ptr )
	{
		int i = 0, j = 0, k = ptr.length();
		Map<Character,Integer> map = new HashMap<>();
		
		for(char c  : ptr.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		 int cnt=map.size();
		while(j<str.length())
		{
			
			if(j-i+1<k)
			{
				
				
				
			}
			
		}
		
		
		
		return 0;
	}
	
	public static void main(String[] args) {
		String str="aabaabaa";
		String ptr="aaba";
	}

}
