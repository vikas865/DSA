package LeetCode;

import java.util.Arrays;

public class AddTwoArray {

	public static int[] add(int[] arr1, int[] arr2) {
		int i = arr1.length-1;
		int j = arr2.length-1;
		int finalalength = Math.max(arr1.length, arr2.length);
		 int[] res = new int[finalalength + 1];
		 int carry =0;
		 int k = res.length-1;
		 
		 while(i >=0 || j>=0)
		 {
			 int n1= i>=0 ? arr1[i--] : 0;
			 int n2= j>=0 ? arr2[j--] : 0;
			 
			 int sum = n1 + n2 + carry;
			 int rem= sum%10;
			 carry= sum/10;
			 res[k--]=rem;
			 
			 
			 
			 
		 }
		 
		 if(carry>0)
		 {
			 res[k]= carry;
		 }
		
		
		return res;
		
	}
	
	
	
    public static void main(String[] args) {
//        int[] arr1 = {7, 4, 9};
//        int[] arr2 = {5, 6};
//        int carry = 0;
//        int count = 0;
//        int sum = 0;
//
//        int finalalength = Math.min(arr1.length, arr2.length);
//        System.out.println("finalalength"+finalalength);
//        int[] res = new int[arr1.length + 1];
//
//        for (int i = 0; i < finalalength; i++) {
//             sum = carry + arr1[i] + arr2[i];
//            System.out.println("sum"+sum);
//            carry = sum / 10;
//            res[i] = sum % 10;
//            count = i;
//            System.out.println(i);
//
//        }
//        // if(carry>0){
//
//        System.out.println("second"+count);
//
//        for (int j = count+1; j < arr1.length; j++) {
//
//            sum = carry + arr1[j];
//            carry = sum / 10;
//            System.out.println("carry"+carry);
//            res[j] = sum % 10;
//        }
//
//
//        if (carry > 0) {
//            res[res.length-1] = carry;
//        }
//
//
//        for(int k =0;k<res.length;k++)
//            System.out.println(res[k]);
//
//    }
    	  int[] arr1 = {7, 4, 9};
          int[] arr2 = {5, 6};
    	
    	System.out.println(Arrays.toString(add(arr1, arr2)));
    	
    }
}