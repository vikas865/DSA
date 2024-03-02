package Algo.NormalPrograms;

public class TrailingZerosfactorial {

    public static int getTrailingZero(int n){
        int res=0;

        int pow=5;
        while(pow<=n) {
            res = res + n / pow;
            pow*=5;
        }
        return res;
    }


    public static void main(String[] args) {

        int n=200;
        System.out.println(TrailingZerosfactorial.getTrailingZero(n));

    }

}
