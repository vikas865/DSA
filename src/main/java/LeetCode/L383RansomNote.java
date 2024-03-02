package LeetCode;

import java.util.Map;
import java.util.HashMap;

public class L383RansomNote {

	public static boolean canConstruct(String ransomNote, String magazine) {

		//String sub = magazine;
		StringBuilder sub= new StringBuilder(magazine);
		int presentloc=0;
		
		for(int i=0; i<ransomNote.length();i++)
		{
			String c= ransomNote.charAt(i)+"";
			
			if(sub.indexOf(c)==-1)
			{
				
				return false;
			}else {
				
				if(sub.indexOf(c)>=presentloc) {
					
					presentloc=sub.indexOf(c);
					sub.deleteCharAt(presentloc);
					System.out.println(sub);
					//sub=sub.substring(presentloc+1);
					presentloc=0;
					
				}
				else {
					return false;
				}
				
			}
			
			
		}

		return true;
	}
	
	
	
	public static boolean canConstructHashMap(String ransomNote, String magazine) {
		
		Map<Character,Integer> map = new HashMap<>();
		for(char c: magazine.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
			
		}
		
		for(int i =0 ; i < ransomNote.length(); i++)
		{
			if(map.containsKey(ransomNote.charAt(i)))
			{
			  int val =	map.get(ransomNote.charAt(i))-1;
			  if (val==0)
			  {
				  map.remove(ransomNote.charAt(i));
			  }
			  map.put(ransomNote.charAt(i), val);
			  
			}
			else {
				return false;
			}
			
		}
		
		
		
		return true;
		
	}

	public static void main(String[] args) {
		String ransomNote = "fffbfg";
		String magazine = "effjfggbffjdgbjjhhdegh";
		
		//System.out.println(canConstruct(ransomNote,magazine));
		
		System.out.println(canConstructHashMap(ransomNote,magazine));
	}
}
