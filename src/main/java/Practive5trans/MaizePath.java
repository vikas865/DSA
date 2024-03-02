package Practive5trans;

public class MaizePath {
	
	public static void printMaizePath(int sourcerow, int sourcecolumn,
			int destinationrow, int destinationcolumn, String allpath)
	{  //h, v
		
		if(sourcecolumn>destinationcolumn)
		{
			return;
		}
		
		if(sourcerow>destinationrow)
		{
			return;
		}
		//base
		if(sourcerow == destinationrow &&  sourcecolumn==destinationcolumn )
		{
			System.out.println(allpath);
			return;
			
		}
		
	
		
		
		
		printMaizePath(sourcerow,sourcecolumn+1,destinationrow,destinationcolumn, allpath+"h");
		
		
		printMaizePath(sourcerow+1,sourcecolumn,destinationrow,destinationcolumn,allpath+"v");
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		printMaizePath(1,1,3,3,"");
		
	}

}
