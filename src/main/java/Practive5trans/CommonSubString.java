package Practive5trans;

import java.util.HashSet;
import java.util.Set;

public class CommonSubString {
	
	
	
	static boolean get( String str1, String str2) {
		
		boolean flag= false;
		
		int min= Math.min(str1.length(), str2.length());
		for(int i = 0 ; i<min;i++)
		{
		for(int j = i+1; j<min; j++)
			if(str2.contains(str1.substring(i,j))) {
				flag=true;
				break;
				//System.out.println(str1.substring(i,j));
			}
		}
		
		
		return flag;
	}
	
static boolean getoptimized( String str1, String str2) {
		
		//boolean flag= false;
		
	  Set<Character> s1  = new HashSet<>();
	  Set<Character> s2  = new HashSet<>();
	  
	  for(char c : str1.toCharArray())
	  {
		  s1.add(c);
	  }
	  
	  for(char c : str2.toCharArray())
	  {
		  s2.add(c);
	  }
	  
	  s1.retainAll(s2);
	  
	  if(!s1.isEmpty())
		  return true;
	  
	  
	  
	  
		
		
		return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println(get("art", "art"));
		System.out.println(getoptimized("art", "art"));
		
	}

}
