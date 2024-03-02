package basics.SlidingWindow;

public class AverageGreaterOrEqualThreshold {

	public static void avgGreater(int[] arr, int k, int threshold) {
		int ans = 0;
		int sum = 0;
		int cnt = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];

		}

		int avg = sum / k;

		if (avg >= threshold) {
			cnt++;
		}

		int j = 0;
		for (int i = k; i < arr.length; i++) {

			sum = sum - arr[j] + arr[i];

			j++;
			avg = sum / k;
			if (avg >= threshold) {
				cnt++;
			}

		}
		 System.out.println(cnt);
	}

	public static void main(String[] args) {
		int[] arr = {2,2,2,2,5,5,5,8};
		avgGreater(arr,3,4);
		
	}

}
