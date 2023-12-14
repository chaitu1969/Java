package Backtracking;



public class RatInMaze {
	
	public static boolean RatInAMaze(int[][] maze) {
		
		int N = maze.length;
		int path[][] = new int[N][N];
		
		boolean sol = solveMaze(maze, path, 0, 0);
		
		return sol;
		
	}
	
	public static boolean solveMaze(int[][] maze, int[][] path, int i, int j) {
		
		
		int N = maze.length;
		
		// checking i , j is valid
		
		if(i < 0 || i > N || j < 0 || j > N || maze[i][j] == 0 || path[i][j] == 1) {
			return false;
		}
		
		// Include the cell in current path
		  path[i][j] = 1;
	
		
		// checking the destination cell
		if(i == N-1 && j == N-1) {
			
			for(int a = 0; a < N; a++) {
				for(int b=0; b<N; b++) {
					System.out.print(path[a][b]+" ");
				}
				System.out.println();
			}
			
			return true;
		}
		
		
		// exploreing the directions
		
		// checking at top condition
		
		if(solveMaze(maze, path, i-1, j)) {
			return true;
		}
		
		// checking right side
		if(solveMaze(maze, path, i, j+1)) {
			return true;
		}
		
		//checking down side
		if(solveMaze(maze, path, i+1, j)) {
			return true;
		}
		
		
		if(solveMaze(maze, path, i, j-1)) {
			return true;
		}
		
		path[i][j] = 0;
		
		return false;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int[][] maze = {{1,1,0},{1,1,0},{0,1,1}};
		
		boolean pathPossible = RatInAMaze(maze);
		System.out.println(pathPossible);
		
		
	}

}
