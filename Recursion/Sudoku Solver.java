// Sudoku Solver

import java.util.Scanner;

public class Que17 {
    private static final int SIZE = 9;

    // Check if it's safe to place a number at the given position
    private boolean isSafe(int[][] board, int row, int col, int num) {
        for (int x = 0; x < SIZE; x++) {
            // Check the row, column, and 3x3 subgrid
            if (board[row][x] == num || board[x][col] == num || board[row - row % 3 + x / 3][col - col % 3 + x % 3] == num) {
                return false;
            }
        }
        return true;
    }

    // Solve the Sudoku puzzle using recursion and backtracking
    private boolean solveSudoku(int[][] board, int row, int col) {
        // If we have reached the end of the board, the puzzle is solved
        if (row == SIZE - 1 && col == SIZE) {
            return true;
        }
        // Move to the next row if we have reached the end of the current row
        if (col == SIZE) {
            row++;
            col = 0;
        }
        // Skip the cells that are already filled
        if (board[row][col] != 0) {
            return solveSudoku(board, row, col + 1);
        }
        // Try placing numbers 1 to 9 in the current cell
        for (int num = 1; num <= SIZE; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;
                // Recursively attempt to solve the rest of the board
                if (solveSudoku(board, row, col + 1)) {
                    return true;
                }
                // Backtrack if placing num doesn't lead to a solution
                board[row][col] = 0;
            }
        }
        return false;
    }

    // Print the Sudoku board
    public void printBoard(int[][] board) {
        for (int r = 0; r < SIZE; r++) {
            for (int d = 0; d < SIZE; d++) {
                System.out.print(board[r][d]);
                System.out.print(" ");
            }
            System.out.print("\n");
            if ((r + 1) % 3 == 0) {
                System.out.print("");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] board = new int[SIZE][SIZE];

        // Take input from the user
        System.out.println("Enter the Sudoku puzzle (use 0 for empty cells):");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        Que17 solver = new Que17();
        if (solver.solveSudoku(board, 0, 0)) {
            System.out.println("Solved Sudoku:");
            solver.printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
        scanner.close();
    }
}

/*
Approach:
1. Use a recursive backtracking algorithm to solve the Sudoku puzzle.
2. Check if placing a number in a cell is safe by ensuring it doesn't violate Sudoku rules.
3. If safe, place the number and recursively attempt to solve the rest of the board.
4. If placing the number doesn't lead to a solution, backtrack and try the next number.
5. Continue this process until the board is solved or all possibilities are exhausted.

Time Complexity: O(9^(n*n)), where n is the size of the board (9 in this case). This is because each cell has 9 possible numbers to try.
Space Complexity: O(n*n) for the board and O(n*n) for the recursion stack, leading to O(n*n) overall.

Example Input and Output:
Input:
3 0 6 5 0 8 4 0 0
5 2 0 0 0 0 0 0 0
0 8 7 0 0 0 0 3 1
0 0 3 0 1 0 0 8 0
9 0 0 8 6 3 0 0 5
0 5 0 0 9 0 6 0 0
1 3 0 0 0 0 2 5 0
0 0 0 0 0 0 0 7 4
0 0 5 2 0 6 3 0 0

Output:
3 1 6 5 7 8 4 9 2 
5 2 9 1 3 4 7 6 8 
4 8 7 6 2 9 5 3 1 
2 6 3 4 1 5 9 8 7 
9 7 4 8 6 3 1 2 5 
8 5 1 7 9 2 6 4 3 
1 3 8 9 4 7 2 5 6 
6 9 2 3 5 1 8 7 4 
7 4 5 2 8 6 3 1 9 
*/
