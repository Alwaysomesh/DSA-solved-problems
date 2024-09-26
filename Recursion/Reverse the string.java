// Reverse the string

import java.util.Scanner;

public class Que6 {
    // Function to reverse a string using recursion
    public static String rev(String str) {
        // Base case: if the string is null or has only one character, return it as is
        if (str == null || str.length() <= 1) {
            return str;
        }
        // Recursive case: reverse the substring from the second character onward and add the first character at the end
        return rev(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string to reverse: ");
        String str = scanner.nextLine();
        
        // Call the rev function to reverse the string
        String reversedStr = rev(str);
        
        // Print the original and reversed strings
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
        
        // Close the scanner
        scanner.close();
    }
}

/*
Approach:
1. The `rev` function uses recursion to reverse the input string.
2. If the input string is null or has only one character, it returns the string as is (base case).
3. Otherwise, it calls itself with the substring starting from the second character and appends the first character at the end (recursive case).

Time Complexity: O(n)
- The function makes n recursive calls, where n is the length of the string.

Space Complexity: O(n)
- The function uses O(n) space for the call stack due to the recursive calls.

Input and Output Examples:
1. Input: "Hello, World!"
   Output: "Original String: Hello, World!"
           "Reversed String: !dlroW ,olleH"

2. Input: "Automata"
   Output: "Original String: Automata"
           "Reversed String: atamotuA"
*/

