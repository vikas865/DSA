package LeetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class L28IndexofFirstOccurance {

	public static int strStr(String haystack, String needle) {


		
		int k= needle.length();
		for (int i = 0; i+needle.length() <= haystack.length(); i++) {

			if(haystack.substring(i,i+k).equals(needle)) {
				System.out.println(i);
				return i; 
				
			}
		}

		//System.out.print(str1lst);
		return -1;
	}

	
	public static int getStr(String haystack, String needle) {
		
		return haystack.indexOf(needle,2);
		
	}


		
	
	
	public static void main(String[] args) {

		String haystack = "sadbutsad";
		String needle = "sad";
		
//		String haystack = "sadbutsad";
//		String needle = "sad";
		
//		String haystack = "mississippi";
//		String needle = "issip";
		System.out.println(strStr(haystack, needle));

	}

}
