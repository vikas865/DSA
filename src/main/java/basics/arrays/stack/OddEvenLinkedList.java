package basics.arrays.stack;

import java.util.LinkedList;

public class OddEvenLinkedList {
	
	public static  void  oddEven(LinkedList<Integer> lst) {
		LinkedList<Integer> even = new LinkedList<Integer>();
		LinkedList<Integer> odd = new LinkedList<Integer>();
		
		
		
		while(lst.size()>0)
		{
			if(lst.getFirst()%2==0)
			{
				int val=lst.getFirst();
				lst.removeFirst();
				even.add(val);
				
			}else {
				int val=lst.getFirst();
				lst.removeFirst();
				odd.add(val);
				
			}
			
			
			
		}
		
		while(even.size()>0)
		{
			int val=even.getFirst();
			even.removeFirst();
			odd.add(val);
		}
		
		
		System.out.println(odd);
		
		
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> lst = new LinkedList<Integer>();
		lst.add(2);
		lst.add(9);
		lst.add(7);
		lst.add(6);
		lst.add(5);
		lst.add(4);
		lst.add(12);
		lst.add(3);
		
		oddEven(lst);
	}

}
