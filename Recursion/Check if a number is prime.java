// Check if a number is prime

import java.util.Scanner;

public class Que37 {
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
        // Recursive call to check next divisor
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        Que37 pc = new Que37();
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();

        // Checking if the number is prime and printing the result
        if (pc.isPrime(number, 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}

/*
Approach:
1. The `isPrime` method uses recursion to check if a number `n` is prime.
2. It starts with the smallest divisor (i = 2) and checks divisibility.
3. If `n` is less than or equal to 2, it returns true if `n` is 2, otherwise false.
4. If `n` is divisible by `i`, it returns false.
5. If `i * i` is greater than `n`, it returns true.
6. Otherwise, it recursively checks the next divisor `i + 1`.

Time Complexity: O(√n)
- The function checks divisors up to the square root of `n`.

Space Complexity: O(√n)
- The recursion stack can go up to the square root of `n` in the worst case.

Example Inputs and Outputs:
1. Input: 29
   Output: 29 is a prime number.

2. Input: 30
   Output: 30 is not a prime number.
*/

