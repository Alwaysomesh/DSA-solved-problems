// Subset Sum Problem

import java.util.Scanner;

public class Que15 {
    // Function to check if there is a subset of the given set with sum equal to the given sum
    static boolean isSubsetSum(int[] set, int n, int sum) {
        // Base Cases
        if (sum == 0)
            return true; // If sum is 0, then a subset is found
        if (n == 0)
            return false; // If no elements are left and sum is not 0, then no subset is found

        // If last element is greater than sum, ignore it
        if (set[n - 1] > sum)
            return isSubsetSum(set, n - 1, sum);

        // Check if sum can be obtained by any of the following:
        // (a) including the last element
        // (b) excluding the last element
        return isSubsetSum(set, n - 1, sum) || isSubsetSum(set, n - 1, sum - set[n - 1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the number of elements in the set:");
        int n = scanner.nextInt();
        int[] set = new int[n];

        System.out.println("Enter the elements of the set:");
        for (int i = 0; i < n; i++) {
            set[i] = scanner.nextInt();
        }

        System.out.println("Enter the sum to check:");
        int sum = scanner.nextInt();

        // Checking if a subset with the given sum exists
        if (isSubsetSum(set, n, sum))
            System.out.println("Found a subset with given sum");
        else
            System.out.println("No subset with given sum");

        scanner.close();
    }
}

/*
Approach:
1. The function `isSubsetSum` is a recursive function that checks if there is a subset of the given set with a sum equal to the given sum.
2. The base cases are:
   - If the sum is 0, return true (a subset is found).
   - If no elements are left and the sum is not 0, return false (no subset is found).
3. If the last element is greater than the sum, ignore it and call the function for the remaining elements.
4. Otherwise, check if the sum can be obtained by either including or excluding the last element.

Time Complexity: O(2^n) - In the worst case, the function will explore all subsets.
Space Complexity: O(n) - The maximum depth of the recursion tree is n.

Sample Input and Output:
Input:
6
3 34 4 12 5 2
9
Output:
Found a subset with given sum

Input:
6
3 34 4 12 5 2
30
Output:
No subset with given sum
*/

