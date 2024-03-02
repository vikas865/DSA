import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {

        String str="((a+b)+(c+d))";

        char[] chars= str.toCharArray();
        System.out.println(chars );
        System.out.println(" "+ chars.length);

        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<chars.length;i++){

            if(chars[i]==')' ){
                if(stack.peek()=='('){
                    System.out.println(true);
                    return;

                }
                else {
                    while(stack.peek()!='(')
                    {
                        stack.pop();
                    }
                    stack.pop();
                }

            }

            else
            {
                stack.push(chars[i]);
            }

        }

        System.out.println(stack);
        System.out.println(false);




    }
}
