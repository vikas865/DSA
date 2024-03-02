package Algo.NormalPrograms;

public class DecimalToBinary {

    public static void convertoBinary( int n){
        String str="";
        while(n>0) {
            int bit = n % 2;
            //System.out.println(bit);
            str= bit+str;
            n = n / 2;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        convertoBinary(101);
    }
}
