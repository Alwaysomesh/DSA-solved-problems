// Word Break Problem

import java.util.*;

public class Que18 {
    // Function to check if the input string can be segmented into words from the dictionary
    public static boolean wordBreakRecursive(String s, Set<String> wordDict) {
        // Base case: If the string is empty, return true (meaning we've segmented all parts successfully)
        if (s.isEmpty()) {
            return true;
        }

        // Try to segment the string into a prefix (substring from 0 to i) and a suffix (remaining part)
        for (int i = 1; i <= s.length(); i++) {
            // Extract the prefix
            String prefix = s.substring(0, i);

            // If the prefix is in the dictionary, recursively check the rest of the string (suffix)
            if (wordDict.contains(prefix)) {
                if (wordBreakRecursive(s.substring(i), wordDict)) {
                    return true;
                }
            }
        }

        // If no valid segmentation is found, return false
        return false;
    }

    // Main function to take user input and call the wordBreakRecursive function
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take input string
        System.out.println("Enter the string:");
        String inputString = scanner.nextLine();

        // Take the dictionary input
        System.out.println("Enter dictionary words separated by space:");
        String[] words = scanner.nextLine().split(" ");
        Set<String> wordDict = new HashSet<>(Arrays.asList(words));

        // Call the wordBreakRecursive function and print the result
        if (wordBreakRecursive(inputString, wordDict)) {
            System.out.println("The string can be segmented into the dictionary words.");
        } else {
            System.out.println("The string cannot be segmented into the dictionary words.");
        }

        // Close scanner
        scanner.close();
    }
}

/* 
Approach:
- The function wordBreakRecursive recursively checks if the input string s can be broken down into a sequence of valid words from wordDict. 
- At each step, it divides the string into a prefix and checks if the prefix exists in the dictionary.
- If the prefix exists, the function recursively checks the remainder of the string.
- This brute-force solution explores all possible prefix divisions of the string.

Time Complexity:
- In the worst case, for each character in the string, the function checks every prefix, leading to an exponential time complexity.
- Time Complexity: O(2^n), where n is the length of the input string.

Space Complexity:
- The space complexity is O(n), which is the maximum depth of the recursion stack.

Example 1:
Input:
Enter the string:
applepie
Enter dictionary words separated by space:
apple pie

Output:
The string can be segmented into the dictionary words.

Example 2:
Input:
Enter the string:
pineapplepenapple
Enter dictionary words separated by space:
apple pen pineapple

Output:
The string can be segmented into the dictionary words.
*/
