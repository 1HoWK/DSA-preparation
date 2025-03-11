package codility;

import java.util.HashSet;

public class permMissingElem {
	HashSet<Integer> hashset = new HashSet<Integer>();

	public int solution(int[] A) {

		for (int i = 1; i <= A.length + 1; i++) {
			hashset.add(i);
		}
		// 1,2,3,4

		for (int i = 0; i < A.length; i++) {
			hashset.remove((Integer)A[i]);
		}
		return hashset.iterator().next();
	}
}

// [ 2,3,1,5 ]
