import java.util.Scanner;

public class IndexOfMinimumElement {

    // This method return the minimum element index in rotated sorted array using the binary search
    public static int indexMinimumElement(int[] array,int first,int last,int ans) {
        if (first>last) {
            return ans;
        }
        int mid = first + (last-first)/2;
        if (array[mid] <= array[array.length-1]) {   // 3 4 5 1 2 is rotated array if mid is at 2 index value = 5 which is greater than 2
            return indexMinimumElement(array,first,mid-1,mid); //  than first = mid+1 now mid-comes out 3 value = 1 1<2 and updates its value to 1
        }                                                       // last = mid-1 first index = 3 last index =2 loop breaks and return
        return indexMinimumElement(array, mid+1,last,ans);
    }

    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();                             // Store the total element in array
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element "+(i+1)+" of the array : ");
            array[i] = sc.nextInt();
        }
        // Displaying the result
        System.out.println(indexMinimumElement(array, 0,array.length-1,-1));
    }
}
