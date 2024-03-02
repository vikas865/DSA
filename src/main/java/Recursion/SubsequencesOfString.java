package Recursion;

import java.util.ArrayList;

public class SubsequencesOfString {

    public static void seq(String str,String res,int i){

        if(str.length()==i) {
            System.out.println(res);
            return;
        }

        seq(str,res+str.charAt(i),i+1);
       // System.out.println("*************");
        seq(str,res,i+1);

    }



    public static ArrayList<String> getSeq(String str){

        if(str.length()==0)
        {
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;
        }

        char c= str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> res=getSeq(ros);
        ArrayList<String> finRes= new ArrayList<>();
        for(String s: res)
        {
            finRes.add(""+s);
            finRes.add(c+s);
        }

        return finRes;





    }



    public static void main(String[] args) {

        seq("abc","",0);

        ArrayList<String> s= new ArrayList<>();
        s=getSeq("abc");
        System.out.println(s);



    }

}
