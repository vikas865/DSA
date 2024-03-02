package basics.arrays.stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeSortLinkedList {

	public static List<Integer> MergeSort(List<Integer> lst, int start, int end) {
		
		if(start==end)
		{
			List<Integer> br= new LinkedList<Integer>();
			br.add(lst.get(start));
			return br;
		}
		
		int mid=(start+end)/2;
		List<Integer> l1= MergeSort(lst, start, mid);
		List<Integer> l2= MergeSort(lst, mid+1, end);
		List<Integer> res=merge(l1,l2);
		
		return res;

	}

	public static int getMid(List<Integer> lst) {

		int j = 0;
		int i = 0;

		while (j < lst.size() && j + 2 < lst.size()) {

			i++;
			j += 2;
		}

		return i;

	}
	
	public static List<Integer> merge(List<Integer> lst1, List<Integer> lst2)
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
		
		
		
		
		return res;
		
		
	}
	
	

	public static void main(String[] args) {

		List<Integer> lst = new LinkedList<Integer>();

		lst = Arrays.asList(2, 7, 1, 6, 5, 3, 4);
		System.out.println(lst.size() );
		
		System.out.println(MergeSort(lst,0,6));

	}

}
