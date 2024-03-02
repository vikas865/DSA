package Algo.NormalPrograms;

public class LCMOFNumber {


    public static int getLCM(int a, int b) {

        int max = Math.max(a, b);

        while (max > 0) {

            if (max % a == 0 && max % b == 0) {
                return max;
            }
            max++;
        }

        return a * b;
    }


    public static int optimizedLCM(int a, int b) {
        //Use optimized GCD
        int x=a;
        int y=b;
        int res=1;
        while (a != 0 && b != 0) {
            if (a > b) {
                a =a%b;
            }
            else{
                b=b%a;
            }
        }

        if(a!=0)
        {
            res=a;
        }else {
            res=b;
        }
        System.out.println(res);

        return (x*y)/res;

    }



public static void main(String[] args) {

    //System.out.println(LCMOFNumber.getLCM(12, 7));

    System.out.println(LCMOFNumber.optimizedLCM(12,7));

}
}
