package codility;

public class tapeEquilibrium {
	public int solution(int[] A) {
		int totalAmount = 0;
		int totalOnLeft = 0;
		int minimumDifference = Integer.MAX_VALUE;
		for (int i = 0; i < A.length; i++) {
			totalAmount += A[i];
		}
		// 5
		for (int i = 0; i < A.length; i++) {
			totalOnLeft += A[i];
			totalAmount -= A[i];
			if (Math.abs(totalOnLeft - totalAmount) < minimumDifference) {
				minimumDifference = Math.abs(totalOnLeft - totalAmount);
			}
		}
		return minimumDifference;

	}

	public static void main(String[] args) {
		System.out.println(new tapeEquilibrium().solution(new int[] { 3, 1, 2, 4, 3 }));
	}

}
