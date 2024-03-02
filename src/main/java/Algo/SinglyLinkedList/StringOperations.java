package Algo.SinglyLinkedList;

public class StringOperations
{

    public static void findPalindrome(String str){
        int len= str.length()-1;
        int i=0;
        int j=len;
        boolean flag=false;
        while (j!=i){
            if(str.charAt(i)==str.charAt(j))
            {
                flag=true;
            }
            i++;
            j--;

        }

        if(flag)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");

    }

    public static void main(String[] args) {

        String str="madam";

        findPalindrome(str);
    }

}
