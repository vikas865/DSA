package StringPractice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StringCypher {
	
	public static void cypher(String str) {
		int[] arr = new int[26];
		
		for(char i = 'A'; i<='Z'; i++ )
		{
			if(i-2<'A')
			{
				arr[i-'A']= i-2+26;
			}
			else
			{
				arr[i-'A']= i-2;
			}
				
		}
		
		System.out.println(Arrays.toString(arr));
		for(int i =0 ; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			System.out.print((char)arr[ch- 'A']);		
			
		}
		
	}
	
	
	public static void main(String[] args) {
		String str= "BZTVA";
		cypher(str);
		LinkedList<Integer> lst = new LinkedList<Integer>();
		
	}

}
