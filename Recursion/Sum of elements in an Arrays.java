// Sum of elements in an Arrays

import java.util.Scanner;

public class Que29 {
    // Method to calculate the sum of array elements recursively
    private int sum(int[] arr, int n) {
        // Base case: if n is less than or equal to 0, return 0
        if (n <= 0) {
            return 0;
        }
        // Recursive case: return the last element plus the sum of the rest
        return arr[n - 1] + sum(arr, n - 1);
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize the array with the given size
        int[] arr = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Create an instance of the class
        Que29 sae = new Que29();

        // Calculate the sum of the array elements
        int sum = sae.sum(arr, n);

        // Print the result
        System.out.println("Sum of array elements is " + sum);

        // Close the scanner
        scanner.close();
    }
}

/*
Approach:
1. Use a recursive method to calculate the sum of array elements.
2. The base case returns 0 when the size of the array (n) is less than or equal to 0.
3. The recursive case adds the last element of the array to the sum of the remaining elements.

Time Complexity: O(n)
- The function makes a single recursive call for each element in the array.

Space Complexity: O(n)
- The space complexity is O(n) due to the recursion stack.

Examples:
1. Input:
   Enter the number of elements in the array: 5
   Enter the elements of the array: 1 2 3 4 5
   Output:
   Sum of array elements is 15

2. Input:
   Enter the number of elements in the array: 3
   Enter the elements of the array: 10 20 30
   Output:
   Sum of array elements is 60
*/

