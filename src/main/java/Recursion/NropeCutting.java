package Recursion;

import java.util.ArrayList;

public class NropeCutting {

    public static ArrayList<String> nRope(int n)
    {
        //base

        if(n==0)
        {
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;
        } else if (n<0) {
            ArrayList<String> base= new ArrayList<>();
            return base;
        }

        ArrayList<String> cut5=nRope(n-5);
        ArrayList<String> cut8=nRope(n-8);
        ArrayList<String> cut7=nRope(n-7);

        ArrayList<String> res=  new ArrayList<>();

        for(String s: cut5)
        {
            res.add(5+s);
        }

        for(String s: cut8)
        {
            res.add(8+s);
        }
        for(String s: cut7)
        {
            res.add(7+s);
        }
        return res;
    }


    public static void main(String[] args) {

        ArrayList<String> r= new ArrayList<>();
        r=nRope(15);
        System.out.println(r);
    }
}
