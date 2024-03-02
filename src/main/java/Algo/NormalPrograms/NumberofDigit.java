package Algo.NormalPrograms;

public class NumberofDigit {

public static int getDigitCount(int n)
{
    int count=0;
    while (n>0){
        System.out.println(n);
        n=n/10;
        count++;

    }



    return count;
}


    public static void printDigit(int n)
    {
        int count=0;
        while (n>0){

           int temp=n%10;
            System.out.print(temp);
            n=n/10;

        }




    }





    public static void main(String[] args) {


    int n =12345;
        //System.out.println(NumberofDigit.getDigitCount(n));
        NumberofDigit.printDigit(n);

    }
}
