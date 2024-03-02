package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateChar {

	public static void main(String[] args) {
		
		String str="Java";
		//List<Character> strchars=  new ArrayList<Character>();
		List<Character> strchars=     str.chars().mapToObj(c->(char) c).collect(Collectors.toList());
		
		Set<Character> dupchar=	strchars.stream().filter(k-> Collections.frequency(strchars,k)>1).collect(Collectors.toSet());
		
		Set<Character> uniquechar=	strchars.stream().filter(k-> Collections.frequency(strchars,k)==1).collect(Collectors.toSet());
		
		
		
		System.out.println(uniquechar);
		
		System.out.println(dupchar);
		 
		 

	}

}
