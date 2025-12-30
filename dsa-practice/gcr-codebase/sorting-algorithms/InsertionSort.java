// class to test the Insertion sort program
public class InsertionSort {
    // Main method
    public static void main(String[] args) {
        // Array that stores the employeeIDs
        int[] employeeIDs = {105, 102, 110, 101, 108};

        // Printing the array before sorting
        System.out.println("Before Sorting:");
        printArray(employeeIDs);

        // Calling the method to sort the array using the insertion sort
        insertionSort(employeeIDs);

        // Printing the array after sorting
        System.out.println("After Sorting:");
        printArray(employeeIDs);
    }

    // Method to perform Insertion Sort
    public static void insertionSort(int[] arr) {

    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int id : arr) {
            System.out.print(id + " ");
        }
        System.out.println();
    }
}
