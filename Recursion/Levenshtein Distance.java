// Levenshtein Distance

import java.util.Scanner;

public class EditDistance {

    // Function to find the minimum of three numbers
    private static int min(int x, int y, int z) {
        return Math.min(Math.min(x, y), z);
    }

    // Recursive function to find the edit distance between two strings
    public static int editDistance(String s1, String s2, int m, int n) {
        // If the first string is empty, the only option is to insert all characters of the second string
        if (m == 0) return n;

        // If the second string is empty, the only option is to remove all characters of the first string
        if (n == 0) return m;

        // If the last characters of the two strings are the same, ignore the last characters and get the count for the remaining strings
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return editDistance(s1, s2, m - 1, n - 1);
        }

        // If the last characters are different, consider all three operations on the last character of the first string,
        // recursively compute the minimum cost for all three operations and take the minimum of the three values
        return 1 + min(
            editDistance(s1, s2, m, n - 1),    // Insert
            editDistance(s1, s2, m - 1, n),    // Remove
            editDistance(s1, s2, m - 1, n - 1) // Replace
        );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the first string:");
        String s1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String s2 = scanner.nextLine();

        // Calculating and printing the edit distance
        System.out.println("Edit Distance: " + editDistance(s1, s2, s1.length(), s2.length()));

        scanner.close();
    }
}

/*
Approach:
1. If either string is empty, the edit distance is the length of the other string.
2. If the last characters of both strings are the same, ignore the last characters and recursively compute the edit distance for the remaining strings.
3. If the last characters are different, consider all three operations (insert, remove, replace) on the last character of the first string, recursively compute the minimum cost for all three operations, and take the minimum of the three values.

Time Complexity: O(3^m) where m is the length of the first string.
Space Complexity: O(m + n) due to the recursion stack.

Example Inputs and Outputs:
Input: s1 = "sunday", s2 = "saturday"
Output: Edit Distance: 3

Input: s1 = "kitten", s2 = "sitting"
Output: Edit Distance: 3
*/
