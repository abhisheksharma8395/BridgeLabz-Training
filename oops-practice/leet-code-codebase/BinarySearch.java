import java.util.Scanner;

public class BinarySearch {

    // This method is used to perform Binary Search by using iterative method
    // But array in the method parameter should be sorted otherwise we can't perform binary search
    public static boolean binarySearchIteratively(int[] array, int target) {
        int first = 0;                                       // Stores the first index of array
        int last = array.length-1;                           // Stores the last index of array
        while(first<=last){
           int mid = first + (last - first)/2;              // calculating the middle index of array

            // Checking the element at mid-index is equals to target element or not
           if(array[mid]==target){
               return true;
           }
           else if(array[mid]>target){
               last = mid-1;
           }
           else{
               first = mid+1;
           }
        }
        return false;
    }

    // This method is used to perform Binary Search by using recursive method
    // But array in the method parameter should be sorted otherwise we can't perform binary search
    public static boolean binarySearchRecursively(int[] array, int target,int first,int last) {
        if (first>last) {
            return false;
        }
        int mid = first + (last-first)/2;
        if (array[mid] == target) {
            return true;
        } else if (array[mid]>target) {
            return binarySearchRecursively(array,target,first,mid-1);
        }
        return binarySearchRecursively(array, target, mid+1,last);
    }

    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);
        // Storing the length of array taking from user input
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();


        int[] array = new int[n];
        System.out.println("Please Enter the Array element in sorted order : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Element "+(i+1)+" of the array : ");
            array[i] = sc.nextInt();
        }


        System.out.println("Enter the target element you want to search : ");
        int target = sc.nextInt();                          // Stores the target element which user want to search in the sorted array
        // Displaying the result by using the iterative method
        System.out.println("Result by using Iterative method :");
        System.out.println(binarySearchIteratively(array, target));
        // Displaying the result by using the recursive method
        System.out.println("Result by using Iterative method :");
        System.out.println(binarySearchRecursively(array, target, 0,array.length-1));
    }
}
