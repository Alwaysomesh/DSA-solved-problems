// Rat in maze Problem

import java.util.Scanner;

public class Que16 {
    private static final int N = 4;

    // Check if x, y is a valid index for N*N maze
    private boolean isSafe(int[][] maze, int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
    }

    // Utility function to solve the maze problem
    private boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol) {
        // If (x, y) is the goal, return true
        if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        // Check if maze[x][y] is valid
        if (isSafe(maze, x, y)) {
            // Mark x, y as part of the solution path
            sol[x][y] = 1;

            // Move forward in x direction
            if (solveMazeUtil(maze, x + 1, y, sol)) {
                return true;
            }

            // If moving in x direction doesn't give solution then move down in y direction
            if (solveMazeUtil(maze, x, y + 1, sol)) {
                return true;
            }

            // If none of the above movements work then BACKTRACK: unmark x, y as part of solution path
            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    // Solves the maze problem using backtracking
    public boolean solveMaze(int[][] maze) {
        int[][] sol = new int[N][N];

        if (!solveMazeUtil(maze, 0, 0, sol)) {
            System.out.println("Solution doesn't exist");
            return false;
        }

        printSolution(sol);
        return true;
    }

    // A utility function to print the solution matrix
    private void printSolution(int[][] sol) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] maze = new int[N][N];

        System.out.println("Enter the maze matrix (4x4) with 1s and 0s:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }

        Que16 rat = new Que16();
        rat.solveMaze(maze);
    }
}

/*
Approach:
1. Define a utility function `isSafe` to check if a cell is valid and open.
2. Define a recursive utility function `solveMazeUtil` to solve the maze problem using backtracking.
3. If the current cell is the goal, mark it as part of the solution and return true.
4. If the current cell is valid, mark it as part of the solution path.
5. Recursively move forward in the x direction and check if it leads to a solution.
6. If moving in the x direction doesn't lead to a solution, move down in the y direction.
7. If none of the above movements work, backtrack by unmarking the current cell as part of the solution path.
8. Define a function `solveMaze` to initialize the solution matrix and call the utility function.
9. Define a function `printSolution` to print the solution matrix.
10. In the main function, take user input for the maze matrix and call the `solveMaze` function.

Time Complexity: O(2^(N^2)) - In the worst case, we may have to explore all cells.
Space Complexity: O(N^2) - To store the solution matrix.

Example Input and Output:
Input:
1 0 0 0
1 1 0 1
0 1 0 0
1 1 1 1

Output:
 1  0  0  0 
 1  1  0  0 
 0  1  0  0 
 0  1  1  1 

Input:
1 0 0 0
1 1 0 1
0 1 1 0
1 0 1 1

Output:
 1  0  0  0 
 1  1  0  0 
 0  1  1  0 
 0  0  1  1 
*/
