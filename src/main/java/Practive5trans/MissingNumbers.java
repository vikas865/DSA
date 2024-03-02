package Practive5trans;

import java.util.Map;
import java.util.TreeMap;

public class MissingNumbers {

	public static void getMissing(int[] arr1, int[] arr2) {

		Map<Integer, Integer> mapset = new TreeMap<>();

		for (int a : arr1) {

			mapset.put(a, mapset.getOrDefault(a, 0) + 1);
		}

		for (int a1 : arr2) {
			int freq = mapset.get(a1);
			freq--;
			
			if(freq==0)
			{
				mapset.remove(a1);
			}
			else
			{
				mapset.put(a1, freq);
			}

		}
		
		System.out.println(mapset);

	}

	public static void main(String[] args) {

		int[] arr1 = { 7, 2, 5, 4, 6, 3, 5, 3 ,1};
		int[] arr2 = { 7, 2, 5, 3, 5, 3 };
		getMissing(arr1,arr2);
	}

}
