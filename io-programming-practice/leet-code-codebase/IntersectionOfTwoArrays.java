import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    // Solving LeetCode question number - 350
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i = 0;i<nums1.length;i++){
            map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
        }
        for(int i = 0;i<nums2.length;i++){
            map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums2.length;i++){
            if(!set.contains(nums2[i])){
                if(map1.containsKey(nums2[i])){
                    int min = Math.min(map1.get(nums2[i]),map2.get(nums2[i]));
                    for(int j = 0;j<min;j++){
                        list.add(nums2[i]);
                    }
                }
                set.add(nums2[i]);
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] array = intersect(new int[]{1,2,2,1},new int[]{2,2});
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}