package Recursion;

public class Palindrome {


    public static boolean isPalindrome(String s, int i, int j){

       if(j<=1)
           return true;


        if(s.charAt(i)!=s.charAt(j))
        {
            return false;
        }

        return isPalindrome(s,i+1,j-1);


    }
    public static void main(String[] args) {


        System.out.println(isPalindrome("madam",0,4));

    }
}
