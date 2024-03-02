package Recursion;

public class RotateNumber
{

    public static void main(String[] args) {

        int n=273156;
        int rnum=2;

        int qot= n/(int) Math.pow(10,rnum);
        int rem= n%(int) Math.pow(10,rnum);
        System.out.println(qot+" "+rem);

        int tempqot=qot;
        int count=0;

        while(tempqot!=0)
        {
            tempqot=tempqot/10;
            count++;
        }
        System.out.println(count);

        int finalnum=rem*(int)Math.pow(10,count)+qot;

        System.out.println("Final "+finalnum);
    }

}
