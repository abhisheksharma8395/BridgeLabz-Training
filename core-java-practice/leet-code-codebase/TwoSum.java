// Leetcode Problem No - 01 (Two Sum)

import java.util.*;
public class TwoSum{

   //twoSum method taking two parameters nums array and a target element that is being searched into array
   public static int[] twoSum(int[] nums, int target) {
       //Taking a HashMap key value data structure 
       HashMap<Integer,Integer> map = new HashMap<>();
       int[] ans = new int[2];        // in this ans Array we store the index of both element whose sum equals to target
       ans[0] = -1;
       ans[1] = -1;
       for(int i = 0;i<nums.length;i++){
           if(map.containsKey(target-nums[i])){ // Checking if map containing the value target - current element
              ans[0] = i;              // putting the index in ans array
              ans[1] = map.get(target-nums[i]);
              break;
           }
           map.put(nums[i],i);
       }
       return ans;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in array : ");
        int numElements = sc.nextInt();
        int[] arr = new int[numElements];
        for(int i = 0;i<numElements;i++){
            System.out.println("Enter the "+(i+1)+"th element you want in array : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(" ");
        System.out.println("Enter the target element ");
        int target = sc.nextInt();
        int[] ans = twoSum(arr,target);
        if (ans[0]!=-1){
            System.out.println("The elements at index "+ans[0]+" of and "+ans[1]+" of arr which are "+ arr[ans[0]]+" "+arr[ans[1]]+" is the pair which makes the target element "+target);
        }
        else{
            System.out.println("Not Found the pair");
        }
    }
}
