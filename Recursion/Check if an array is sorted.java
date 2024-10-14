// Check if an array is sorted


import java.util.Scanner;

public class Que31 {
    // Recursive method to check if the array is sorted
    private boolean isSorted(int[] arr, int n) {
        // Base case: if the array has only one element, it is sorted
        if (n == 1) {
            return true;
        }
        // Check if the last two elements are in order and recursively check the rest
        return arr[n - 1] >= arr[n - 2] && isSorted(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Que31 cs = new Que31();

        // Taking input from the user
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Check if the array is sorted and print the result
        if (cs.isSorted(arr, n)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }

        scanner.close();
    }
}

/*
Approach:
1. The `isSorted` method checks if the array is sorted in non-decreasing order.
2. It uses recursion to compare the last two elements and then checks the rest of the array.
3. The base case is when the array has only one element, which is inherently sorted.

Time Complexity: O(n)
- The function makes a single recursive call for each element, leading to a linear time complexity.

Space Complexity: O(n)
- The space complexity is linear due to the recursion stack, which can go as deep as the number of elements in the array.

Example Input and Output:
1. Input: 5
           1 2 3 4 5
   Output: The array is sorted.

2. Input: 4
           1 3 2 4
   Output: The array is not sorted.
*/
