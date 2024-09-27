// Tower of hanoi 

import java.util.Scanner;

public class Que10 {

    // Recursive function to solve Tower of Hanoi puzzle
    static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        // Base case: if there's only one disk, move it directly from fromRod to toRod
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        // Move n-1 disks from fromRod to auxRod using toRod as auxiliary
        towerOfHanoi(n - 1, fromRod, auxRod, toRod);
        // Move the nth disk from fromRod to toRod
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        // Move the n-1 disks from auxRod to toRod using fromRod as auxiliary
        towerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number of disks
        System.out.print("Enter the number of disks: ");
        int n = scanner.nextInt();
        
        // Call the towerOfHanoi function with user input
        towerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
        
        // Close the scanner
        scanner.close();
    }
}

/*
Approach:
1. If there's only one disk move it directly from the source rod to the destination rod.
2. Recursively move the top n-1 disks from the source rod to the auxiliary rod.
3. Move the nth disk from the source rod to the destination rod.
4. Recursively move the n-1 disks from the auxiliary rod to the destination rod.

Time Complexity: O(2^n) - Each move involves two recursive calls, leading to an exponential time complexity.
Space Complexity: O(n) - The space complexity is linear due to the recursion stack.

Sample Input and Output:
Input: 3
Output:
Move disk 1 from rod A to rod C
Move disk 2 from rod A to rod B
Move disk 1 from rod C to rod B
Move disk 3 from rod A to rod C
Move disk 1 from rod B to rod A
Move disk 2 from rod B to rod C
Move disk 1 from rod A to rod C

Input: 2
Output:
Move disk 1 from rod A to rod B
Move disk 2 from rod A to rod C
Move disk 1 from rod B to rod C
*/
