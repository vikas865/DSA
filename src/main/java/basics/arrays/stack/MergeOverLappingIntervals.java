package basics.arrays.stack;

import java.util.Arrays;
import java.util.Stack;

public class MergeOverLappingIntervals {
	
	public static void merge(int[][] arr)
	{
		Pair[] p = new Pair[arr.length];
		for( int i = 0; i<arr.length; i++)
		{
			p[i] = new Pair(arr[i][0],arr[i][1]);
			
		}
		
		Arrays.sort(p);
		
		Stack<Pair> stk = new Stack<Pair>();
		
		for(int i =0 ; i< p.length ;i++)
		{
			
			if(i==0)
			{
				stk.push(p[i]);
			}
			else
			{
				Pair top = stk.peek();
				if(p[i].st > top.end)
				{
					stk.push(p[i]);
				}else {
					top.end = Math.max(top.end, p[i].end);
					
				}
				
			}
		}
		
		Stack<Pair> res = new Stack<Pair>();
		
		while(!stk.isEmpty())
		{
			res.push(stk.pop());
			
		}
		
		while(res.size()> 0)
		{
			Pair t= res.pop();
		System.out.println(t.st + " " + t.end);
		}
		
	}
	
	
	public static class Pair implements Comparable<Pair>{
		
		int st;
		int end;
		
		public Pair(int st , int end)
		{
			this.st= st;
			this.end= end;
		}
		
		//if this > other return +ve
		//if this = other return 0
		//if this < other return -ve
		
		public   int compareTo(Pair other) {
			
			if(this.st != other.st)
			{
				return this.st - other.st;
			}else
			{
				return this.end - other.end;
			}
		}
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		int[][] arr= { {22,28},{1,8},{25,27},{14,19},{27,30},{5,12} };
		merge(arr);
	}

}
