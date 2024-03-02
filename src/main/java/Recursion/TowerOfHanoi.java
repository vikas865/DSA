package Recursion;

public class TowerOfHanoi {


    public static void toh(int n, char a, char b, char c)
    {

        if(n==0)
            return;

        toh(n-1,a,c,b);
        System.out.println(a +" --> "+b);
        toh(n-1,c,b,a);


        //return "";
    }

    public static void main(String[] args) {


       toh(3,'A','B','C');

    }
}
