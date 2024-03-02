package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class L290WordPattern {

	public static boolean wordPattern(String pattern, String s) {

		
		
		char[] patternchar = pattern.toCharArray();
		String[] s1 = s.split(" ");
		  //  String pattern ="aaaa";
		//	String s = "dog cat cat dog";
		  if(patternchar.length!= s1.length)
	            return false;
		//System.out.println(len);
		Map<String, Character> map = new HashMap<>();
		int[] dp = new int[s1.length];
				
		for(int i=0; i< s1.length; i++)
		{
			
			if(map.containsKey(s1[i])) {
				
				if(map.get(s1[i])!=patternchar[i])
				{
					return false;
				}
				
			}
			else
			{
				if(map.containsValue(patternchar[i]))
				{
					return false;
				}
			}
			
			
			map.put(s1[i], patternchar[i]);
			
		}
	


		//System.out.println(map);

		return true;
	}

	public static void main(String[] args) {

		//String pattern = "abba";
//		 String pattern ="abba";
//		String s = "dog cat cat dog";
		 String pattern ="aaa";
			String s = "aa aa aa aa";
		System.out.println(wordPattern(pattern, s));

	}

}
