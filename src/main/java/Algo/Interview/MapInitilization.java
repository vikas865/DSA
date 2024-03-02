package Algo.Interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapInitilization {

	public static Map<String, Integer> mapStatic;

	static {
		mapStatic = new HashMap<String, Integer>();

		mapStatic.put("A", 100);
		mapStatic.put("B", 100);

	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println(MapInitilization.mapStatic.get("A"));
		MapInitilization.mapStatic.put("C", 200);
		System.out.println(MapInitilization.mapStatic.get("C"));
		
		//Singelton Map
		
		Map<String, Integer> singeltonMap= Collections.singletonMap("D", 500);
		
		System.out.println(singeltonMap.get("D"));
		singeltonMap.put("E",400);  ///not suppotyed  java.lang.UnsupportedOperationException
		
		Map<String, String> streamMap= Stream.of(new String[][] {
			{"Tom" ,"100"},
			{"Jerry" ,"200"}
			}).collect(Collectors.toMap(data->data[0], data->data[1]));
		
		
		
		
	}

}
