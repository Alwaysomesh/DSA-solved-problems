// Bounded Knapsack 0/1

import java.util.Scanner;

public class BoundedKnapsack {

    // Recursive function to solve the 0/1 Knapsack problem
    public static int knapSack(int W, int[] wt, int[] val, int n) {
        // Base Case: If no items are left or capacity is 0
        if (n == 0 || W == 0) {
            return 0;
        }

        // If weight of the nth item is more than Knapsack capacity W, then this item cannot be included
        if (wt[n - 1] > W) {
            return knapSack(W, wt, val, n - 1);
        } else {
            // Return the maximum of two cases:
            // (1) nth item included
            // (2) not included
            return Math.max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1), knapSack(W, wt, val, n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of items
        System.out.print("Enter number of items: ");
        int n = scanner.nextInt();

        // Input: weights and values of items
        int[] wt = new int[n];
        int[] val = new int[n];
        System.out.println("Enter weights of items:");
        for (int i = 0; i < n; i++) {
            wt[i] = scanner.nextInt();
        }
        System.out.println("Enter values of items:");
        for (int i = 0; i < n; i++) {
            val[i] = scanner.nextInt();
        }

        // Input: capacity of knapsack
        System.out.print("Enter capacity of knapsack: ");
        int W = scanner.nextInt();

        // Output: maximum value that can be put in a knapsack of capacity W
        System.out.println("Maximum value in Knapsack = " + knapSack(W, wt, val, n));

        scanner.close();
    }
}

/*
Approach:
1. Define a recursive function `knapSack` that takes the current capacity `W`, the weights array `wt`, the values array `val`, and the number of items `n`.
2. Base case: If there are no items left or the capacity is 0, return 0.
3. If the weight of the nth item is more than the current capacity, skip this item and call the function for the remaining items.
4. Otherwise, return the maximum of two cases:
   a. Include the nth item and add its value to the result of the remaining capacity and items.
   b. Exclude the nth item and call the function for the remaining items.

Time Complexity: O(2^n) - In the worst case, we have two choices (include or exclude) for each item.
Space Complexity: O(n) - The depth of the recursion tree can go up to n.

Example Input and Output:
Input:
Enter number of items: 3
Enter weights of items:
10 20 30
Enter values of items:
60 100 120
Enter capacity of knapsack: 50

Output:
Maximum value in Knapsack = 220

Input:
Enter number of items: 4
Enter weights of items:
1 3 4 5
Enter values of items:
1 4 5 7
Enter capacity of knapsack: 7

Output:
Maximum value in Knapsack = 9
*/
