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

    // This Method performs Selection Sort algorithm
    public static void selectionSort(int[] arr) {

        for(int i = 0; i < arr.length-1 ; i++){
            int minIndex = i;

            // Finding the minimum value in unsorted part of array
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            // Swapping the values of minIndex and i
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int score : arr) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
}
