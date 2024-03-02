 package Algo.NormalPrograms;

public class AllPrime {

    public static void seivePrime(int n) {

        boolean[] nums = new boolean[n + 1];

       // for (int i = 2; i <= n; i++) {
        //more optimized
        for (int i = 2; i*i <= n; i++) {

            if (nums[i] == false) {
                //for (int j = i * 2; j < n; j = j + i) {

                //more optimized
                for (int j = i * i; j <= n; j = j + i) {

                      nums[j] = true;

                }
            }


        }

        for(int i=2;i<=n; i++){

            if(nums[i]==false)
            {
                System.out.println(i);
            }
        }



    }

    public static void main(String[] args) {
         seivePrime(100);
    }
}
