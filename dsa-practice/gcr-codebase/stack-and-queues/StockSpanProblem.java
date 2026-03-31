

import java.util.Stack;

public class StockSpanProblem {

    // This method is used to calculate the span (number of consecutive days the price was less than or equal to the current day's price).
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;                              // Stores the length of prices array
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Remove all previous days
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // Calculate span
            span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());

            // Push current day's index to stack
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateSpan(prices);

        System.out.println("Prices:");
        for (int price : prices) System.out.print(price + " ");
        System.out.println("\nSpan:");
        for (int s : span) System.out.print(s + " ");
    }
}
