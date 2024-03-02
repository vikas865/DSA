package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ArrayManipulation {

	public static long arrayManipulation(int n, List<List<Integer>> queries) {
		// Write your code here
		List<Integer> res = new LinkedList<>();
		int r = 0;
		for (int i = 1; i <= n; i++) {
			res.add(0);
		}
		
		
		
		for (List<Integer> l : queries) {

			int start = l.get(0);
			int end = l.get(1);
			int incre = l.get(2);

			//System.out.println("start " + start + "end " + end + "incre " + incre);
			for (int i = start - 1; i < end; i++) {
				res.set(i, res.get(i) + incre);

			}

			System.out.println("Result "+res);
		}

		r = res.stream().max(Integer::compareTo).get();

		return (long) r;
	}
	
	
	
	public static long manipulation(int n, List<List<Integer>> queries) {
		
		
        int a,b,k;
        long max=0;
        long arr[]=new long[n+1];
        for(List query : queries)
        {
            a=(Integer)query.get(0);
            b=(Integer)query.get(1);
            k=(Integer)query.get(2);
            arr[a]=arr[a]+k;
            if(b+1<=n)
            {
                arr[b+1]=arr[b+1]-k;
            }
        }
        
        for(int m=0; m<arr.length;m++)
        {
        	System.out.print(arr[m]+" ");
        }
        
        long sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+arr[i];
            max=Math.max(max,sum);
        }
        
        return max;
		
		
	  
	}

	public static void main(String[] args) {
		List<List<Integer>> queries = new ArrayList<List<Integer>>();
		List<Integer> l0 = Arrays.asList(10, 4);
		List<Integer> l1 = Arrays.asList(2, 6, 8);
		List<Integer> l2 = Arrays.asList(3, 5, 7);
		List<Integer> l3 = Arrays.asList(1, 8, 1);
		List<Integer> l4 = Arrays.asList(5, 9, 15);
		//queries.add(l0);
		queries.add(l1);
		queries.add(l2);
		queries.add(l3);
		queries.add(l4);

		//System.out.println(arrayManipulation(10, queries));

		//System.out.println(queries);

		System.out.println(manipulation(10, queries));
	}

}
