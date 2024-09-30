// Find minimum elements in an array

import java.util.Scanner;

public class Que28 {
    // Recursive method to find the minimum element in the array
    private int findMin(int[] arr, int n) {
        // Base case: if there's only one element, return it
        if (n == 1) {
            return arr[0];
        }
        // Recursive case: return the minimum of the last element and the minimum of the rest
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize the array with the given size
        int[] arr = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Create an instance of the Que28 class
        Que28 me = new Que28();

        // Find and print the minimum element in the array
        System.out.println("The minimum element is " + me.findMin(arr, n));
    }
}

/*
Approach:
1. The `findMin` method uses recursion to find the minimum element in the array.
2. The base case is when the array has only one element, in which case that element is returned.
3. The recursive case compares the last element of the array with the minimum of the rest of the array and returns the smaller of the two.

Time Complexity: O(n)
- The function makes a single recursive call for each element in the array, resulting in a linear time complexity.

Space Complexity: O(n)
- The space complexity is linear due to the recursion stack, which can go as deep as the number of elements in the array.

Example Input and Output:
1. 
Input:
Enter the number of elements in the array: 5
Enter the elements of the array:
3 1 4 1 5
Output:
The minimum element is 1

2. 
Input:
Enter the number of elements in the array: 4
Enter the elements of the array:
10 20 5 15
Output:
The minimum element is 5
*/
