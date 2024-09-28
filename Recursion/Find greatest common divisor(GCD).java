// Find greatest common divisor(GCD)

import java.util.Scanner;

public class Que39 {
    // Method to calculate the Greatest Common Divisor (GCD) of two numbers using recursion
    private int gcd(int a, int b) {
        // Base case: if b is 0, return a
        if (b == 0) {
            return a;
        }
        // Recursive case: call gcd with b and the remainder of a divided by b
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Create an instance of the Que39 class
        Que39 gcdCalculator = new Que39();

        // Calculate and print the GCD of the two numbers
        System.out.println("GCD of " + a + " and " + b + " is " + gcdCalculator.gcd(a, b));

        // Close the scanner
        scanner.close();
    }
}

/*
Approach:
1. The gcd method uses the Euclidean algorithm to find the GCD of two numbers.
2. If the second number (b) is 0, the GCD is the first number (a).
3. Otherwise, the method recursively calls itself with the second number (b) and the remainder of the first number divided by the second number (a % b).

Time Complexity: O(log(min(a, b)))
- The time complexity is logarithmic relative to the smaller of the two input numbers due to the nature of the Euclidean algorithm.

Space Complexity: O(log(min(a, b)))
- The space complexity is also logarithmic because of the recursive call stack.

Sample Input and Output:
Input: 56, 98
Output: GCD of 56 and 98 is 14

Input: 48, 18
Output: GCD of 48 and 18 is 6
*/
