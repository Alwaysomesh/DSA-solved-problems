// Longest Common Subsequence

import java.util.Scanner;

public class Que20 {
    // Function to find the length of the longest common subsequence (LCS) of two strings
    private int lcs(String X, String Y, int m, int n) {
        // Base case: If either string is empty, LCS length is 0
        if (m == 0 || n == 0) {
            return 0;
        }
        // If the last characters of both strings match, add 1 to the result and recur for the remaining substrings
        if (X.charAt(m - 1) == Y.charAt(n - 1)) {
            return 1 + lcs(X, Y, m - 1, n - 1);
        } else {
            // If the last characters do not match, find the maximum LCS by either excluding the last character of X or Y
            return Math.max(lcs(X, Y, m, n - 1), lcs(X, Y, m - 1, n));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input strings from the user
        System.out.println("Enter the first string:");
        String s1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String s2 = scanner.nextLine();
        
        int m = s1.length();
        int n = s2.length();
        
        Que20 lcs = new Que20();
        // Printing the length of the longest common subsequence
        System.out.println("Length of LCS is " + lcs.lcs(s1, s2, m, n));
        
        scanner.close();
    }
}

/*
Approach:
1. Define a recursive function `lcs` that takes two strings and their lengths as input.
2. Base case: If either string is empty, return 0.
3. If the last characters of both strings match, add 1 to the result and recur for the remaining substrings.
4. If the last characters do not match, find the maximum LCS by either excluding the last character of the first string or the second string.
5. In the main method, take input strings from the user and call the `lcs` function to find the LCS length.

Time Complexity: O(2^n) - The function explores all possible subsequences.
Space Complexity: O(m + n) - The maximum depth of the recursion tree.

Example 1:
Input:
s1 = "AGGTAB"
s2 = "GXTXAYB"
Output:
Length of LCS is 4

Example 2:
Input:
s1 = "ABCBDAB"
s2 = "BDCAB"
Output:
Length of LCS is 4
*/
