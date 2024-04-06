package codility;

public class test1 {
	public String solution(int[] A) {
		// Implement your solution here
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < A.length; i++) {
			if (A[i] < 0) {
				stringBuilder.append('<');
			} else if (A[i] > 0) {
				stringBuilder.append('>');
			} else {
				stringBuilder.append('=');
			}
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		System.out.println(new test1().solution(new int[] { 1, 2, 0, -3 }));
		System.out.println(new test1().solution(new int[] { -2333, -3, 2000, 0 }));

	}
}
