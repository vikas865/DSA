package basics.arrays.stack;

import java.util.LinkedList;

public class ReverseKNumbers {
	
	public static void reverseK(LinkedList<Integer> lst , int k) {
		LinkedList<Integer> res = new LinkedList<Integer>();
		
		int j=1;
		 while(lst.size() >0)
		 {
			
			 if(lst.size()>=k)
			 {
				 for(int i=0 ; i<k; i++)
				 {
				 int current= lst.getFirst();
				 lst.removeFirst();
				 res.addFirst(current);
				 }
				 
			 }else
			 { 
				int op= lst.size(); 
				 for(int i=0 ; i<op; i++)
				 {
					 
				 }
				 
			 }
			 
			 
			 
			 
		 }
		
		
	}
	
	
	public static void main(String[] args) {
		LinkedList<Integer> lst = new LinkedList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		lst.add(7);
		lst.add(8);
		lst.add(9);
		lst.add(10);
		lst.add(11);
		 reverseK(lst,3);
		
	}

}
