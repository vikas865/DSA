package Algo.NormalPrograms;

import java.util.HashSet;
import java.util.Set;

public class LonelyInteger {

    public static void getInt(int[] arr){

        Set<Integer> tempSet= new HashSet<>();
        for(int i=0; i<arr.length;i++){

            if(tempSet.contains(arr[i])){
                tempSet.remove(arr[i]);
            }
            else{
                tempSet.add(arr[i]);


            }
        }

        System.out.println(tempSet);
    }

    public static int optimizedSolution(int[] arr){
    // 5^5=0
    //0^ 5= 5

        int res=0;

        for(int i=0; i<arr.length;i++){

            res=res ^ arr[i];

            System.out.println("result"+res);

        }
    return res;
    }

    public static void getDuplicates(int[] arr){


        int res=0;

        for(int i=0; i<arr.length;i++){


             res= res ^ arr[i];
           if(res==0)
           {
               System.out.println("Duplicate "+arr[i]);
           }

        }

    }




    public static void main(String[] args) {

        int[] arr = {1,4,5,3,5,4,1};
        //getInt(arr);
        System.out.println(optimizedSolution(arr));

       // getDuplicates(arr);

    }
}
