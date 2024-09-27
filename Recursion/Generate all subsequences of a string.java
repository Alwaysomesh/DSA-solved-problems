// Generate all subsequences of a string

import java.util.Scanner;

public class Que12 {
    // Function to print all subsequences of the given string
    static void printSubsequences(String str, String ans) {
        // Base case: if the input string is empty, print the accumulated answer
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        // Recursive case 1: include the first character of the string in the subsequence
        printSubsequences(str.substring(1), ans + str.charAt(0));
        // Recursive case 2: exclude the first character of the string from the subsequence
        printSubsequences(str.substring(1), ans);
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        // Call the function to print all subsequences of the input string
        printSubsequences(s, "");
    }
}

/*
Approach:
1. The function `printSubsequences` is a recursive function that generates all possible subsequences of a given string.
2. It takes two parameters: the remaining string `str` and the accumulated subsequence `ans`.
3. If the remaining string is empty, it prints the accumulated subsequence.
4. Otherwise, it makes two recursive calls:
   a. One including the first character of the remaining string in the subsequence.
   b. One excluding the first character of the remaining string from the subsequence.

Time Complexity:
- The time complexity of this approach is O(2^n), where n is the length of the input string. This is because each character has two choices (include or exclude), leading to 2^n possible subsequences.

Space Complexity:
- The space complexity is O(n), where n is the length of the input string. This is due to the recursion stack, which can go as deep as the length of the string.

Sample Input and Output:
Input: "ABC"
Output: "ABC AB AC A BC B C "

Input: "AB"
Output: "AB A B "
*/

