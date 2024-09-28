// Reverse a number

import java.util.Scanner;

public class Que36 {
    // Recursive method to reverse a number
    private int reverse(int n, int rev) {
        // Base case: if the number is 0, return the reversed number
        if (n == 0) {
            return rev;
        }
        // Recursive case: extract the last digit and add it to the reversed number
        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        // Create an instance of the class
        Que36 rn = new Que36();
        
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();
        
        // Call the reverse method and print the reversed number
        System.out.println("Reversed number is " + rn.reverse(number, 0));
        
        // Close the scanner
        scanner.close();
    }
}

/*
Approach:
1. The `reverse` method is a recursive function that takes two parameters: the number to be reversed (`n`) and the current reversed number (`rev`).
2. The base case checks if `n` is 0. If it is, the function returns `rev`, which is the reversed number.
3. In the recursive case, the function extracts the last digit of `n` (using `n % 10`) and adds it to `rev` after multiplying `rev` by 10.
4. The function then calls itself with the remaining digits of `n` (using `n / 10`) and the updated `rev`.

Time Complexity: O(d), where d is the number of digits in the input number.
Space Complexity: O(d), due to the recursion stack.

Sample Input and Output:
1. Input: 12345
   Output: Reversed number is 54321

2. Input: 987654
   Output: Reversed number is 456789
*/
