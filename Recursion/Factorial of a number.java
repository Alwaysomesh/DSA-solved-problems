// Factorial of a number

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Calculate the factorial of the entered number
        long factorial = fact(num);
        
        // Display the result
        System.out.println("Factorial of " + num + " = " + factorial);
        
        // Close the scanner
        scanner.close();
    }

    // Recursive method to calculate factorial
    public static long fact(int num) {
        // Base case: if num is 0 or 1, return 1
        if (num <= 1) {
            return 1;
        } else {
            // Recursive case: num * factorial of (num - 1)
            return num * fact(num - 1);
        }
    }
}

/*
Approach:
1. Read an integer input from the user.
2. Use a recursive method to calculate the factorial of the input number.
3. The base case for the recursion is when the number is 0 or 1, returning 1.
4. For other cases, multiply the number by the factorial of (number - 1).
5. Print the result.

Time Complexity: O(n) - The function calls itself n times.
Space Complexity: O(n) - The recursion stack will hold n frames in the worst case.

Example Inputs and Outputs:
Input: 5
Output: Factorial of 5 = 120

Input: 7
Output: Factorial of 7 = 5040
*/

