// Fibonacci sequence

import java.util.Scanner;

public class Que2 {
    // Recursive method to calculate Fibonacci number
    public static int fib(int n) {
        // Base case: if n is 0, return 0
        if (n == 0) {
            return 0;
        // Base case: if n is 1, return 1
        } else if (n == 1) {
            return 1;
        // Recursive case: return the sum of the two preceding numbers
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        // Print the Fibonacci sequence up to n terms
        System.out.print("Fibonacci sequence up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}

/*
Approach:
1. The `fib` method is a recursive function that calculates the nth Fibonacci number.
2. The base cases are when n is 0 or 1, returning 0 and 1 respectively.
3. For other values of n, the function calls itself with (n-1) and (n-2) and returns their sum.
4. The main method takes user input for the number of terms and prints the Fibonacci sequence up to that number.

Time Complexity:
- The time complexity of this recursive approach is O(2^n) because each call to `fib` results in two more calls, leading to an exponential growth in the number of calls.

Space Complexity:
- The space complexity is O(n) due to the recursion stack, which can go as deep as n levels.

Input/Output Examples:
Example 1:
Input: 5
Output: Fibonacci sequence up to 5 terms: 0 1 1 2 3 

Example 2:
Input: 6
Output: Fibonacci sequence up to 7 terms: 0 1 1 2 3 5
*/
