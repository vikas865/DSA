package basics.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovePrimeNumberFromArray {

	public static void removePrime(ArrayList<Integer>  arr) {
		
		for(int i = arr.size()-1; i>=0; i--)
		{
			if(isPrime(arr.get(i)))
			{
				
				System.out.println(arr.get(i));
				arr.remove(i);
			}
			
		}
		
	}
	
	
	public static boolean isPrime(int n) {
		
		if(n < 2)
		{
			return false;
		}
		
		if(n == 2 || n == 3)
			return true;
		
		if(n%2==0 || n % 3 ==0)
			return false;
		
		for(int i=5; i * i<= n; i=i+6)
		{
			if(n%i==0 || n%(i+2)==0)
			{
				return false;
			}
			
		
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr1 =  List.of(7,18,3,14,19,31,72);
		ArrayList<Integer> arr= new ArrayList<Integer>(arr1);
		removePrime(arr);
		
		System.out.println(arr.toString());
		

	}

}
