package Algo.SinglyLinkedList;

import java.util.Arrays;

public class MaxArray {

    public static int getMaxArray(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int getMinArray(int[] arr) {

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }


    public static int getSecondMax(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        //{12,34,2,34,33,1}
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];


            }


        }
        return secondMax;
    }


    public static int[] moveZerosRight(int[] arr) {

        int[] res = new int[arr.length];
//{8,1,0,2,1,0,3}
        // int i=0;
        int j = 0;

        for (int k = 0; k < arr.length ; k++) {

            if (arr[k] != 0 && arr[j] == 0) {
                //swap
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;

            }
            if(arr[j]!=0) {
                j++;
            }
        }


        return arr;
    }

    public static  int[] reversarray(int[] arr){

        int i=0;
        int j= arr.length-1;
          while(j>i)
          {
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;

              i++;
              j--;
          }
          return arr;
    }


    public static void main(String[] args) {

        int[] arr = {5, 9, 3, 15, 1, 2,7};
        System.out.println("Max Array :" + getMaxArray(arr));
        System.out.println("Min Array :" + getMinArray(arr));

        int[] arr1 = {12, 34, 2, 34, 33, 1};
        System.out.println(getSecondMax(arr1));

        int[] arr2 = {8, 1, 0, 2, 1, 0, 3};
        System.out.println(Arrays.toString(moveZerosRight(arr2)));


        System.out.println(Arrays.toString(reversarray(arr)));


    }
}
