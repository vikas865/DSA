package Algo.NormalPrograms;

public class AllPrimeFactors {


    public static void gatfactors(int n) {

        int i = 2;
        //while(n!=1){
        while (i*i<=n) {

            while (n % i == 0) {
                n = n / i;
                System.out.println(i);
            }
            i++;

        }

        if(n!=1)
        {
            System.out.println(n);
        }

    }

    public static void main(String[] args) {
        gatfactors(40);
    }
}
