// Unbounded Knapsack 0/1

import java.util.Scanner;

public class UnboundedKnapsack {

    // Function to find the maximum value that can be obtained
    static int unboundedKnapsack(int W, int[] wt, int[] val, int n) {
        // Base Case: If no items left or capacity is 0
        if (n == 0 || W == 0) {
            return 0;
        }

        // If weight of the nth item is more than Knapsack capacity W, then
        // this item cannot be included in the optimal solution
        if (wt[n - 1] > W) {
            return unboundedKnapsack(W, wt, val, n - 1);
        } else {
            // Return the maximum of two cases:
            // 1. nth item included multiple times
            // 2. not included
            return Math.max(val[n - 1] + unboundedKnapsack(W - wt[n - 1], wt, val, n), 
                            unboundedKnapsack(W, wt, val, n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the number of items:");
        int n = scanner.nextInt();

        int[] val = new int[n];
        int[] wt = new int[n];

        System.out.println("Enter the values of the items:");
        for (int i = 0; i < n; i++) {
            val[i] = scanner.nextInt();
        }

        System.out.println("Enter the weights of the items:");
        for (int i = 0; i<n; i++) {
            wt[i] = scanner.nextInt();
        }

        System.out.println("Enter the capacity of the knapsack:");
        int W = scanner.nextInt();

        // Calling the unboundedKnapsack function
        int maxVal = unboundedKnapsack(W, wt, val, n);
        System.out.println("Maximum value in Knapsack = " + maxVal);

        scanner.close();
    }
}

/*
Approach:
1. Define a recursive function `unboundedKnapsack` that takes the current capacity `W`, 
   the weights array `wt`, the values array `val`, and the number of items `n`.
2. Base case: If `n` is 0 or `W` is 0, return 0.
3. If the weight of the nth item is greater than `W`, call the function excluding the nth item.
4. Otherwise, return the maximum of two cases:
   a. nth item included multiple times.
   b. nth item not included.
5. In the main function, take input from the user for the number of items, their values, weights, 
   and the capacity of the knapsack.
6. Call the `unboundedKnapsack` function and print the result.

Time Complexity: O(2^n) - In the worst case, we have to explore all subsets.
Space Complexity: O(n) - Due to the recursion stack.

Example Input/Output:
Input:
3
60 100 120
10 20 30
50
Output:
Maximum value in Knapsack = 300

Input:
4
10 40 50 70
1 3 4 5
8
Output:
Maximum value in Knapsack = 110
*/
