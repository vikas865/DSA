package Practice;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;

public class NumberElementCountPrint {


    public static int getcountNum(int n) {
        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }


    public static void prinLtoR(int n){
          int count=getcountNum(n);
          int div=(int)Math.pow(10,count-1);
        System.out.println(count+" "+div);
        int temp=0;
          while(div!=0){
              temp=n/div;
              System.out.println(temp);
              n=n%div;
              div=div/10;

          }


    }


    public static void prinRighttoLeft(int n){
        int count=getcountNum(n);

        int temp=0;
        while(n!=0){
            temp=n%10;
            System.out.println(temp);
            n=n/10;


        }


    }


    public static void main(String[] args) {

        int n = 2346780;
        System.out.println("Print Left to Right");
        prinLtoR(n);
        System.out.println("Print Right to Left");
        prinRighttoLeft(n);


    }
}
