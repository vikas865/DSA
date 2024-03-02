package Practice;

import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {



        Stack<Integer> stack = new Stack<>();
        int[] nums = {2, 5, 9, 3, 1, 12, 6, 8, 7};
  // -,a,+
        //5,9,12,12,12,-1,8,-1,-1
        int[] res =new int[nums.length];
        stack.push(nums[nums.length-1]);
        res[nums.length-1]=-1;

        for (int i = nums.length-2; i >= 0; i--) {

            while(stack.size()>0 && nums[i]>=stack.peek()){
                stack.pop();
            }
            if(stack.size()==0)
                res[i]=-1;
            else
                res[i]= stack.peek();

            stack.push(nums[i]);
        }

        for(int j: res)
        System.out.println(j);

    }


}

