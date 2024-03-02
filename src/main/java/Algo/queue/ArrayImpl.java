package Algo.queue;

public class ArrayImpl {

    private int[] arr;

    private int front;
    private  int rear;

    public ArrayImpl(int size)
    {
        arr= new int[size];
        front=-1;
        rear=-1;
    }


    public void enqueue(int num){

        if(arr.length-1==rear)
        {
            System.out.println("Array is Full");
            return;
        }
        front=0;
        rear++;
        arr[rear]=num;


    }

    public void diaplay(){

        if(front==-1)
        {
            System.out.println("Empty Queue");
            return;
        }

        for(int i=front;i<=rear;i++)
        {
            System.out.print(arr[i]+"-->");
        }
        System.out.println("");
    }

    public void deque(){

        if(front==-1){
            System.out.println("Empty Queue");
            return;
        }

        front++;
        if(front>rear)
        {
            front=-1;
            rear=-1;
            return;
        }



    }


    public static void main(String[] args) {

        ArrayImpl que= new ArrayImpl(5);
        que.enqueue(5);
        que.enqueue(6);
        que.enqueue(7);
        que.enqueue(8);
        que.enqueue(9);
        que.enqueue(10);

        que.diaplay();

        que.deque();
        que.diaplay();
        que.deque();
        que.diaplay();
        que.deque();
        que.diaplay();
        que.deque();
        que.diaplay();
        que.deque();
        que.diaplay();
        que.deque();
        que.diaplay();


    }

}
