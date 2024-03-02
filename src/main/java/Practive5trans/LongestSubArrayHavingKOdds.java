package Practive5trans;

public class LongestSubArrayHavingKOdds {

	public static int getSubArray(int[] arr, int k) {
		int i = 0, j = 0, n = arr.length, odcnt = 0, elecount = 0;

		while (j < n) {

			if (arr[j] % 2 != 0) {
				odcnt++;
			}
			//System.out.println(odcnt);
			while (odcnt > k && i <= j) {

				if (arr[i] % 2 != 0) {
					odcnt--;
					//System.out.println("arr[i++]"+arr[i]);

				}
				i++;
				System.out.println("i->"+i);
			}
               
			//if (odcnt == k)
			//{
				System.out.println("elecount"+elecount);
				elecount = Math.max(elecount, j - i + 1);
				 
			//}

			j++;
		}

		return elecount;

	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 6, 1, 9, 8, 2, 10 };
		int k = 2;

//		int arr[] = { 2, 3, 4, 11, 4, 12, 7 };
//		int k = 1;

		System.out.println(getSubArray(arr, k));
	}

}
