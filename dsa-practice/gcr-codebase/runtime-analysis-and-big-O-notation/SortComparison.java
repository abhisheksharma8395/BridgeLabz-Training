// This method compares the time taken by Bubble Sort (O(N^2)) , Merge Sort (O(NlogN)) and Quick Sort (O(NlogN)) on different array sizes

import java.util.Arrays;
import java.util.Random;

public class SortComparison {

    // Bubble Sort Algorithm : O(N^2)
    public static void bubbleSort(int[] marks) {
        int length = marks.length;                          // Stores the length of array marks

        for (int i = 0; i < length-1 ; i++) {
            boolean flag = false;                            // To make Bubble sort more efficient
            for (int j = 0; j < length-i-1 ; j++) {

                // Comparing the two consecutive elements in array
                if(marks[j] > marks[j+1]) {
                    // Swapping elements of array
                    int temp = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = temp;
                    flag = true;
                }
            }

            if(!flag){                                   // If there is no swapping during the iteration
                break;                                 // That means array is already sorted
            }
        }
    }

    // Merge Sort Algorithm : O(N log N)
    // Recursive method to divide and sort the array
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the mid-index of subarray
            int mid = (left + right) / 2;

            // Sort the left half
            mergeSort(arr, left, mid);

            // Sort the right half
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted subarrays divided by mergeSort method
    public static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of the two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temp arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightArr[j] = arr[mid + 1 + j];

        // Merge the temp arrays back into original array
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        // Copy remaining elements of leftArr if any
        while (i < n1)
            arr[k++] = leftArr[i++];

        // Copy remaining elements of rightArr if any
        while (j < n2)
            arr[k++] = rightArr[j++];
    }

    // Quick Sort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition the array using last element as pivot
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choose last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // If current element is less than pivot
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at the correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Generate random array of size N
    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size * 10); // Ensures wide range
        }
        return arr;
    }

    // Main Method
    public static void main(String[] args) {
        int[] datasetSizes = {1000, 10000, 1000000};
        for (int size : datasetSizes) {
            int[] data = generateRandomArray(size);

            // Bubble Sort Timing
            long start = System.nanoTime();
            bubbleSort(data);
            long bubbleTime = System.nanoTime() - start;        // How much time Bubble Sort (O(N^2)) takes to execute for different size arrays

            // Merge Sort Timing
            start = System.nanoTime();
            mergeSort(data,0,size-1);                       // How much time Merge Sort (O(NlogN)) takes to execute for different size array
            long mergeTime = System.nanoTime() - start;

            // Quick Sort Timing
            start = System.nanoTime();
            quickSort(data,0,size-1);                       // How much time Quick Sort (O(NlogN)) takes to execute for different size array
            long quickTime = System.nanoTime() - start;

            System.out.printf("Dataset Size: %,d\n", size);
            System.out.printf("Bubble Sort Time: %.4f ms\n", bubbleTime / 1e6);
            System.out.printf("Merge Sort Time: %.4f ms\n\n", mergeTime / 1e6);
            System.out.printf("Quick Sort Time: %.4f ms\n\n", quickTime / 1e6);
        }
    }
}
