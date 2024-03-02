package Recursion;

public class PrintAllvalidParenthesis {



    public static void print(int n, char[] chars, int o,int c, int i){

        if(chars.length==i)
        {
            System.out.println(chars);
            return ;
        }
        //String str=


        if(o<n)
        {
            chars[i]='(';
             print(n,chars,o+1,c,i+1);
           // System.out.println(chars);
        }
         if (c<o) {

            chars[i]=')';
             print(n,chars,o,c+1,i+1);
           // System.out.println(chars);
        }

        //return chars;

    }

    public static void main(String[] args) {

        char[] chars= new char[6];
        print(3,chars,0,0,0);

    }
}
