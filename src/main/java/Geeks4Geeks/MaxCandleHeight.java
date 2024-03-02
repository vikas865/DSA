package Geeks4Geeks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MaxCandleHeight {
	
	 public static int birthdayCakeCandles(int[] arr) {
		 int cnt=0;
		 
		 
		
		 Optional<Entry<Integer, Long>> comp=  Arrays.stream(arr).boxed()
				 .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
				 .entrySet().stream()
				 .max(Entry.comparingByKey());
		 
		 
		comp.ifPresent(entry -> { System.out.println(entry.getKey());
								  System.out.println(entry.getValue());});
		
//		Entry<Integer, Long> entry = comp.get();
//		
//		for(Entry<Integer, Long> s :  comp)
//		{
//			 System.out.println(s.getKey());
//		}
		
		
		if (comp.isPresent()) {
          
			Entry<Integer, Long> entry = comp.get();
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
            cnt= entry.getValue().intValue();
        }
		 
		 
		 return cnt;
	 }
	
	public static void main(String[] args) {
		int[] arr= {4,4,1,3};
		birthdayCakeCandles(arr);
	}

}
