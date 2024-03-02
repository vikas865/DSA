package basics.SlidingWindow;

import java.util.Collections;
import java.util.HashMap;

public class VariableLongestPossibleRepeatingChar {
	
	
	
	public static void longestPossibleStringArray(String str, int k) {
		
		int i=0, j=0, max=0;
		
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		int[] charArray = new int[26];
		int frequency=0;
		
		while(i< str.length())
		{
			
			char  ch = str.charAt(i);
			charArray[ch-'A']++;
			//map.put(ch, map.getOrDefault(ch, 0)+1);
			frequency = Math.max(frequency,charArray[ch-'A']);
			
			while(i-j+1-frequency > k)
			{
				
				char start= str.charAt(j);
				//map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0)-1);
				charArray[start-'A']--;
				j++;
			}
			
			max= Math.max(max, i-j+1); 
			
			i++;
			
		}
		
		System.out.println(max);
		
	}

	public static void longestPossibleString(String str, int k) {
		
		int i=0, j=0, max=0;
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int frequency=0;
		
		while(i< str.length())
		{
			
			char  ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
			frequency = Math.max(frequency,map.get(ch));
			
			while(i-j+1-frequency > k)
			{
				
				map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0)-1);
				j++;
			}
			
			max= Math.max(max, i-j+1); 
			
			i++;
			
		}
		
		System.out.println(max);
		
	}

	public static void main(String[] args) {

//		String str = "ABAB";
//		int k = 2;
		
		String str = "AABABBA";
		int k = 1;
		longestPossibleString(str, k);
		longestPossibleStringArray(str, k);

	}

}
