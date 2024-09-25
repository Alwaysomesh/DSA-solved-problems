// GCD(Greatest Common Divisor)

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();

        // Calculate the GCD of the two numbers
        int gcd = GCD(n1, n2);

        // Display the result
        System.out.printf("GCD of %d and %d is %d.%n", n1, n2, gcd);
    }

    // Recursive method to find the GCD of two numbers
    public static int GCD(int n1, int n2) {
        // Base case: if the second number is 0, return the first number
        if (n2 == 0) {
            return n1;
        } else {
            // Recursive case: call the GCD method with n2 and the remainder of n1 divided by n2
            return GCD(n2, n1 % n2);
        }
    }
}

/*
Approach:
1. Take two integers as input from the user.
2. Use a recursive method to calculate the GCD of the two numbers.
3. The base case of the recursion is when the second number becomes 0, at which point the first number is the GCD.
4. The recursive case involves calling the GCD method with the second number and the remainder of the first number divided by the second number.

Time Complexity:
- The time complexity of the GCD algorithm (Euclidean algorithm) is O(log(min(n1, n2))), where n1 and n2 are the input numbers.

Space Complexity:
- The space complexity is O(log(min(n1, n2))) due to the recursion stack.

Sample Input and Output:
Input: 
Enter the first number: 366
Enter the second number: 60
Output: 
GCD of 366 and 60 is 6.

Input: 
Enter the first number: 48
Enter the second number: 18
Output: 
GCD of 48 and 18 is 6.
*/
