// Generate Parentheses

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Que21 {
    // Utility function to generate all combinations of well-formed parentheses
    private void generateParenthesisUtil(int open, int close, String current, List<String> result) {
        // Base case: if no more parentheses to add, add the current combination to the result
        if (open == 0 && close == 0) {
            result.add(current);
            return;
        }
        // If there are open parentheses left to add, add an open parenthesis and recurse
        if (open > 0) {
            generateParenthesisUtil(open - 1, close, current + "(", result);
        }
        // If there are more closing parentheses left than open, add a closing parenthesis and recurse
        if (close > open) {
            generateParenthesisUtil(open, close - 1, current + ")", result);
        }
    }

    // Function to generate all combinations of well-formed parentheses
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisUtil(n, n, "", result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the number of pairs of parentheses (n): ");
        int n = scanner.nextInt();
        
        Que21 gp = new Que21();
        List<String> result = gp.generateParenthesis(n);
        
        // Printing the result
        System.out.println("All combinations of well-formed parentheses are:");
        for (String s : result) {
            System.out.println(s);
        }
        
        scanner.close();
    }
}

/*
Approach:
1. The problem is solved using a recursive backtracking approach.
2. The base case is when there are no more parentheses to add (open == 0 && close == 0), we add the current combination to the result list.
3. If there are open parentheses left to add, we add an open parenthesis and recurse.
4. If there are more closing parentheses left than open, we add a closing parenthesis and recurse.
5. This ensures that we only generate valid combinations of well-formed parentheses.

Time Complexity: O(4^n / sqrt(n))
- The time complexity is based on the nth Catalan number, which is asymptotically bounded by O(4^n / sqrt(n)).

Space Complexity: O(4^n / sqrt(n))
- The space complexity is due to the recursion stack and the storage of the result list.

Examples:
1. Input: n = 3
   Output: ["((()))", "(()())", "(())()", "()(())", "()()()"]

2. Input: n = 2
   Output: ["(())", "()()"]
*/
