package Recursion;

public class CountDidit {

public static int count(int n){

    if(n==0)
        return 0;

    int result=1;
    return  result+count(n/10);
}

    public static void main(String[] args) {

        System.out.println(count(123));
    }
}
