package Recursion;

public class TowerHanoi {


    public static void toH(int n, char a,char b, char c){

        if(n==0)
        {
            //System.out.println(a +" "+b+" "+c);
            return;
        }

        toH(n-1,a,c,b);
        System.out.println(n+"-->"+a+"-->"+b);
        toH(n-1,c,b,a);

    }

    public static void main(String[] args) {

        toH(3,'A','B','C');

    }
}
