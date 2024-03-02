package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSum {


    public static void targetSum(int[] arr, int indx, String set, int sos,int target){

       if(indx==arr.length)
       {

           if(sos==target)
           {
               System.out.println(set);
               return;
           }
           return;
       }




        targetSum(arr, indx+1,set+arr[indx]+",", sos+arr[indx],target);
        targetSum(arr, indx+1,set, sos,target);


    }


    public static void main(String[] args) {

       int[] arr= {10,20,30,40,50};

        targetSum(arr,0,"",0,70);



    }
}
