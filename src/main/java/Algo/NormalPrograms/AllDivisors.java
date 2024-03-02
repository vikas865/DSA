package Algo.NormalPrograms;

public class AllDivisors {

    public static void findAllDivisors(int n) {

        // System.out.println(a + "->" + b);
        int i=0;
        for (i = 1; i * i <= n; i++) {

            if (n % i == 0) {
                System.out.println(i + "->" );
            }

        }

        for(;i>0;i--){
        	System.out.println("i is "+i);
            if(n%i==0)
                 System.out.println(n/i);

        }

    }


    public static void main(String[] args) {
        findAllDivisors(25);
    }
}
