package Recursion;

public class JoshephProblem {


    public static int survive(int n, int k){

        if(n==1)
            return 0;

       return   (survive(n-1,k)+k) %n;

        
    }


public static void main(String[] args) {

    System.out.println(survive(10,3));
}
}