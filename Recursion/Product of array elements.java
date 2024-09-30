// Product of array elements

import java.util.Scanner;

public class Que30 {
    // Method to calculate the product of array elements using recursion
    private int product(int[] arr, int n) {
        if (n <= 0) {
            return 1; // Base case: if no elements left, return 1
        }
        return arr[n - 1] * product(arr, n - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        // Taking input for the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        Que30 qe = new Que30();
        // Calculating and printing the product of array elements
        System.out.println("Product of array elements is " + qe.product(arr, n));
        
        scanner.close();
    }
}

/*
Approach:
1. The `product` method calculates the product of array elements recursively.
2. If the array size `n` is less than or equal to 0, it returns 1 (base case).
3. Otherwise, it multiplies the last element of the array with the product of the remaining elements.

Time Complexity: O(n)
- The function makes a single recursive call for each element in the array, leading to a linear time complexity.

Space Complexity: O(n)
- The space complexity is linear due to the recursion stack, which can go as deep as the number of elements in the array.

Examples:
Input: 
5
1 2 3 4 5
Output: 
Product of array elements is 120

Input: 
3
6 7 8
Output: 
Product of array elements is 336
*/
