package Practice;

import java.util.Iterator;
import java.util.stream.Stream;

public class CountcharacterStreams {
	
	
	
	public static void main(String[] args) {
		
		
		String str= " I love coding";
		
		 Stream<Object> stream=str.chars().mapToObj(e-> String.valueOf((char)e));
		 
		long cnt= str.chars().mapToObj(e-> String.valueOf((char)e)).filter(e->e.equals("o")).count();
		 
		 Iterator<?> it=stream.iterator();
		 while(it.hasNext())
		 {
			 
			 System.out.print(it.next());
		 }
		 System.out.println("\n");
		 System.out.println("count of o :"+cnt );
		
		
	}

}
