// Sum of digits

import java.util.Scanner;

public class Que3 {
    // Recursive function to calculate the sum of digits of a number
    public static int SD(int num) {
        // Base case: if the number is 0, return 0
        if (num == 0) {
            return 0;
        } else {
            // Recursive case: add the last digit to the sum of digits of the remaining number
            return (num % 10) + SD(num / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); // Taking input from the user
        int result = SD(num); // Calculating the sum of digits
        System.out.println("The sum of digits is: " + result); // Displaying the result
    }
}

/*
Approach:
1. The function SD(int num) is a recursive function that calculates the sum of digits of the given number.
2. If the number is 0, the function returns 0 (base case).
3. Otherwise, it adds the last digit of the number (num % 10) to the sum of digits of the remaining number (num / 10).
4. This process continues until the number becomes 0.

Time Complexity:
- The time complexity of this recursive function is O(n), where n is the number of digits in the input number.
- This is because the function makes a recursive call for each digit of the number.

Space Complexity:
- The space complexity is O(n) due to the recursion stack, where n is the number of digits in the input number.

Example Input and Output:
Input: 1234
Output: The sum of digits is: 10

Input: 56789
Output: The sum of digits is: 35
*/
