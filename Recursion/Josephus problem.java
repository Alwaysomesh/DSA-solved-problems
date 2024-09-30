// Josephus problem

import java.util.Scanner;

public class Que22 {
    // Recursive function to find the safe position
    private int josephus(int n, int k) {
        // Base case: only one person remains
        if (n == 1) {
            return 0;
        } else {
            // Recursive call: reduce the problem size by 1
            // and adjust the position with modulo operation
            return (josephus(n - 1, k) + k) % n;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the number of people (n): ");
        int n = scanner.nextInt();
        
        System.out.print("Enter the step count (k): ");
        int k = scanner.nextInt();
        
        Que22 jp = new Que22();
        
        // Calculating and printing the safe position
        System.out.println("The safe position is " + (jp.josephus(n, k) + 1));
        
        scanner.close();
    }
}

/*
Approach:
1. The problem is solved using a recursive function.
2. The base case is when there is only one person left (n == 1), the safe position is 0.
3. For the recursive case, we reduce the problem size by 1 (n - 1) and adjust the position using the modulo operation.
4. The final result is adjusted by adding 1 to convert from 0-based to 1-based indexing.

Time Complexity: O(n)
- Each recursive call reduces the problem size by 1, leading to n recursive calls.

Space Complexity: O(n)
- The space complexity is due to the recursion stack, which can go up to n levels deep.

Examples:
1. Input: n = 7, k = 3
   Output: The safe position is 4

2. Input: n = 5, k = 2
   Output: The safe position is 3
*/
