// Sum of an array

import java.util.Scanner;

public class Que8 {
    // Recursive function to calculate the sum of array elements
    public static int sum(int[] arr, int n) {
        // Base case: if n is 0, return 0
        if (n <= 0) {
            return 0;
        }
        // Recursive case: sum of the first n-1 elements + nth element
        return sum(arr, n - 1) + arr[n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the size of the array as input from the user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Initializing the array with the given size
        int[] arr = new int[size];

        // Taking array elements as input from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculating the sum of array elements
        int sum = sum(arr, arr.length);

        // Printing the sum of array elements
        System.out.println("Sum of array elements: " + sum);
    }
}

/*
Approach:
1. The function `sum` is a recursive function that calculates the sum of the elements of the array.
2. The base case is when `n` is 0, in which case the function returns 0.
3. The recursive case adds the nth element of the array to the sum of the first n-1 elements.
4. The `main` function takes input from the user for the size and elements of the array, then calls the `sum` function and prints the result.

Time Complexity: O(n)
- The function makes a single recursive call for each element of the array, resulting in a linear time complexity.

Space Complexity: O(n)
- The space complexity is also linear due to the recursion stack, which will have at most `n` frames.

Example Input and Output:
Input:
Enter the number of elements in the array: 5
Enter the elements of the array:
2 5 6 8 9

Output:
Sum of array elements: 30

Input:
Enter the number of elements in the array: 4
Enter the elements of the array:
1 2 3 4

Output:
Sum of array elements: 10
*/

