package Algo.NormalPrograms;

public class RightMostSetBit {

    public static int geRMbit(){

        int n = 10;
        int m = 1;
        int i = 1;

        if(n==0)
            return -1;

        while ((n & m) == 0) {

            m = m << i;
            i++;
        }

        return i;
    }


    public static int OptimiseRMbits(){
             int n=40;
       return (int) (Math.log10(n ^ (n & (n-1)))/Math.log10(2))+1 ;
    }


    public static void main(String[] args) {

        System.out.println(OptimiseRMbits());

    }
}
