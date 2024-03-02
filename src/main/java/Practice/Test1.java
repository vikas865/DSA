package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test1 {

    public static void main(String[] args) {
        System.out.println("hello");

        int[] value={1,4,6,8,9,9,4};
        //System.out.println(Arrays.toString(value));
        HashMap<Integer, Integer> hashMap= new HashMap<>();
        for(int a: value){
            hashMap.put(a, hashMap.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> s: hashMap.entrySet()){
            if(s.getValue()>=2){
                System.out.println(s.getKey());
            }
        }

    }
}
