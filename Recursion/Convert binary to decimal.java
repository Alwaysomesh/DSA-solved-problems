// Convert binary to decimal

import java.util.Scanner;

public class Que41 {
    // Method to convert binary number to decimal
    private int binaryToDecimal(int n) {
        // Base case: if the number is 0, return 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: calculate the decimal value
        return (n % 10) + 2 * binaryToDecimal(n / 10);
    }

    public static void main(String[] args) {
        // Create an instance of the class
        Que41 bd = new Que41();
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a binary number
        System.out.print("Enter a binary number: ");
        int binaryNumber = scanner.nextInt();
        // Convert the binary number to decimal and print the result
        System.out.println("Decimal representation of " + binaryNumber + " is " + bd.binaryToDecimal(binaryNumber));
        // Close the scanner
        scanner.close();
    }
}

/*
Approach:
1. The method `binaryToDecimal` is a recursive function that converts a binary number to its decimal equivalent.
2. The base case checks if the number is 0 and returns 0.
3. The recursive case calculates the decimal value by taking the last digit of the binary number (n % 10) and adding it to 2 times the result of the function called on the remaining digits (n / 10).

Time Complexity: O(log n)
- The time complexity is O(log n) because the number of recursive calls is proportional to the number of digits in the binary number, which is log base 2 of the number.

Space Complexity: O(log n)
- The space complexity is O(log n) due to the recursion stack, which will have log base 2 of the number calls.

Example Inputs and Outputs:
1. Input: 1010
   Output: Decimal representation of 1010 is 10

2. Input: 1111
   Output: Decimal representation of 1111 is 15
*/
