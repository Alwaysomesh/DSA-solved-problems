// Unbounded Fractional Knapsack

import java.util.Scanner;

public class UnboundedFractional {

    // Function to calculate the maximum value for the given capacity
    public static double knapSack(int W, double[] wt, double[] val, int n) {
        // Base case: if no items left or capacity is 0
        if (n == 0 || W == 0) {
            return 0;
        }

        // Find the item with the maximum value-to-weight ratio
        double maxRatio = 0;
        int maxIndex = -1;
        for (int i = 0; i < n; i++) {
            double ratio = val[i] / wt[i];
            if (ratio > maxRatio) {
                maxRatio = ratio;
                maxIndex = i;
            }
        }

        // Calculate the maximum value by taking the maximum ratio item
        double maxValue = (W / wt[maxIndex]) * val[maxIndex];
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the number of items:");
        int n = scanner.nextInt();

        double[] val = new double[n];
        double[] wt = new double[n];

        System.out.println("Enter the values of the items:");
        for (int i = 0; i < n; i++) {
            val[i] = scanner.nextDouble();
        }

        System.out.println("Enter the weights of the items:");
        for (int i = 0; i < n; i++) {
            wt[i] = scanner.nextDouble();
        }

        System.out.println("Enter the capacity of the knapsack:");
        int W = scanner.nextInt();

        // Calculating the maximum value
        double maxValue = knapSack(W, wt, val, n);
        System.out.println("The maximum value in the knapsack is: " + maxValue);

        scanner.close();
    }
}

/*
Approach:
1. Identify the item with the highest value-to-weight ratio.
2. Fill the knapsack with as much of this item as possible.
3. Return the total value of the items in the knapsack.

Time Complexity: O(n)
- We iterate through the list of items once to find the item with the highest value-to-weight ratio.

Space Complexity: O(1)
- We use a constant amount of extra space.

Example Input/Output:
Input:
Enter the number of items:
3
Enter the values of the items:
60 100 120
Enter the weights of the items:
10 20 30
Enter the capacity of the knapsack:
50

Output:
The maximum value in the knapsack is: 300.0

Input:
Enter the number of items:
4
Enter the values of the items:
14 27 44 19
Enter the weights of the items:
6 7 9 8
Enter the capacity of the knapsack:
50

Output:
The maximum value in the knapsack is: 244.444
*/
