public class FibonacciTiming {

    // Fibonacci Series using Recursive Method : O(2^N)
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Fibonacci Series using recursive method
    public static int fibonacciIterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    // Main Method
    public static void main(String[] args) {
        int[] datasetSizes = {10, 30, 50};
        for (int size : datasetSizes) {

            // Time taken by fibonacci iterative method
            long start = System.nanoTime();
            fibonacciIterative(size);
            long iterativeTime = System.nanoTime() - start;

            // Time taken by fibonacci recursive method
            start = System.nanoTime();
            fibonacciRecursive(size);
            long recursiveTime = System.nanoTime() - start;


            System.out.printf("Dataset Size: %,d\n", size);
            System.out.printf("Fibonacci by Iterative way Time : %.4f ms\n", iterativeTime / 1e6);
            System.out.printf("Fibonacci by Recursive way Time : %.4f ms\n", recursiveTime / 1e6);
        }
    }
}
