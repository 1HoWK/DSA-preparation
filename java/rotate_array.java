class Solution {
    public void rotate(int[] nums, int k) {

        // copy the original array
        int[] clone = nums.clone();

        // mod k to remove unnecesary steps
        k = k % nums.length;

        // mutate everything before k
        for (int i = 0; i < k; i++) {
            nums[i] = clone[nums.length - k + i];
        }
        // mutate evrything from k onwards
        for (int i = k; i < nums.length; i++) {
            nums[i] = clone[i - k];
        }
    }
}