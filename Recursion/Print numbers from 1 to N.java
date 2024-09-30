// Print numbers from 1 to N

import java.util.Scanner;

public class Que23 {
    // Method to print numbers from 1 to n using recursion
    private void printNumbers(int n) {
        // Base case: if n is less than or equal to 0, return
        if (n <= 0) {
            return;
        }
        // Recursive call with n-1
        printNumbers(n - 1);
        // Print the current number
        System.out.println(n);
    }

    public static void main(String[] args) {
        // Create an instance of the Que23 class
        Que23 pn = new Que23();
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int N = scanner.nextInt();
        // Call the printNumbers method with the user input
        pn.printNumbers(N);
        // Close the scanner
        scanner.close();
    }
}

/*
Approach:
1. Create a method `printNumbers` that takes an integer `n` as input.
2. If `n` is less than or equal to 0, return from the method (base case).
3. Recursively call `printNumbers` with `n-1`.
4. Print the current value of `n` after the recursive call.

Time Complexity: O(n) - The function makes a single recursive call for each value from n down to 1.
Space Complexity: O(n) - The function uses the call stack to store the state of each recursive call.

Example 1:
Input: 5
Output:
1
2
3
4
5

Example 2:
Input: 3
Output:
1
2
3
*/
