package Algo.NormalPrograms;

public class PowerOf2 {

public static boolean findNumPower2(int n){

    if(n==0)
        return false;

    return (n & (n-1))==0;
}

    public static void main(String[] args) {

        System.out.println(findNumPower2(128 ));

    }
}
