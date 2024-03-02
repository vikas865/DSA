package Algo.NormalPrograms;

public class CountAllSetBits {

    public static int countallSetBits(int n){
         int count=0;

         if(n==0)
         {
             return -1;
         }

         while(n!=0)
         {
             n=(n & (n-1));
             count++;
         }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(countallSetBits(42));

    }
}
