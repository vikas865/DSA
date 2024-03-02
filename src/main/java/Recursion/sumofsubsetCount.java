package Recursion;

public class sumofsubsetCount {

    public static int getSum(int[] arr, int sum, int i) {


        if (sum == 0) {
            return 1;
        }

        if (sum < 0) {
            return 0;
        }

        if (arr.length == i) {

            return 0;
        }



        // int val = arr[i];
        return getSum(arr, sum - arr[i], i + 1) + getSum(arr, sum, i + 1);


    }


    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 5};

        System.out.println(getSum(arr, 25, 0));
    }
}
