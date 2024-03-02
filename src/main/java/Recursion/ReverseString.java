package Recursion;

public class ReverseString {


    public static String reverse(String s, String res, int length ){

       if(length<0) {
           return res;
       }
        //String r="";
        return reverse(s, res+s.charAt(length), length-1);
    }




    public static void main(String[] args) {

        System.out.println(reverse("abcd","",3));

    }
}
