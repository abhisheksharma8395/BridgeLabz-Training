import java.util.Scanner;

public class FirstOccurrenceOptimise {

    // This method is searching first occurrence of target element and return its object using the recursive binary search method
    public static int binarySearchRecursively(int[] array, int target,int first,int last,int firstOccurence) {
        if (first>last) {
            return firstOccurence;
        }
        int mid = first + (last-first)/2;
        if (array[mid] == target) {
            return binarySearchRecursively(array,target,first,mid-1,mid);
        } else if (array[mid]>target) {
            return binarySearchRecursively(array,target,first,mid-1,firstOccurence);
        }
        return binarySearchRecursively(array, target, mid+1,last,firstOccurence);
    }
    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();                     // Stores the number of elements in the array
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element "+(i+1)+"of the array : ");
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the target element you want to search : ");
        int target = sc.nextInt();
        // Displaying the result
        System.out.println(binarySearchRecursively(array, target, 0,array.length-1,-1));
    }
}
