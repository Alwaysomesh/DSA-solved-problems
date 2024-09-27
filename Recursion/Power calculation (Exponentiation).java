// Power calculation (Exponentiation)

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();

        // Prompt the user to enter the exponent
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // Calculate the power using the recursive method
        int result = pow(base, exponent);

        // Display the result
        System.out.println(base + "^" + exponent + " = " + result);
    }

    // Recursive method to calculate the power of a number
    public static int pow(int base, int exponent) {
        // Base case: any number to the power of 0 is 1
        if (exponent == 0) {
            return 1;
        } else {
            // Recursive case: multiply the base by the result of base^(exponent-1)
            return base * pow(base, exponent - 1);
        }
    }
}

/*
Approach:
1. Take input from the user for the base and exponent.
2. Use a recursive method to calculate the power.
3. The base case for the recursion is when the exponent is 0, which returns 1.
4. For other cases, multiply the base by the result of the recursive call with the exponent decremented by 1.
5. Print the result.

Time Complexity: O(exponent)
- The function makes a recursive call for each decrement of the exponent until it reaches 0.

Space Complexity: O(exponent)
- The space complexity is due to the recursion stack, which will have a depth equal to the exponent.

Example Inputs and Outputs:
Input: base = 3, exponent = 4
Output: 3^4 = 81

Input: base = 2, exponent = 3
Output: 2^3 = 8
*/

