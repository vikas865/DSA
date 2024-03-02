package Algo.stack;

import java.util.EmptyStackException;
import java.util.Stack;
 class StackEmptyException extends Exception{

    StackEmptyException(String Message){
        super(Message);
    }

}


 public  class StackImpArray {

    private int[] arr;
    private int top;

    public StackImpArray(int size) {
        arr = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

//    public void add(int num) {
//        if (isEmpty()) {
//            top=top+1;
//            System.out.println("Top is"+top);
//            arr[top] = num;
//        }
//    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Stack");
            for (int i = top; i>= 0; i--) {
                System.out.print(arr[i]+"-->");
            }
        System.out.println();

    }

    public void push(int num) {

        if (top == arr.length-1) {
            System.out.println("Stack is full");
            return;
        }

        top=top+1;
        System.out.println("Top is"+top);
        arr[top] = num;

    }

public int peek() throws StackEmptyException {

        if(isEmpty())
        {
            System.out.println("hi");
            throw new StackEmptyException("STack is empty");
        }
            return arr[top];



    }


    public void pop()
    {

        if(isEmpty()){
            System.out.println("Stack is Empty nothing to delete");
            return;
        }
        top--;



    }



    public static void main(String[] args)  {

        StackImpArray stk = new StackImpArray(5);
       try {
           stk.peek();
       }catch(StackEmptyException e){
           System.out.println(e.getMessage());
       }

        stk.display();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.display();

        try {
            System.out.println("Last Element is"+stk.peek());
        }catch(StackEmptyException e){
            System.out.println(e.getMessage());
        }


        stk.pop();
        stk.pop();
        stk.pop();
        stk.pop();
        stk.pop();
        stk.pop();
        stk.display();

//        Stack<Integer> stck = new Stack<>();
//        stck.peek();

    }

}
