package Practice;

import java.util.Scanner;

public class recursion {

 public static int pown(int n, int pow){

     if(pow==0)
         return 1;

     int fmn= pown(n, pow-1);
     int fn=n*fmn;
     return fn;

     //System.out.println(n);
 }

    public static void main(String[] args) {

//        Scanner scanner= new Scanner(System.in);
//        int num=scanner.nextInt();
//        int n2= pdi(num);
        System.out.println(pown(3,4));

    }
}

