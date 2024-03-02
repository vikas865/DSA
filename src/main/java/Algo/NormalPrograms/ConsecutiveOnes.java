package Algo.NormalPrograms;

public class ConsecutiveOnes {

 public static boolean  isConsecutive(int n){

     if((n & (n<<1))!=0)
         return true;
     else
         return false;

 }



    public static int ConsecutiveOnes(int n){

     int count=0;
        while(n!=0){

            n= n & (n<<1);
            count++;

        }

        return count;

    }


    public static void main(String[] args) {


        System.out.println(ConsecutiveOnes(101));
    }
}
