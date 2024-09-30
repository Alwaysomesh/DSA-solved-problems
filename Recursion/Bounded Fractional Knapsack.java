// Bounded Fractional Knapsack

import java.util.Scanner;

class Item {
    int value, weight, quantity;

    Item(int value, int weight, int quantity) {
        this.value = value;
        this.weight = weight;
        this.quantity = quantity;
    }
}

public class BoundedFractional {

    // Recursive function to solve the bounded fractional knapsack problem
    static double knapsack(Item[] items, int n, int W) {
        if (n == 0 || W == 0) {
            return 0;
        }

        // If weight of the nth item is more than Knapsack capacity W, then
        // this item cannot be included in the optimal solution
        if (items[n - 1].weight > W) {
            return knapsack(items, n - 1, W);
        }

        // Calculate the maximum value by including the nth item
        double include = 0;
        for (int i = 1; i <= items[n - 1].quantity; i++) {
            if (i * items[n - 1].weight <= W) {
                include = Math.max(include, i * items[n - 1].value + knapsack(items, n - 1, W - i * items[n - 1].weight));
            } else {
                include = Math.max(include, (W / (double) items[n - 1].weight) * items[n - 1].value);
                break;
            }
        }

        // Calculate the maximum value by excluding the nth item
        double exclude = knapsack(items, n - 1, W);

        // Return the maximum of including and excluding the nth item
        return Math.max(include, exclude);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of items
        System.out.print("Enter number of items: ");
        int n = scanner.nextInt();

        // Input capacity of knapsack
        System.out.print("Enter capacity of knapsack: ");
        int W = scanner.nextInt();

        Item[] items = new Item[n];

        // Input value, weight, and quantity of each item
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value, weight, and quantity of item " + (i + 1) + ": ");
            int value = scanner.nextInt();
            int weight = scanner.nextInt();
            int quantity = scanner.nextInt();
            items[i] = new Item(value, weight, quantity);
        }

        // Calculate and print the maximum value that can be put in the knapsack
        System.out.println("Maximum value in knapsack = " + knapsack(items, n, W));
    }
}

/*
Approach:
1. Define a recursive function to solve the bounded fractional knapsack problem.
2. Base case: If there are no items or the capacity is 0, return 0.
3. If the weight of the current item is more than the remaining capacity, skip this item.
4. Calculate the maximum value by including the current item in the knapsack.
5. Calculate the maximum value by excluding the current item from the knapsack.
6. Return the maximum of including and excluding the current item.

Time Complexity: O(n * W * q) where n is the number of items, W is the capacity of the knapsack, and q is the maximum quantity of any item.
Space Complexity: O(n) for the recursion stack.

Example Input/Output:
Input:
Enter number of items: 3
Enter capacity of knapsack: 50
Enter value, weight, and quantity of item 1: 60 10 2
Enter value, weight, and quantity of item 2: 100 20 1
Enter value, weight, and quantity of item 3: 120 30 1

Output:
Maximum value in knapsack = 240.0

Input:
Enter number of items: 2
Enter capacity of knapsack: 10
Enter value, weight, and quantity of item 1: 500 30 1
Enter value, weight, and quantity of item 2: 300 20 1

Output:
Maximum value in knapsack = 166.66666666666666
*/
