package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class RotateArray {
	
	
	  public static List<Integer> rotateLeft(int d, List<Integer> arr) {
		   
		  for(int i=0; i<d;i++)
		  {
			  int temp=arr.get(0);
			  arr.add(temp);
			  arr.remove(0);
			  
			  
			 
		  }
		  
		  return arr;

		    }
	  
	  
	  public static void main(String[] args) {
		  List<Integer> arr= new ArrayList<>(List.of(1,2,3,4,5));
		  rotateLeft(2,arr);
		  System.out.println(arr);
		  
		
	}

}
