package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DupliacateElement {
	
	
	
	public static void main(String[] args) {
		
		
		String[] str = {"Amazon", "GCP", "Azure","APPLE", "GCP"};
		
		Set<String> dupset = new HashSet<String>();
		
		
		
		Set<String> newset = Arrays.asList(str).stream().filter(e -> !dupset.add(e) ).collect(Collectors.toSet());
		
		System.out.println(newset);
		
		
		
		
	}

}
