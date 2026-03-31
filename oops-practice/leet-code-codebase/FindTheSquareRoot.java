import java.util.Scanner;

public class FindTheSquareRoot {

    // This method Finds the square root in O(N) time complexity
    public static int findTheSquareRoot(int n) {
        int j = 0;
        while (j * j <= n) {
            j++;
        }
        if((j-1)*(j-1) == n) {
            return j - 1;
        }
        return -1;                   // If square root of n is not integer either it is double then we're returning -1
    }

    // This method Finds the square root in O(logN) time complexity
    public static int findTheSquareRootBinarySearch(int n) {
        int first = 0,last = n;
        int ans = -1;
        while (first<=last) {
            int mid = first+(last-first)/2;
            if(mid*mid == n){
                return mid;
            }
            else if(mid*mid > n){
                last = mid-1;
            }
            else{
                first = mid+1;
                ans = mid;
            }
        }
        return ans;
    }

    // Main method
    public static void main(String[] args) {
        // Obejct of Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();                     // Stores the number whose square root to be found
        // Displaying the result by using method having time complexity O(N)
        System.out.println(findTheSquareRoot(n));
        // Displaying the result by using method having time complexity O(logN)
        System.out.println(findTheSquareRootBinarySearch(n));
    }
}
