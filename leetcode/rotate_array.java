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

    // O(1) steps
    // public void rotate(int[] nums, int k) {
	// 	k = k % nums.length; // to know how many numbers to reverse
	// 	reverse(nums, 0, nums.length - 1);
	// 	reverse(nums, 0, k - 1);
	// 	reverse(nums, k, nums.length - 1);
	// }

	// public void reverse(int[] nums, int start, int end) {
	// 	while (start < end) {
	// 		int temp = nums[start];
	// 		nums[start] = nums[end];
	// 		start++;
	// 		end--;
	// 	}
	// }
}