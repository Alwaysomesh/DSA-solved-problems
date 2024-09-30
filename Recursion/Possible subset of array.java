// Possible subset of array

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsets {

    // Function to generate all subsets of the given array
    public static void generateSubsets(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
        // Base case: if index reaches the length of the array, add the current subset to the result
        if (index == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include the current element in the subset
        current.add(arr[index]);
        generateSubsets(arr, index + 1, current, result);

        // Exclude the current element from the subset (backtrack)
        current.remove(current.size() - 1);
        generateSubsets(arr, index + 1, current, result);
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

        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(arr, 0, new ArrayList<>(), result);

        // Printing all subsets
        System.out.println("All subsets of the given array are:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }

        scanner.close();
    }
}

/*
Approach:
1. Use recursion to generate all subsets.
2. For each element, there are two choices: include it in the subset or exclude it.
3. Recursively apply this for each element until the end of the array is reached.
4. Add the current subset to the result list when the base case is met.

Time Complexity: O(2^n) - Each element has two choices (include or exclude), leading to 2^n subsets.
Space Complexity: O(n) - Due to the recursion stack.

Example Input and Output:
Input:
Enter the number of elements in the array:
3
Enter the elements of the array:
1 2 3

Output:
All subsets of the given array are:
[1, 2, 3]
[1, 2]
[1, 3]
[1]
[2, 3]
[2]
[3]
[]

Input:
Enter the number of elements in the array:
2
Enter the elements of the array:
4 5

Output:
All subsets of the given array are:
[4, 5]
[4]
[5]
[]
*/
