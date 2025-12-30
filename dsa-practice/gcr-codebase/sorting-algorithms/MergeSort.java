public class MergeSort {
    public static void main(String[] args) {
        // Creating the array that contains the prices of books
        int[] bookPrices = {450, 200, 300, 150, 400};

        // Displaying the array before sorting
        System.out.println("Before Sorting:");
        printArray(bookPrices);

        // Calling the Merge sort method to sort the array by using merge sort algorithm
        mergeSort(bookPrices, 0, bookPrices.length - 1);

        // Displaying the array after Sorting
        System.out.println("After Sorting:");
        printArray(bookPrices);
    }

    // Recursive method to divide and sort the array
    public static void mergeSort(int[] arr, int left, int right) {

    }

    // Merge two sorted subarrays
    public static void merge(int[] arr, int left, int mid, int right) {

    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int price : arr) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}
