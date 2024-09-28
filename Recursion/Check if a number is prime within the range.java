// Check if a number is prime within the range

import java.util.Scanner;

public class Que42 {
    // Method to check if a number is prime using recursion
    private boolean isPrime(int n, int i) {
        // Base case: if n is less than or equal to 2
        if (n <= 2) {
            return n == 2; // 2 is prime, 1 and 0 are not
        }
        // If n is divisible by i, then n is not prime
        if (n % i == 0) {
            return false;
        }
        // If i squared is greater than n, then n is prime
        if (i * i > n) {
            return true;
        }
        // Recursive call to check for next divisor
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        // Create an instance of the class
        Que42 pir = new Que42();
        // Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt(); // Read user input
        // Check if the number is prime and print the result
        if (pir.isPrime(number, 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        scanner.close(); // Close the scanner
    }
}

/*
Approach:
1. The `isPrime` method uses recursion to check if a number `n` is prime.
2. It starts checking from the smallest prime number 2.
3. If `n` is less than or equal to 2, it checks if `n` is 2 (prime) or not.
4. If `n` is divisible by `i`, it returns false.
5. If `i * i` is greater than `n`, it returns true.
6. Otherwise, it recursively checks the next divisor.

Time Complexity: O(√n) - The function checks divisors up to the square root of `n`.
Space Complexity: O(√n) - Due to the recursion stack.

Example Inputs and Outputs:
Input: 29
Output: 29 is a prime number.

Input: 30
Output: 30 is not a prime number.
*/
