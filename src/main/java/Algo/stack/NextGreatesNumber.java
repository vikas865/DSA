package Algo.stack;

import java.util.Stack;

public class NextGreatesNumber {

    public static void main(String[] args) {
        int[] nums= {4,7,3,4,8,1};
        Stack<Integer> stk= new Stack<>();
        int[] res= new int[nums.length];

        for(int i=nums.length-1;i>=0;i--)
        {

            if(!stk.isEmpty()){
               while(!stk.isEmpty() && nums[i]>stk.peek()) {
                   stk.pop();
               }

            }

            if(stk.isEmpty()){
                res[i]=-1;
            }else{
                res[i]=stk.peek();
            }

            stk.push(nums[i]);
        }


        for(int s: res) {
            System.out.println(s);
        }

    }
}
