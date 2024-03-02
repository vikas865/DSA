package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FindMostOccuringWords {
	
	
	public static void getMostOccureing( String Str) {
		
		List<String> words= new ArrayList<String>(Arrays.asList(Str.split(" ")));
		System.out.println(words);
		
		Map<String, Integer> map= new HashMap<String, Integer>();
		
		for(String w: words) {
			map.put(w, map.getOrDefault(w, 0)+1);
		}
		
		//System.out.println(map);
		List<Integer> values= new ArrayList<Integer>(map.values());
		//System.out.println(values);
		
//		Collections.sort(values, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer a, Integer b)
//			{
//				return b.compareTo(a);
//			}
//		});
		
		 int  maxval=Integer.MIN_VALUE;
		
		for(int c: map.values())
		{
			if(c>maxval) {
				maxval=c;
			}
		}
		
	    // int  maxval=values.get(0);
		 
		 System.out.println("MaxValue"+maxval);
	     
	     for(Entry<String, Integer> v: map.entrySet()) {
	    	 
	    	 if(v.getValue()==maxval)
	    	 {
	    		 System.out.println(v.getKey());
	    	 }
	     }
		
		//System.out.println(values);
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getMostOccureing("Thank you for your comment and your participation");

	}

}
