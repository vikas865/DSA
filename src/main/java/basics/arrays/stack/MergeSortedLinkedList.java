package basics.arrays.stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeSortedLinkedList {
	
	public static void merge(List<Integer> lst1, List<Integer> lst2)
	{
		List<Integer> res = new LinkedList<>();
		int i=0;
		int j=0;
		int k=0;
		while(i < lst1.size() && j < lst2.size())
		{
			
			if(lst1.get(i) < lst2.get(j))
			{
				res.add(k,lst1.get(i));
				i++;
				k++;
			}
			else
			{
				res.add(k,lst2.get(j));
				j++;
				k++;
				
			}
			
			
		}
		
		System.out.println("i" +i +" -> "+ lst1.size());
		
		while(i < lst1.size() )
		{
			res.add(k,lst1.get(i));
			i++;
			k++;
		}
		System.out.println("j" +j +" -> "+ lst2.size());
		while(j < lst2.size() )
		{
			res.add(k,lst2.get(j));
			j++;
			k++;
		}
		
		
		
		
		System.out.println(res);
		
		
	}
	
	
	public static void main(String[] args) {
		List<Integer> lst1 = new LinkedList<>();
		List<Integer> lst2 = new LinkedList<>();
		lst1 = Arrays.asList(10,20,30,40,50);
		lst2 = Arrays.asList(7,9,12,15,37,43,44,46,52,56);
		merge(lst1,lst2);
		
		
	}

}
