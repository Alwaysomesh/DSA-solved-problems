// N-Queens Problem

import java.util.Scanner;

public class Que14 {
    // Function to check if a queen can be placed on board[row][col]
    static boolean isSafe(int board[][], int row, int col) {
        // Check this row on left side
        for (int i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        // Check upper diagonal on left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check lower diagonal on left side
        for (int i = row, j = col; j >= 0 && i < board.length; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    // Recursive utility function to solve N-Queens problem
    static boolean solveNQUtil(int board[][], int col) {
        // Base case: If all queens are placed
        if (col >= board.length)
            return true;

        // Consider this column and try placing this queen in all rows one by one
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, i, col)) {
                // Place this queen in board[i][col]
                board[i][col] = 1;

                // Recur to place rest of the queens
                if (solveNQUtil(board, col + 1))
                    return true;

                // If placing queen in board[i][col] doesn't lead to a solution,
                // then remove queen from board[i][col]
                board[i][col] = 0; // BACKTRACK
            }
        }

        // If the queen cannot be placed in any row in this column col, then return false
        return false;
    }

    // Function to print the solution
    static void printSolution(int board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++)
                System.out.print(" " + board[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the board (N): ");
        int N = scanner.nextInt();
        int board[][] = new int[N][N];

        if (!solveNQUtil(board, 0)) {
            System.out.print("Solution does not exist");
            return;
        }

        printSolution(board);
    }
}

/*
Approach:
1. Use a recursive utility function to solve the N-Queens problem.
2. Check if placing a queen at a given position is safe.
3. Place the queen and recursively attempt to place the next queen.
4. If placing the queen leads to a solution, return true.
5. If not, backtrack and remove the queen, then try the next position.
6. Print the board configuration if a solution is found.

Time Complexity: O(N!)
- The time complexity is factorial because we are trying to place N queens on an N x N board, and for each queen, we have N choices.

Space Complexity: O(N^2)
- The space complexity is quadratic due to the board array of size N x N.

Sample Input and Output:
Input:
Enter the size of the board (N): 4
Output:
 0  0  1  0 
 1  0  0  0 
 0  0  0  1 
 0  1  0  0 

Input:
Enter the size of the board (N): 5
Output:
 1  0  0  0  0 
 0  0  1  0  0 
 0  0  0  0  1 
 0  1  0  0  0 
 0  0  0  1  0 
*/

