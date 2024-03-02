package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNamePrefix {
	
	public static void name(List<String> names, String filter) {
		
	List<String> filteredstr=	 names.stream().filter(e -> e.startsWith(filter)).collect(Collectors.toList());
		System.out.println(filteredstr);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Ram", "Peter", "Pk","Suraj" ,"Peter");
		String filter ="P";
		name(names,filter);

	}

}
