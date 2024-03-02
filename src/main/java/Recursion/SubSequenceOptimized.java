package Recursion;

public class SubSequenceOptimized
{

    public static void getOptimizedSeq(String str, String ans){

        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }

        char ch=str.charAt(0);
        String ros= str.substring(1);

        getOptimizedSeq(ros,ans+ch);
        getOptimizedSeq(ros,ans+"");



    }
    public static void main(String[] args) {

        getOptimizedSeq("abc","");

    }


}
