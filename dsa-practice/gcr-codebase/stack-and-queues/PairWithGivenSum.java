import java.util.HashSet;

public class PairWithGivenSum {

    // This method is used to find the pair that sum equals to the target
    public static boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                return true;
            }
            set.add(num);
        }

        System.out.println("No pair found with the given sum.");
        return false;
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 6};
        int target = 10;
        // Calling method
        hasPairWithSum(arr, target);
    }
}
