package Recursion;



import java.util.ArrayList;

public class PermutationOfString {

    public static ArrayList<String> permu(String str){



       if(str.length()==0)
       {
           ArrayList<String> base=new ArrayList<>();
           base.add("");
           return base;
       }

        ArrayList<String> res = new ArrayList<>();
       for (int i=0; i<str.length();i++) {
           char ch = str.charAt(i);
           String left= str.substring(0,i);
           String right= str.substring(i+1);


           String ros = left+right;

           ArrayList<String> path1 = permu(ros);




           for (String p : path1) {

               res.add(ch + p);
               //res.add();
           }
       }


        return res;
    }

    public static void main(String[] args) {


        ArrayList<String> s=permu("ABC");
        System.out.println(s);

    }
}
