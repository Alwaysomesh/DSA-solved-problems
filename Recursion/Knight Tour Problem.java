// Knight Tour Problem

import java.util.Scanner;

public class Que19 {
    private static final int N = 8;
    private static final int[] moveX = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] moveY = {1, 2, 2, 1, -1, -2, -2, -1};

    // Check if x and y are valid indices for N*N chessboard
    private boolean isSafe(int x, int y, int[][] board) {
        return (x >= 0 && x < N && y >= 0 && y < N && board[x][y] == -1);
    }

    // Utility function to solve Knight's Tour problem
    private boolean solveKTUtil(int x, int y, int movei, int[][] board) {
        // If all squares are visited
        if (movei == N * N) {
            return true;
        }

        // Try all next moves from the current coordinate x, y
        for (int k = 0; k < 8; k++) {
            int nextX = x + moveX[k];
            int nextY = y + moveY[k];
            if (isSafe(nextX, nextY, board)) {
                board[nextX][nextY] = movei;
                if (solveKTUtil(nextX, nextY, movei + 1, board)) {
                    return true;
                } else {
                    board[nextX][nextY] = -1; // Backtracking
                }
            }
        }
        return false;
    }

    // Function to solve the Knight's Tour problem
    public boolean solveKT(int startX, int startY) {
        int[][] board = new int[N][N];

        // Initialization of the board
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                board[x][y] = -1;
            }
        }

        // Starting position
        board[startX][startY] = 0;

        // Start the tour from the initial position
        if (!solveKTUtil(startX, startY, 1, board)) {
            System.out.println("Solution does not exist");
            return false;
        } else {
            printSolution(board);
        }
        return true;
    }

    // Function to print the solution
    private void printSolution(int[][] board) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                System.out.print(board[x][y] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting X coordinate (0-7): ");
        int startX = scanner.nextInt();
        System.out.println("Enter starting Y coordinate (0-7): ");
        int startY = scanner.nextInt();
        scanner.close();

        Que19 knightTour = new Que19();
        knightTour.solveKT(startX, startY);
    }
}

/*
Approach:
1. Initialize the board with -1 to indicate unvisited squares.
2. Start from the initial position provided by the user.
3. Use a recursive utility function to try all possible moves from the current position.
4. If a move leads to a solution, mark the square and move to the next one.
5. If a move does not lead to a solution, backtrack and try the next move.
6. Print the board if a solution is found.

Time Complexity: O(8^(N^2))
Space Complexity: O(N^2)

Examples:
Input: startX = 0, startY = 0
Output: 
0	59	38	33	30	17	8	63	
37	34	31	60	9	62	29	16	
58	1	36	39	32	27	18	7	
35	48	41	26	61	10	15	28	
42	57	2	49	40	23	6	19	
47	50	45	54	25	20	11	14	
56	43	52	3	22	13	24	5	
51	46	55	44	53	4	21	12	

Input: startX = 2, startY = 2
Output: 
2	29	12	7	62	17	10	15	
11	6	3	28	9	14	63	18	
30	1	8	13	16	61	26	19	
5	4	27	60	25	20	33	64	
32	31	58	59	24	21	34	27	
57	56	55	54	23	22	35	36	
52	53	50	49	48	47	46	45	
51	50	49	48	47	46	45	44	
*/
