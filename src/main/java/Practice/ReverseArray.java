package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {
	
	
    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
    
    int temp;
    int j=a.size()-1;
    for(int i=0 ;i<=j;i++,j--){
        temp=a.get(i);
        
        a.set(i,a.get(j));
        a.set(j,temp);
        
    }
        
      return a;  
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		
		List<Integer> lst= Arrays.asList(1,4,3,2);
		reverseArray(lst);
		System.out.println(lst);
		
	}

}
