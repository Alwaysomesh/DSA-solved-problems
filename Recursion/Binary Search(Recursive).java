// Binary Search(Recursive)

import java.util.Scanner;

public class Que9 {
    // Function to perform binary search on a sorted array
    public static int binarySearch(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2; // Calculate the middle index

            // Check if the middle element is the target element
            if (arr[mid] == x)
                return mid;

            // If the target element is smaller than the middle element, search in the left subarray
            if (arr[mid] > x)
                return binarySearch(arr, left, mid - 1, x);

            // If the target element is larger than the middle element, search in the right subarray
            return binarySearch(arr, mid + 1, right, x);
        }

        // Return -1 if the element is not present in the array
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array input from the user
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Taking the target element input from the user
        System.out.println("Enter the element to search:");
        int x = scanner.nextInt();

        // Performing binary search
        int result = binarySearch(arr, 0, n - 1, x);

        // Printing the result
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);

        scanner.close();
    }
}

/*
Approach:
1. Calculate the middle index of the array.
2. Compare the middle element with the target element.
3. If the middle element is the target element return the middle index.
4. If the target element is smaller than the middle element repeat the process for the left subarray.
5. If the target element is larger than the middle element, repeat the process for the right subarray.
6. If the element is not found, return -1.

Time Complexity: O(log n) - The array is divided into half in each step.
Space Complexity: O(log n) - Due to the recursive call stack.

Sample Input and Output:
Input:
5
2 3 4 10 40
4
Output:
Element found at index 2

Input:
5
2 3 4 10 40
5
Output:
Element not present
*/

