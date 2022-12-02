class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 1, high = arr.length - 2;

        while (low < high) {
            // finding midpoint
            int mid = (low + high) / 2;
            // determine interval
            if (arr[mid] < arr[mid + 1]) {
                // change low
                low = mid + 1;
            } else {
                // change high
                high = mid;
            }

        }
        // at this point, low == high
        return low;
    }
}
/*
 * 1. Linear search : check index after to find peak, O(n)
 * 
 * 2. Binary search : O(log n)
 * 
 * 
 * 
 * 
 */