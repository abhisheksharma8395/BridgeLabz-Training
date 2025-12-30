public class SelectionSort {
    public static void main(String[] args) {
        // The Array scores the marks of the student
        int[] scores = {78, 92, 60, 85, 74};

        // Calling the method to print the array before sorting
        System.out.println("Before Sorting:");
        printArray(scores);

        // Calling method to sort the array using the Selection Sort Algorithm
        selectionSort(scores);

        // Calling the method to print the array after sorting
        System.out.println("After Sorting:");
        printArray(scores);
    }

    // Selection Sort algorithm
    public static void selectionSort(int[] arr) {

    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int score : arr) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
}
