package Algo.NormalPrograms;

public class FactorialProgram {

    public static  int findfactorial(int n){


        if(n==0)
            return 0;

        int res=1;

        while(n>0)
        {
            res=res*n;
            n--;
        }
  return res;
    }


    public static void main(String[] args) {

        int n=5;


        System.out.println(FactorialProgram.findfactorial(0));



    }
}
