package DM;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Triangle {
	
	public static int getminSum(List<List<Integer>> triangle) {
		int height=triangle.size();
		
		int[][] res= new int[height+1][height+1];
		
		for(int level =  height -1; level >= 0; level-- )
		{
			
			for(int i = 0; i<=level;i++)
			{
				res[level][i]=triangle.get(level).get(i) +
						Math.min(res[level+1][i], res[level+1][i+1]);
				
			}
			
		}
		
		
		return res[0][0];
	}
	

	public static void main(String[] args) {

		//to find minimum sum
		List<List<Integer>> triangle = new ArrayList<>(Arrays.asList(Arrays.asList(2), Arrays.asList(1, 3),
				Arrays.asList(8, 9, 1), Arrays.asList(4, 1, 8, 3)));
		System.out.println(getminSum(triangle));
		

	}

}
