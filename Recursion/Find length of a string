// Find length of a string

import java.util.Scanner;

public class Que34 {
    // Recursive method to calculate the length of a string
    private int length(String str) {
        // Base case: if the string is empty, return 0
        if (str.equals("")) {
            return 0;
        }
        // Recursive case: return 1 + length of the substring starting from the second character
        return 1 + length(str.substring(1));
    }

    public static void main(String[] args) {
        // Create an instance of the Que34 class
        Que34 sl = new Que34();
        
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        
        // Calculate and print the length of the string
        System.out.println("Length of the string is " + sl.length(str));
        
        // Close the scanner
        scanner.close();
    }
}

/*
Approach:
1. Define a recursive method `length` that takes a string as input.
2. If the string is empty, return 0 (base case).
3. Otherwise, return 1 plus the length of the substring starting from the second character (recursive case).
4. In the main method, take input from the user and call the `length` method to calculate the length of the input string.

Time Complexity: O(n)
- The function makes a single recursive call for each character in the string, resulting in a linear time complexity.

Space Complexity: O(n)
- The space complexity is linear due to the recursion stack, which will have a depth equal to the length of the string.

Sample Input and Output:
1. Input: "Hello, World!"
   Output: Length of the string is 13

2. Input: "Recursion"
   Output: Length of the string is 9
*/

