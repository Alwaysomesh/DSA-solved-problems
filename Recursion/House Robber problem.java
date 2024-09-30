// House Robber problem

import java.util.Scanner;

public class HouseRobber {

    // Recursive function to calculate the maximum stolen value
    public static int maxLootRec(int[] hval, int n) {
        // Base case: If no houses are left, return 0
        if (n <= 0) return 0;
        
        // Base case: If only one house is left, rob it
        if (n == 1) return hval[0];
        
        // Two choices: Rob the nth house and skip the house just before it
        int pick = hval[n - 1] + maxLootRec(hval, n - 2);
        
        // Skip the current house and move to the next house
        int notPick = maxLootRec(hval, n - 1);
        
        // Return the maximum of the two choices
        return Math.max(pick, notPick);
    }

    // Function to calculate the maximum stolen value
    public static int maxLoot(int[] hval) {
        int n = hval.length;
        return maxLootRec(hval, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.println("Enter the number of houses:");
        int n = scanner.nextInt();
        
        int[] hval = new int[n];
        System.out.println("Enter the values of the houses:");
        for (int i = 0; i < n; i++) {
            hval[i] = scanner.nextInt();
        }
        
        // Calculating and printing the maximum stolen value
        int maxStolenValue = maxLoot(hval);
        System.out.println("Maximum stolen value: " + maxStolenValue);
        
        scanner.close();
    }
}

/*
Approach:
1. Define a recursive function `maxLootRec` that calculates the maximum stolen value.
2. Base cases:
   - If no houses are left, return 0.
   - If only one house is left, return its value.
3. For each house, we have two choices:
   - Rob the current house and skip the house just before it.
   - Skip the current house and move to the next house.
4. Return the maximum of the two choices.
5. The `maxLoot` function initializes the process by calling `maxLootRec` with the total number of houses.

Time Complexity: O(2^n) - Each house has two choices, leading to an exponential number of possibilities.
Space Complexity: O(n) - Due to the recursion stack.

Example Inputs and Outputs:
Input 1:
Enter the number of houses:
7
Enter the values of the houses:
6 7 1 3 8 2 4
Output 1:
Maximum stolen value: 19

Input 2:
Enter the number of houses:
5
Enter the values of the houses:
5 3 4 11 2
Output 2:
Maximum stolen value: 16
*/
