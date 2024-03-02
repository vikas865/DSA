package Recursion;

public class PrintLargestToSmallest {


public static void  printLToS(int n){

    //base condition
    if(n==0)
        return;

    System.out.println(n);
    printLToS(n-1);
}


    public static void  printStoL(int n){

        //base condition
        if(n==0)
            return;


        printStoL(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printLToS(10);
        System.out.println("*****************");
        printStoL(10);
    }
}
