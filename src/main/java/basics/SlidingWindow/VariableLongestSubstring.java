package basics.SlidingWindow;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class VariableLongestSubstring {
	
	public static void longestStringWithoutRepetataion(String str) {
		Set<Character> set = new HashSet<Character>();
		int j=0 , i=0;
		int ans=0;
		while( i<str.length())
		{
			
			if(set.contains(str.charAt(i)))
			{
				
				ans = Math.max(ans, i-j);
				set.remove(str.charAt(j));
				j++;
				
			}
			else
			{
				set.add(str.charAt(i));
				i++;
			
				
			}
			
		
			
			
			
		}
		
		ans = Math.max(ans, i-j);
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		String str= "abcabcbb";
		longestStringWithoutRepetataion(str);
	}

}
