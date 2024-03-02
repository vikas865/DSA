package Practive5trans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class MergeTwoArray {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		Map<Integer, Integer> mapData = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < m; i++) {
			mapData.put(nums1[i], mapData.getOrDefault(nums1[i], 0) + 1);
		}

		for (int j = 0; j < n; j++) {
			mapData.put(nums2[j], mapData.getOrDefault(nums2[j], 0) + 1);
		}

		LinkedList<Integer> lst= new LinkedList<Integer>(mapData.keySet());
		
		Collections.sort(lst);
		System.out.println(mapData);

		int i = 0;
		for (Integer s: lst) {

			int val =s;
			int count = mapData.get(s);

			

				nums1[i] = val;
				while (count > 1) {
					i++;
					nums1[i] = val;
					count--;

				}
				i++;
				

			}

		

		for (int b = 0; b < nums1.length; b++)
			System.out.println(nums1[b]);

	}
	
	
	
	 public static void mergeoptimized(int[] arr1, int m, int[] arr2, int n) {
         int o = arr1.length-1;
            m = m-1;
            n = n-1;
         while(n >= 0){
             if(m >=0 && arr1[m] > arr2[n]){
                 arr1[o] = arr1[m];
                 o--;
                 m--;
             }
             else{
                 arr1[o] = arr2[n];
                 o--;
                 n--;
             }
         }
   }

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		//int[] nums1 = { 2, 0};
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		//int[] nums2 = { 1};
		int n = 3;

		mergeoptimized(nums1, m, nums2, n);
		for (int b = 0; b < nums1.length; b++)
			System.out.println(nums1[b]);

	}

}
