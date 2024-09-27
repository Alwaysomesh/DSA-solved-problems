// Permutations of a String

import java.util.Scanner;

public class Que11 {
    // Function to print all permutations of a given string
    static void printPermutations(String str, String ans) {
        // Base case: if the input string is empty, print the accumulated answer
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        // Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            // Extract the character at the current position
            char ch = str.charAt(i);
            // Form the remaining string after removing the current character
            String ros = str.substring(0, i) + str.substring(i + 1);
            // Recur with the remaining string and the accumulated answer
            printPermutations(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        // Read the input string
        String s = scanner.nextLine();
        // Call the function to print permutations
        printPermutations(s, "");
        // Close the scanner
        scanner.close();
    }
}

/*
Approach:
1. The function `printPermutations` is a recursive function that generates all permutations of a given string.
2. The base case is when the input string `str` is empty, at which point the accumulated answer `ans` is printed.
3. For each character in the string, the function extracts the character, forms the remaining string, and recurses with the remaining string and the accumulated answer.

Time Complexity:
- The time complexity is O(n * n!), where n is the length of the input string. This is because there are n! permutations and generating each permutation takes O(n) time.

Space Complexity:
- The space complexity is O(n) due to the recursion stack, where n is the length of the input string.

Example Inputs and Outputs:
Input: "ABC"
Output: "ABC ACB BAC BCA CAB CBA "

Input: "AB"
Output: "AB BA "
*/

