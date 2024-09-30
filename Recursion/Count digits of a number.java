// Count digits of a number

import java.util.Scanner;

public class Que26 {
    // Recursive method to count the number of digits in a given number
    private int countDigits(int n) {
        // Base case: if the number is 0, it has no digits
        if (n == 0) {
            return 0;
        }
        // Recursive case: count the current digit and proceed with the rest of the number
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        // Create an instance of the Que26 class
        Que26 cd = new Que26();
        
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Call the countDigits method and display the result
        System.out.println("Number of digits in " + number + " is " + cd.countDigits(number));
        
        // Close the scanner
        scanner.close();
    }
}

/*
Approach:
1. Define a recursive method `countDigits` that takes an integer `n` as input.
2. Base case: If `n` is 0, return 0.
3. Recursive case: Return 1 plus the result of `countDigits` called with `n` divided by 10.
4. In the main method, create an instance of the `Que26` class.
5. Use a `Scanner` to take input from the user.
6. Call the `countDigits` method with the user's input and print the result.

Time Complexity: O(log10(n))
- The number of recursive calls is proportional to the number of digits in the number, which is log10(n).

Space Complexity: O(log10(n))
- The space complexity is also proportional to the number of digits due to the call stack used in recursion.

Example Input and Output:
1. Input: 12345
   Output: Number of digits in 12345 is 5

2. Input: 987654321
   Output: Number of digits in 987654321 is 9
*/
