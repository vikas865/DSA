package Practice;

public class histogram {

    public static void main(String[] args) {

        int[] arr= {3,1,0,7,5};

        //Mind max of array
        int max=arr[0];
        for(int i=1; i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        System.out.println(max);

        for(int i=max; i>=1;i--){

            for(int j=0; j<arr.length;j++){
                if(arr[j]>=i)
                {
                    System.out.print("\t*");
                }
                else
                    System.out.print("\t-");
            }
            System.out.println();
        }



    }
}
