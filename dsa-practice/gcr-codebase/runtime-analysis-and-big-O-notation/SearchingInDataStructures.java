// This method compares the time taken by Searching a target in array , HashSet and TreeSet

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class SearchingInDataStructures {

    // Linear Search: O(N)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
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
            int target = data[new Random().nextInt(size)]; // Pick a random existing target

            // Creating the object of HashSet class
            HashSet<Integer> set = new HashSet<>();

            // Filling HashSet
            for (int i = 0; i < size; i++) {
                set.add(data[i]);
            }

            // Creating the object of TreeSet class
            TreeSet<Integer> treeSet = new TreeSet<>();

            // Filling TreeSet
            for (int i = 0; i < size; i++) {
                treeSet.add(data[i]);
            }



            // Searching in Array by using Linear Search Algorithm Timing
            long start = System.nanoTime();
            linearSearch(data, target);
            long linearTime = System.nanoTime() - start;

            // Searching in HashSet Timing
            start = System.nanoTime();
            set.contains(target);
            long hashSetTime = System.nanoTime() - start;

            // Searching in TreeSet Timing
            start = System.nanoTime();
            treeSet.contains(target);
            long treeSetTime = System.nanoTime() - start;


            System.out.printf("Dataset Size: %,d\n", size);
            System.out.printf("Linear Search Time in Array : %.4f ms\n", linearTime / 1e6);
            System.out.printf("Search in HashSet Time : %.4f ms\n", hashSetTime / 1e6);
            System.out.printf("Search in TreeSet Time : %.4f ms\n\n", treeSetTime / 1e6);
        }
    }
}
