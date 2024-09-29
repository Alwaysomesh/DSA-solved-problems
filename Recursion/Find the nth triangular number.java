// Find the nth triangular number

import java.util.Scanner;

public class Que32 {
    // Method to calculate the nth triangular number using recursion
    private int triangularNumber(int n) {
        // Base case: the 1st triangular number is 1
        if (n == 1) {
            return 1;
        }
        // Recursive case: nth triangular number is n plus the (n-1)th triangular number
        return n + triangularNumber(n - 1);
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        // Create an instance of the Que32 class
        Que32 tn = new Que32();
        
        // Calculate and print the nth triangular number
        System.out.println("The " + n + "th triangular number is " + tn.triangularNumber(n));
        
        // Close the scanner
        scanner.close();
    }
}

/*
Approach:
1. The method `triangularNumber` is defined to calculate the nth triangular number using recursion.
2. The base case is when n is 1, returning 1.
3. For other values of n, the method calls itself with (n-1) and adds n to the result.
4. In the `main` method, user input is taken using a Scanner object.
5. The input value is passed to the `triangularNumber` method, and the result is printed.

Time Complexity: O(n) - The function makes n recursive calls.
Space Complexity: O(n) - The function uses the call stack for n recursive calls.

Example Inputs and Outputs:
Input: 5
Output: The 5th triangular number is 15

Input: 7
Output: The 7th triangular number is 28
*/

