package Geeks4Geeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayratingdiff {
	
 public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
         
         List<Integer> re= new ArrayList<>();
          int i=0;
          int alicecnt=0;
          int bobcnt=0;
          re.add(0);
          re.add(0);
         while(i< a.size())
         {
             if(a.get(i)> b.get(i))
             {
                 alicecnt++;
                 re.set(0,alicecnt);
             }
             else if (a.get(i)< b.get(i))
             {
                 bobcnt++;
                 
                 re.set(1,bobcnt);
             }
             
             i++;
         }

         
        return re;
    }

	
	public static void main(String[] args) {
		
		List<Integer> a =List.of(1,2,3);
		List<Integer> b =List.of(3,2,1);
		System.out.println(compareTriplets(a,b));
	}

}
