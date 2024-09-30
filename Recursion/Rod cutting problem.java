// Rod cutting problem

import java.util.Scanner;

public class RodCutting {

    // Function to find the maximum revenue obtainable by cutting up the rod and selling the pieces
    public static int cutRod(int[] price, int n) {
        // Base case: if the rod length is 0, no revenue can be obtained
        if (n == 0) {
            return 0;
        }

        int maxRevenue = Integer.MIN_VALUE;

        // Recursively cut the rod in different lengths and compare to get the maximum revenue
        for (int i = 0; i < n; i++) {
            maxRevenue = Math.max(maxRevenue, price[i] + cutRod(price, n - i - 1));
        }

        return maxRevenue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the number of pieces:");
        int n = scanner.nextInt();
        int[] price = new int[n];

        System.out.println("Enter the prices of each piece:");
        for (int i = 0; i < n; i++) {
            price[i] = scanner.nextInt();
        }

        // Calling the cutRod function and printing the result
        System.out.println("Maximum Obtainable Value is " + cutRod(price, n));

        scanner.close();
    }
}

/*
Approach:
1. The function `cutRod` is a recursive function that calculates the maximum revenue obtainable by cutting the rod into pieces.
2. For each length `i` from 0 to `n-1`, it recursively calculates the maximum revenue by considering the price of the piece of length `i+1` and the maximum revenue obtainable from the remaining rod of length `n-i-1`.
3. The base case is when the rod length `n` is 0, in which case the revenue is 0.

Time Complexity: O(2^n) - This is because the function generates all possible configurations of different pieces.
Space Complexity: O(n) - This is due to the recursion stack.

Example Inputs and Outputs:
Input:
Enter the number of pieces:
8
Enter the prices of each piece:
1 5 8 9 10 17 17 20
Output:
Maximum Obtainable Value is 22

Input:
Enter the number of pieces:
4
Enter the prices of each piece:
2 5 7 8
Output:
Maximum Obtainable Value is 10
*/
