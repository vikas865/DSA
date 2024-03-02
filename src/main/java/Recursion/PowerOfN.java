package Recursion;

public class PowerOfN {

    public static int powN(int x, int n){

        if(n==0)
        {
            return 1;
        }

        int res= x*powN(x,n-1) ;

        return res;
    }


    public static int LograthmicpowN(int x, int n){

        //base
        if(n==0)
            return 1;

        int xpn2=LograthmicpowN(x,n/2);
        int xpn=xpn2*xpn2;


        if(n%2!=0)
        {
            xpn=x*xpn;
        }


        return xpn;
    }



    public static void main(String[] args) {

      //  System.out.println(powN(3,3));
        System.out.println(LograthmicpowN(3,3));

    }
}
