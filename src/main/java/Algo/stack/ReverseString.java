package Algo.stack;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {

        String str="vikas Kumar";

        Stack<Character> stack = new Stack<Character>();

        char[] chars=str.toCharArray();
        for(char s: chars)
        {
            stack.push(s);
        }

        for(int i =0;i<str.length();i++){

            chars[i]=stack.pop();
        }



    }
}
