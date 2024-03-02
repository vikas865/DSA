package Geeks4Geeks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CountCloudJumps {
	
	 public static int countcld( List<Integer> c) {
		 
	
			 
			
			int cnt=0;
			//System.out.println(c.size());
			 
			 for(int i=0 ; i< c.size()-1;)
			 {
				 //(0,1,0,0,0,1,0);
				 
				  if(c.get(i) ==0)
				  {
					  if(i+2<c.size() && c.get(i+2) !=1)
					  { 
						  cnt++;
						 
						  i=i+2;
						 // System.out.print(i +"-->");
					
						  
					  }
					  else 
					  {
						//  System.out.print(i +"--11-->");
						  cnt++;
						  i=i+1;
						 
					  }
										  
					  
				  }
				
			 }
			 
			 //System.out.println();
			 return cnt;
			 
		 }
		
		public static void main(String[] args) {
			List<Integer> path = List.of(0,1,0,0,0,1,0);
			System.out.println(countcld(path));
		}


}
