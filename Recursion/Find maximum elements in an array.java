// Find maximum elements in an array

import java.util.Scanner;

public class Que27 {
    // Recursive method to find the maximum element in the array
    private int findMax(int[] arr, int n) {
        // Base case: if there's only one element, return it
        if (n == 1) {
            return arr[0];
        }
        // Recursive case: return the maximum of the last element and the maximum of the rest of the array
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        Que27 me = new Que27();
        // Finding and printing the maximum element in the array
        System.out.println("The maximum element is " + me.findMax(arr, n));
        
        scanner.close();
    }
}

/*
Approach:
1. The `findMax` method uses recursion to find the maximum element in the array.
2. The base case is when the array has only one element, which is the maximum by default.
3. For the recursive case, the method compares the last element of the array with the maximum of the rest of the array and returns the larger value.

Time Complexity: O(n)
- The function makes a single recursive call for each element in the array, leading to a linear time complexity.

Space Complexity: O(n)
- The space complexity is linear due to the recursion stack, which can go as deep as the number of elements in the array.

Example 1:
Input:
7
1 4 3 -5 -4 8 6
Output:
The maximum element is 8

Example 2:
Input:
5
-1 -2 -3 -4 -5
Output:
The maximum element is -1
*/
