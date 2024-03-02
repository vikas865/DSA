package Algo.SinglyLinkedList;

public class SecondHighest {


    public static void main(String[] args) {

        int[] num= {12,34,2,34,33,1};
        int seconmax=0;
        int max=0;

        for(int i=0; i<num.length;i++)
        {
            if(num[i]>max)
            {
                seconmax=max;
                max=num[i];
            } else if (num[i]>seconmax  && num[i]!=max) {
                seconmax=num[i];
            }
        }
        System.out.println(seconmax);

    }
}
