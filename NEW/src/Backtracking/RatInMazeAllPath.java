package Backtracking;

public class RatInMazeAllPath {

    public static void printPath(int[][] path) {
        for (int i = 0; i < path.length; i++) {
            for (int j = 0; j < path.length; j++) {
            	
            	
                System.out.print(path[i][j] + " ");
            	
            }
//            System.out.println();
        }
        System.out.println();
    }

    public static boolean RatInAMaze(int[][] maze) {
        int N = maze.length;
        int[][] path = new int[N][N];
        solveMaze(maze, path, 0, 0);
        return true; // Updated to always return true since we are printing all paths
    }

    public static boolean solveMaze(int[][] maze, int[][] path, int i, int j) {
        int N = maze.length;

        // Boundary check
        if (i < 0 || i >= N || j < 0 || j >= N || maze[i][j] == 0 || path[i][j] == 1) {
            return false;
        }

        // Include the cell in current path
        path[i][j] = 1;

        // Destination cell
        if (i == N - 1 && j == N - 1) {
            printPath(path);
            path[i][j] = 0;
            // Do not return true here, continue to explore other paths
        }

        // Exploring all directions
        solveMaze(maze, path, i - 1, j);
        solveMaze(maze, path, i, j + 1);
        solveMaze(maze, path, i + 1, j);
        solveMaze(maze, path, i, j - 1);

        // Backtracking step
        path[i][j] = 0;

        return false;
    }

    public static void main(String[] args) {
        int[][] maze = {{1, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        RatInAMaze(maze);
    }
}
