// Convert decimal to binary

import java.util.Scanner;

public class Que40 {
    // Method to convert a decimal number to its binary representation
    private String convertToBinary(int n) {
        if (n == 0) {
            return "";
        }
        return convertToBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        // Create an instance of the Que40 class
        Que40 db = new Que40();
        
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Convert the number to binary
        String binary = db.convertToBinary(number);
        
        // Print the binary representation
        System.out.println("Binary representation of " + number + " is " + binary);
        
        // Close the scanner
        scanner.close();
    }
}

/*
Approach:
1. Create a method `convertToBinary` that takes an integer `n` as input.
2. If `n` is 0, return an empty string.
3. Recursively call `convertToBinary` with `n / 2` and append the remainder of `n % 2` to the result.
4. In the `main` method, create an instance of the `Que40` class.
5. Use a `Scanner` object to take input from the user.
6. Call the `convertToBinary` method with the user input and print the result.

Time Complexity: O(log n)
- The time complexity is O(log n) because the number of recursive calls is proportional to the number of bits in the binary representation of `n`.

Space Complexity: O(log n)
- The space complexity is O(log n) due to the recursion stack, which will have a depth proportional to the number of bits in the binary representation of `n`.

Example Input and Output:
1. Input: 25
   Output: Binary representation of 25 is 11001

2. Input: 10
   Output: Binary representation of 10 is 1010
*/

