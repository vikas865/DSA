package Practive5trans;

public class FloodFill {
	
	public static void fill(int[][] maze, int row, int column,String path)
	{
		if(row==column)
		{
			System.out.println(path);
			
			return;
		}
		
		boolean[][] visited= new boolean[row][column];
		
		if(row<0 || column <0 || row==maze.length || column == maze[0].length 
				|| maze[row][column]==1 || visited[row][column] != true)
		{
			return;
		}
		
		visited[row][column]=true;
		
		fill(maze,row-1, column, path+"t");
		fill(maze,row, column+1, path+"l");
		fill(maze,row+1, column, path+"d");
		fill(maze,row, column-1, path+"r");
		visited[row][column]=false;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
	}
}
