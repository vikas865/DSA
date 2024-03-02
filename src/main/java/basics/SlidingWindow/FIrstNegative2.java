 package basics.SlidingWindow;

import java.util.ArrayDeque;
import java.util.Deque;

public class FIrstNegative2 {
	
	public static void name(int [] arr, int k) {
		
		int ans=0;
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		for(int i = 0 ;i < k ; i++)
		{
			if(arr[i]<0)
			{
				dq.addLast(arr[i]);
			}
			
		}
		
		if(!dq.isEmpty())
			System.out.println(dq.peek());
		else
			System.out.println(0);
		
		int j =1;
		
		for(int i =k ; i<arr.length; i++)
		{
			//System.out.println(dq);

			if(arr[i]<0)
			{
			
				dq.addLast(arr[i]);
			}
		
			if( dq.isEmpty() )
			{
				System.out.println(0);
				dq.addLast(0);
				//System.out.println("hi");
			}
			else
			{
				System.out.println(dq.peek());
				if(dq.peek() == arr[j] )
				{
					dq.pop();
					
				}
			
			}	
		
			j++;
			  
		
			
			
			
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {12,-1,-7,8,-15,13,16,28};
		//-1, -1,-7, -15, -15, 0
		name(arr,3);
	}

}
