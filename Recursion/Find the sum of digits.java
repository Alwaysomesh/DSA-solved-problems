// Find the sum of digits

import java.util.Scanner;

public class Que35 {
    // Recursive method to calculate the sum of digits of a number
    private int sumOfDigits(int n) {
        if (n == 0) {
            return 0; // Base case: if the number is 0, return 0
        }
        return n % 10 + sumOfDigits(n / 10); // Recursive case: add the last digit to the sum of the remaining digits
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt(); // Read the user input

        Que35 sod = new Que35(); // Create an instance of the Que35 class
        System.out.println("Sum of digits in " + number + " is " + sod.sumOfDigits(number)); // Output the result
    }
}

/*
Approach:
1. The `sumOfDigits` method uses recursion to calculate the sum of the digits of a given number.
2. If the number is 0, it returns 0 (base case).
3. Otherwise, it adds the last digit of the number (n % 10) to the sum of the digits of the remaining number (n / 10).

Time Complexity: O(d), where d is the number of digits in the input number.
Space Complexity: O(d), due to the recursion stack.

Example 1:
Input: 12345
Output: Sum of digits in 12345 is 15

Example 2:
Input: 9876
Output: Sum of digits in 9876 is 30
*/

