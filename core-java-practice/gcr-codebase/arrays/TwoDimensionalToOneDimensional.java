// This program takes input of Two Dimensional Array and converts that array to One Dimensional Array.
import java.util.Scanner;

public class TwoDimensionalToOneDimensional {
    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner scanner = new Scanner(System.in);

        // Talking Input for 2D array dimensions
        System.out.print("Enter number of rows : ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns : ");
        int cols = scanner.nextInt();

        // Create and fill 2D array by taking input from user
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Converting 2D array to 1D array
        int[] array = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Printing 1D array
        System.out.print("One Dimensional Array : ");
        for (int num : array) {
            System.out.print(num + " ");
        }

    }
}
