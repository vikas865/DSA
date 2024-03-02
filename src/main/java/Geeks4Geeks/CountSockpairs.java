package Geeks4Geeks;



import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Supplier;


public class CountSockpairs {
	
	public static void findPairs(int[] arr) {
		
	
					
		 Map<Integer, Long> counts =
		 //int counts = 
				 Arrays.stream(arr)
 .boxed() // Convert int to Integer
 .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
 .entrySet().stream().filter(entry -> entry.getValue()>=2)
 .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));;
		 
                  ;
               //  .forEach((value, count) -> System.out.println(value + ": " + count));
                  int allval=0;

                  for(Entry<Integer, Long> s :counts.entrySet())
                  {
                	   allval += s.getValue()/2;
                	  
                  }
  System.out.println();
		 
         System.out.println(allval);

	}
	
	public static void main(String[] args) {
		//int[] arr = {1,2,1,2,1,3,2};
		int[] arr = {4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5};
		
		findPairs(arr);
		
		
	}

}
