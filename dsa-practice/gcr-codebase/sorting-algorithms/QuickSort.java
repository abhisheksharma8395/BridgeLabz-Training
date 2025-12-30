public class QuickSort {
    public static void main(String[] args) {
        // Creating the Array of prices
        int[] prices = {1200, 450, 800, 3000, 650};

        // Printing the Array of prices before sorting
        System.out.println("Before Sorting:");
        printArray(prices);

        // Calling the method to sort the prices array using the Quick Sort Algorithm
        quickSort(prices, 0, prices.length - 1);

        // Printing the Array of prices after sorting
        System.out.println("After Sorting:");
        printArray(prices);
    }

    // Quick Sort function
    public static void quickSort(int[] arr, int low, int high) {

    }

    // Partition the array using last element as pivot
    public static int partition(int[] arr, int low, int high) {

    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
