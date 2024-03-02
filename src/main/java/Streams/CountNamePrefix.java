package Streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountNamePrefix {
	
	public static void name(List<String> names, String filter) {
		
	 Map<String, Long> map=	 names.stream()
			 .collect(Collectors.groupingBy(e -> e, Collectors.counting())) ;
		// .collect(Collectors.toMap(Map.Entry:: getKey, Map.Entry:: getKey));
		 
		 
		System.out.println(map);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Ram", "Peter", "Pk","Suraj" ,"Peter");
		String filter ="P";
		name(names,filter);

	}

}
