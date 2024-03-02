package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class L242ValidAnagram {
	
	
	 public static  boolean isAnagram(String s, String t) {
	        
		 Map<Character,Integer> map = new HashMap<>();
		 
		 for(char c: t.toCharArray())
		 {
			 map.put(c, map.getOrDefault(c, 0)+1);
			 
		 }
		 
		 for(char s1: s.toCharArray())
		 {
			 if(map.containsKey(s1))
			 {
				 int val=map.get(s1);
				 val--;
				 if(val==0)
				 {
					 map.remove(s1);
				 }
				 else {
					 
					 map.put(s1, val);
				 }
			 }
			 else {
				 return false;
			 }
		 }
		 
		 
		 
		 return map.isEmpty();
	    }
	
	 
	 
	   public boolean isAnagramOptimized(String s, String t) {
	        if(s.length() != t.length())
	            return false;

	        int map[]=new int[26];
	        for(char x : s.toCharArray()){
	            map[x-'a'] += 1;
	        }
	        for(char x : t.toCharArray()){
	            map[x-'a'] -= 1;
	        }    

	        for(int count: map){
	            if(count != 0)
	                return false;
	        }

	        return true;
	    }
	
	public static void main(String[] args) {
		
//		String s = "anagram";
//		String t = "nagaram";
		
		String s = "rat";
		String t = "car";
		System.out.println(isAnagram(s,t));
		
		
		
	}

}
