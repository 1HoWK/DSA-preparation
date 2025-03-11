class Solution {
    public  int solution(int N) {
		// Implement your solution here
		String binaryInteger = Integer.toBinaryString(N); // O(log N)
		int maximumGap = 0; 
		int currentGap = 0;
		boolean counting = false;
			//1001
		for (int i = 0; i < binaryInteger.length(); i++) { // log N
			if (binaryInteger.charAt(i) == '1') {
				if (counting) {
					// Means we reach the end of position
					// If we were counting, update the maximum gap if needed
					maximumGap = Math.max(maximumGap, currentGap);
					currentGap = 0;
				} else {
					// Start counting
					counting = true;
				}
			} else if (binaryInteger.charAt(i) == '0' && counting) {
				// Increment current gap if we are counting
				currentGap++;
			}
		}
		return maximumGap;
	}
}