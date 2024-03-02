package Algo.NormalPrograms;

public class HCForGCD {

    public static int getGCD(int a, int b) {

        int min = a < b ? a : b;
        System.out.println(min);
        int res = 0;
        while (min > 0) {

            if (a % min == 0 && b % min == 0) {
//              System.out.println(min);
//              break;
                return min;

            }
            min--;

        }

        return 1;
    }


    public static int eculidGCD(int a, int b) {

        while (a != b) {

            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }

        }
        return a;
    }


    public static int grabieldGCD(int a, int b) {

        while (a != 0 && b != 0) {

            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }

        }
        if (a != 0)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {

        //System.out.println(HCForGCD.getGCD(20,15));
        //System.out.println(HCForGCD.eculidGCD(20, 15));
        System.out.println(HCForGCD.grabieldGCD(20,15));


    }
}
