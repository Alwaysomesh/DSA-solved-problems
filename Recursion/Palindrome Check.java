// Palindrome Check

import java.util.Scanner;

public class Que7 {
    // Recursive function to check if a string is a palindrome
    static boolean IP(String str, int start, int end) {
        // Base case: if start index is greater than or equal to end index, it's a palindrome
        if (start >= end) {
            return true;
        }
        // If characters at start and end indices are not the same, it's not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Recursive call to check the next pair of characters
        return IP(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scanner.nextLine();
        scanner.close();

        // Check if the input string is a palindrome
        if (IP(str, 0, str.length() - 1)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}

/*
Approach:
1. The function IP is a recursive function that checks if a string is a palindrome.
2. It compares characters from the start and end of the string moving towards the center.
3. If all corresponding characters match, the string is a palindrome.

Time Complexity: O(n)
- The function makes a single pass through the string, comparing pairs of characters.
- Each recursive call processes one pair of characters, leading to a linear time complexity.

Space Complexity: O(n)
- The space complexity is due to the recursion stack. In the worst case, the depth of the recursion is equal to the length of the string.

Example Input and Output:
1. Input: "lol"
   Output: "lol is a palindrome."

2. Input: "hello"
   Output: "hello is not a palindrome."
*/

