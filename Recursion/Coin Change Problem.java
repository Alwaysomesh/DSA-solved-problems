// Coin Change Problem

import java.util.Scanner;

class CoinChange {
    // Recursive function to find the minimum number of coins
    public int cc(int[] coins, int amount) {
        // Base case: if amount is 0, no coins are needed
        if (amount == 0) return 0;
        // Initialize the result to a large value
        int result = Integer.MAX_VALUE;
        
        // Try every coin that has a smaller value than amount
        for (int coin : coins) {
            if (amount - coin >= 0) {
                int subResult = cc(coins, amount - coin);
                // If subResult is not -1, update the result
                if (subResult != -1) {
                    result = Math.min(result, subResult + 1);
                }
            }
        }
        
        // If result is still Integer.MAX_VALUE, return -1 (no solution found)
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.println("Enter the number of coin types:");
        int n = scanner.nextInt();
        int[] coins = new int[n];
        
        System.out.println("Enter the coin values:");
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the amount:");
        int amount = scanner.nextInt();
        
        CoinChange solution = new CoinChange();
        int result = solution.cc(coins, amount);

        System.out.println("Minimum number of coins needed: " + result);
    }
}

/*
Approach:
1. Use recursion to solve the problem by breaking it down into smaller subproblems.
2. For each coin, recursively find the minimum number of coins needed for the remaining amount.
3. Use a base case to stop recursion when the amount is 0.
4. If no solution is found, return -1.

Time Complexity: O(S^n), where S is the amount and n is the number of coins.
Space Complexity: O(S), where S is the amount (due to the recursion stack).

Example 1:
Input:
3
1 2 5
11
Output:
Minimum number of coins needed: 3

Example 2:
Input:
2
2 5
3
Output:
Minimum number of coins needed: -1
*/
