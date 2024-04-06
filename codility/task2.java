package codility;

public class test2 {
	public boolean solution(int[] A, int K) {
		int n = A.length;
		for (int i = 0; i < n - 1; i++) { // check if the array is sorted in non-decreasing order
			// if (A[i] + 1 < A[i + 1]) // wrong condition
			if (A[i] > A[i + 1]) // Check if the current element is greater than the next one
				return false;
		}
		// if (A[0] != 1 && A[n - 1] != K) // wrong condition
		if (A[0] != 1 || A[n - 1] != K) // check if it matches the sequence (1 ..... K)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		System.out.println(new test2().solution(new int[] { 1, 1, 2, 3, 3 }, 3));
		System.out.println(new test2().solution(new int[] { 1, 1, 2, 2 }, 2));
		System.out.println(new test2().solution(new int[] { 1, 1, 2, 3, 5, 6 }, 4));
	}
}
