package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Random;

public class MethodExecutionTiming {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // Creating the Searching class object
        Searching searching = new Searching();
        // Creating the class object
        Class<?> cls = searching.getClass();

        // Calculating the method execution timing of Linear Search
        Method linearSearch = cls.getDeclaredMethod("linearSearch");
        linearSearch.setAccessible(true);
        long beforeLinearSearch = System.nanoTime();
        Boolean ls = (Boolean) linearSearch.invoke(searching);
        long afterLinearSearch = System.nanoTime();
        System.out.println("Time Taken by Linear Search is : "+((afterLinearSearch-beforeLinearSearch)/1e6)+"ms");

        // Calculating the method execution timing of Binary Search
        Method binarySearch = cls.getDeclaredMethod("binarySearch");
        binarySearch.setAccessible(true);
        long beforeBinarySearch = System.nanoTime();
        Boolean bs = (Boolean) binarySearch.invoke(searching);
        long afterBinarySearch = System.nanoTime();
        System.out.println("Time Taken by Binary Search is : "+((afterBinarySearch-beforeBinarySearch)/1e6)+"ms");
    }
}


class Searching {
    int[] array = new int[10000];                   // Array of 10000 elements
    int target;                                     //  Stores the value that is gonna to find by Linear Search and Binary Search

    // Constructor of Searching class
    public Searching() {
        this.generateArray();
        this.target = array[this.targetIndexGenerator()];
        Arrays.sort(this.array);
    }

    // This method is used to fill the array with random values from 1 to 500
    private void generateArray() {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            this.array[i] = random.nextInt(500) + 1;
        }
    }

    // This method is used to generate the target index
    private int targetIndexGenerator() {
        Random random = new Random();
        return random.nextInt(10000);
    }

    // This Method is used to Search the target element by using the linear search
    private boolean linearSearch() {
        for (int i = 0; i < 10000; i++) {
            if (this.array[i] == this.target) {
                return true;
            }
        }
        return false;
    }

    // This Method is used to Search the target element by using the binary search
    private boolean binarySearch() {
        int left = 0;
        int right = this.array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (this.array[mid] == this.target) {
                return true;
            } else if (this.array[mid] > this.target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}