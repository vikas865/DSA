package basics.arrays.stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicateInSoartedLlist {
	
	public static void reoveDuplicate( LinkedList<Integer> lst) {
		
		List<Integer> res = new LinkedList<Integer>();
		res.add(lst.get(0));
		int j=0;
		for(int i=1 ; i<lst.size(); i++)
		{
			if(lst.get(i)  != res.get(j))
			{
				int val = lst.remove(i);
				j++;
				res.add(j, val);
				
			}

		}
		
		System.out.println(res);
		
	}
	
	
	public static void main(String[] args) {
		//List<Integer> lst1= Arrays.asList(2,2,2,3,3,4,5,5,5,5,5);
		LinkedList<Integer> lst = new LinkedList<>();	
		lst .add(2);
		lst .add(2);
		lst .add(2);
		lst .add(3);
		lst .add(3);
		lst .add(3);
		lst .add(5);
		lst .add(5);
		lst .add(5);
	 reoveDuplicate(lst);
	 
	 
	 
	}

}
