// Find the nth harmonic number

import java.util.Scanner;

public class Que38 {
    // Method to calculate the nth harmonic number using recursion
    private double harmonic(int n) {
        if (n == 1) {
            return 1.0;
        }
        return 1.0 / n + harmonic(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        scanner.close();

        // Create an instance of Que38 to call the harmonic method
        Que38 hn = new Que38();
        // Print the nth harmonic number
        System.out.println("The " + n + "th harmonic number is " + hn.harmonic(n));
    }
}

/*
Approach:
1. The program prompts the user to enter a positive integer.
2. It reads the input value and passes it to the harmonic method.
3. The harmonic method calculates the nth harmonic number using recursion.
4. The result is printed to the console.

Time Complexity:
- The time complexity of the harmonic method is O(n) because it makes n recursive calls.

Space Complexity:
- The space complexity is O(n) due to the recursion stack.

Example Input and Output:
Input: 5
Output: The 5th harmonic number is 2.283333333333333

Input: 10
Output: The 10th harmonic number is 2.928968253968254
*/
