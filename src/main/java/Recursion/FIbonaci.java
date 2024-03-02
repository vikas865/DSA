package Recursion;

public class FIbonaci {

public static int getfib(int n){
//1,1,2,3,5,8,13,21,34,55
   if(n==1 || n==2)
       return 1;

   return getfib(n-1)+getfib(n-2);











}


    public static void main(String[] args) {

        System.out.println(getfib(10));

    }
}
