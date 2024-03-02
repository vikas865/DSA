package Algo.queue;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbergeneration {

    public static void main(String[] args) {

        Queue<String> que = new LinkedList<>();

        int num = 5;
        String[] res = new String[num];
        que.offer("1");
        for (int i = 0; i < 5; i++) {


            res[i] = que.poll();
            String s1 = res[i] + "0";
            String s2 = res[i] + "1";
            que.offer(s1);
            que.offer(s2);


        }

        for(String s:res)
            System.out.println(s);

    }
}
