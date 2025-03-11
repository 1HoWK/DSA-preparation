// LeetCode 217. Contains Duplicate

import java.util.*;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // A HashSet is a collection of items where every item is unique, and it is found in the java.util package:
        HashSet<Integer> hashSet = new HashSet<>();
        
        // foreach loop
        for (int num : nums) {
            if (hashSet.contains(num)) {
                return true;
            }
            hashSet.add(num);
        }
        return false;
    }
}
// Time complexity: O(n)