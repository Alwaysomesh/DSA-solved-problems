// Sum of first N natural numbers

import java.util.Scanner;

public class Que25 {
    // Method to calculate the sum of first n natural numbers using recursion
    private int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        // Create an instance of the class
        Que25 sn = new Que25();
        
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int N = scanner.nextInt();
        
        // Calculate and display the sum of the first N natural numbers
        System.out.println("Sum of first " + N + " natural numbers is " + sn.sum(N));
        
        // Close the scanner
        scanner.close();
    }
}

/*
Approach:
1. Define a recursive method `sum` that takes an integer `n` as input.
2. If `n` is less than or equal to 0, return 0 (base case).
3. Otherwise, return `n` plus the result of `sum(n - 1)` (recursive case).
4. In the `main` method, create an instance of the class and use a Scanner to take input from the user.
5. Call the `sum` method with the user input and display the result.

Time Complexity: O(n) - The function makes a recursive call for each number from n down to 1.
Space Complexity: O(n) - The function uses the call stack to store the state of each recursive call.

Examples:
Input: 5
Output: Sum of first 5 natural numbers is 15

Input: 10
Output: Sum of first 10 natural numbers is 55
*/
