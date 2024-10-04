//Power Sum

import java.util.Scanner;

public class Que42 {
    // Function to calculate the number of ways to express X as the sum of the Nth powers of unique natural numbers
    static int powerSum(int X, int N, int current) {
        int power = (int) Math.pow(current, N);
        
        // If the current power exceeds X, no valid sum can be formed
        if (power > X) {
            return 0;
        // If the current power equals X, we found a valid sum
        } else if (power == X) {
            return 1;
        // Recursively check two possibilities: including or excluding the current number
        } else {
            return powerSum(X - power, N, current + 1) + powerSum(X, N, current + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the value of X: ");
        int X = scanner.nextInt();
        
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        
        // Initial call to the recursive function with current starting from 1
        int result = powerSum(X, N, 1);
        
        // Output the result
        System.out.println("Number of ways to express " + X + " as the sum of the " + N + "th powers of unique natural numbers: " + result);
        
        scanner.close();
    }
}

/*
Approach:
1. The function `powerSum` is a recursive function that tries to find the number of ways to express X as the sum of the Nth powers of unique natural numbers.
2. It starts with the current number and calculates its Nth power.
3. If the Nth power of the current number exceeds X, it returns 0 as no valid sum can be formed.
4. If the Nth power of the current number equals X, it returns 1 as a valid sum is found.
5. Otherwise, it recursively checks two possibilities: including the current number in the sum or excluding it.
6. The base case ensures that the recursion stops when the power exceeds X or a valid sum is found.

Time Complexity: O(2^sqrt(X))
Space Complexity: O(sqrt(X)) due to the recursion stack.

Example Inputs and Outputs:
Input: X = 10, N = 2
Output: 1 (10 can be expressed as 1^2 + 3^2)

Input: X = 100, N = 2
Output: 3 (100 can be expressed as 10^2, 6^2 + 8^2, or 1^2 + 3^2 + 4^2 + 5^2 + 7^2)
*/
