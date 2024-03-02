package Recursion;

import java.util.ArrayList;

public class SubSequence {

    public static ArrayList<String> findSubSeq(String str)
    {
        //int len= (int) Math.pow(2,str.length());
       // String[] res= new String[len];

        if(str.length()==0)
        {
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;
        }

        char ch= str.charAt(0);
        String parm=str.substring(1);
        ArrayList<String>  res= findSubSeq(parm);

        ArrayList<String> mres= new ArrayList<>();

        for(String r: res)
        {
            mres.add(""+r);
            mres.add(ch+r);
        }







        return mres;


    }

    public static void main(String[] args) {

        ArrayList<String > res= new ArrayList<>();
         res= findSubSeq("abc");

         System.out.println(res);

    }

}
