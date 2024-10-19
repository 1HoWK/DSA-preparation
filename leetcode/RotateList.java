public class RotateList {
    public void moveZeroes(int[] nums) {
        // two pointers
        // store the value of the first index
        int first = 0;

        // i will iterate to compare with the first
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[first] = temp;
                first += 1;
            }
        }
    }

    // 0 1 0 3 12

    // f = 0
    // i = 0

    // f = 0
    // i = 1

    // 1 0 0 3 12

    // f = 1
    // i = 2

    // f = 1
    // i = 3

}