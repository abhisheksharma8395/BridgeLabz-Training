public class BubbleSort {

    //This method sorts an array using Bubble Sort algorithm.
    public static void bubbleSort(int[] marks) {
        int length = marks.length;                          // Stores the length of array marks

        // Iterating the
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

    //main method to run the Bubble Sort program.
    public static void main(String[] args) {
        // Sample array of student marks
        int[] studentMarks = {85, 67, 90, 55, 76, 95, 62};

        System.out.println("Original Marks:");
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }

        // Calling bubble sort method to sort the student Marks array
        bubbleSort(studentMarks);

        System.out.println("\n\nSorted Marks (Ascending Order):");
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }
    }
}
