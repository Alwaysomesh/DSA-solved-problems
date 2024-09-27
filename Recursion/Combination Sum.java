// Combination Sum

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Que13 {
    // Method to find all combinations that sum up to the target
    static void findCombinations(int[] arr, int target, List<List<Integer>> result, List<Integer> current, int index) {
        // If the target is met, add the current combination to the result list
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        // Iterate through the array to find valid combinations
        while (index < arr.length && target - arr[index] >= 0) {
            current.add(arr[index]); // Add the current element to the combination
            findCombinations(arr, target - arr[index], result, current, index); // Recur with the updated target
            index++; // Move to the next element
            current.remove(current.size() - 1); // Backtrack to explore other combinations
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array input from the user
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Taking target input from the user
        System.out.println("Enter the target sum:");
        int target = scanner.nextInt();

        List<List<Integer>> result = new ArrayList<>();
        findCombinations(arr, target, result, new ArrayList<>(), 0);

        // Printing the result
        System.out.println("Combinations that sum up to " + target + ": " + result);
    }
}

/*
Approach:
1. Use a recursive method to explore all possible combinations of elements that sum up to the target.
2. If the target is met, add the current combination to the result list.
3. Use backtracking to explore other combinations by removing the last added element and moving to the next element.

Time Complexity: O(2^n)
- In the worst case, we explore all subsets of the array.

Space Complexity: O(n)
- The space complexity is determined by the depth of the recursion stack, which can go up to the length of the array.

Sample Input and Output:
Input:
Enter the number of elements in the array:
4
Enter the elements of the array:
2 4 6 8
Enter the target sum:
8

Output:
Combinations that sum up to 8: [[2, 2, 2, 2], [2, 2, 4], [2, 6], [4, 4], [8]]

Input:
Enter the number of elements in the array:
3
Enter the elements of the array:
1 2 3
Enter the target sum:
4

Output:
Combinations that sum up to 4: [[1, 1, 1, 1], [1, 1, 2], [1, 3], [2, 2]]
*/

