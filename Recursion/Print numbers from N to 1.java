// Print numbers from N to 1

import java.util.Scanner;

public class Que24 {
    // Recursive method to print numbers from n to 1
    private void printNumbers(int n) {
        // Base case: if n is less than or equal to 0, stop the recursion
        if (n <= 0) {
            return;
        }
        // Print the current number
        System.out.println(n);
        // Recursive call with n-1
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        // Create an instance of the class
        Que24 pn = new Que24();
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int N = scanner.nextInt();
        // Call the recursive method to print numbers from N to 1
        pn.printNumbers(N);
        // Close the scanner
        scanner.close();
    }
}

/*
Approach:
1. Create a recursive method `printNumbers` that takes an integer `n` as input.
2. In the method, check if `n` is less than or equal to 0. If true, return from the method (base case).
3. Print the current value of `n`.
4. Make a recursive call to `printNumbers` with `n-1`.
5. In the `main` method, take user input for the integer `N` and call the `printNumbers` method with `N`.

Time Complexity: O(n)
- The function makes a single recursive call for each decrement of `n` until `n` reaches 0.

Space Complexity: O(n)
- The space complexity is due to the call stack used by the recursion, which will have `n` frames in the worst case.

Example Input/Output:
1. Input: 5
   Output:
   5
   4
   3
   2
   1

2. Input: 3
   Output:
   3
   2
   1
*/
