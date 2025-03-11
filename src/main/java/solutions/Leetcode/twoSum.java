import java.util.*;

public class twoSum {

    public int[] twoSum(int[] nums, int target) {

        // O(1) constant time retrieve and insert
        // unordered
        // Allow duplicate values but not key, if key is exists it will be overwrite
        // (Key/index,Value)
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target-nums[i];
            if (hashmap.containsKey(diff)) {
                return new int[]{hashmap.get(diff),i};
            }
            hashmap.put(nums[i], i); // array value as key, array index as value 
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new twoSum().twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}