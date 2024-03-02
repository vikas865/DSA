package Practice;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DispalyArrayRecursion
{



public static void displayArray(int[] arr, int indx)

{
    if (arr.length==indx)
        return;

    System.out.println(arr[indx]);
    displayArray(arr,indx+1);




}

    public static void arrayReverse(int[] arr, int indx)

    {
        if (arr.length==indx)
            return;


        arrayReverse(arr,indx+1);
        System.out.println(arr[indx]);


    }


    public static int arrmaxArray(int[] arr, int indx)

    {
       // int c=0;
        if (arr.length-1==indx) {
            return arr[indx] ;
        }


       int misa=arrmaxArray(arr,indx+1);
       if (misa>arr[indx])
            return misa;
       else
           return arr[indx];



    }


    public static int firstOccurance(int[] arr, int indx ,int num)
    {

        if(indx==arr.length)
            return -1;


        if(arr[indx]==num)
            return indx;
        else {
            int secndo = firstOccurance(arr, indx + 1, num);
            return secndo;
        }


        //return 0;
    }


    public static int lastOccurance(int[] arr, int indx ,int num)
    {

        if(indx==arr.length)
            return -1;


        int lastindx = lastOccurance(arr, indx + 1 , num);
        if(lastindx==-1)
        {
            if(arr[indx]==num)
                return indx;
            else
                return -1;
        }
        else{
            return lastindx;

        }



        //return 0;
    }



    public static int[] allOccurance(int[] arr, int indx ,int fsf ,int num)
    {
        //int[] allindx;
        if(indx==arr.length)
            return new int[fsf];


        if(arr[indx]==num) {
            int[] allindx = allOccurance(arr, indx + 1, fsf + 1, num);
            allindx[fsf]=indx;
            return allindx;
        }
        else{
            int[] allindx = allOccurance(arr, indx + 1, fsf , num);
            return allindx;
        }




        //return 0;
    }

    public static void main(String[] args) {
      int [] n={10,20,30,40,50};
//        displayArray(n,0);
//
//        arrayReverse(n,0);
//        System.out.println(arrmaxArray(n,0));
        int [] n1={2,3,9,8,7,6,12,7,3,8};

       // System.out.println(firstOccurance(n1,0, 8));

       // System.out.println(lastOccurance(n1,0, 8));
        int[] all=allOccurance(n1,0, 0,8);
        //System.out.println(all.toString());

        for(int i=0;i<all.length;i++)
        {
            System.out.println(all[i]);
        }

        //System.out.println(lst.toString());

    }

}
