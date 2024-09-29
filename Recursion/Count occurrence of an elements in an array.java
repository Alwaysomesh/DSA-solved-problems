// Count occurrence of an elements in an array

import java.util.Scanner;

public class Que33 {
    // Recursive method to count occurrences of x in the array
    private int countOccurrences(int[] arr, int n, int x) {
        if (n == 0) {
            return 0; // Base case: if array size is 0, return 0
        }
        // Check if the last element is x and add 1 if true, then recurse for the rest
        return (arr[n - 1] == x ? 1 : 0) + countOccurrences(arr, n - 1, x);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Que33 co = new Que33();

        // Taking array input from the user
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Taking the element to count occurrences of
        System.out.println("Enter the element to count occurrences of:");
        int x = scanner.nextInt();

        // Displaying the result
        System.out.println("The number of occurrences of " + x + " is " + co.countOccurrences(arr, n, x));
    }
}

/*
Approach:
1. Define a recursive method `countOccurrences` that takes the array, its size, and the element to count.
2. Base case: If the size of the array is 0, return 0.
3. Check if the last element of the array is equal to the element to count. If true, add 1 to the result.
4. Recur for the rest of the array (excluding the last element).
5. In the main method, take input from the user for the array and the element to count.
6. Call the recursive method and display the result.

Time Complexity: O(n) - The function makes a single pass through the array.
Space Complexity: O(n) - Due to the recursion stack.

Sample Input and Output:
Input:
Enter the number of elements in the array:
8
Enter the elements of the array:
1 2 3 2 2 4 5 2
Enter the element to count occurrences of:
2

Output:
The number of occurrences of 2 is 4

Input:
Enter the number of elements in the array:
5
Enter the elements of the array:
1 1 1 1 1
Enter the element to count occurrences of:
1

Output:
The number of occurrences of 1 is 5
*/
