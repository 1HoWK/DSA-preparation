package codility;

import java.util.HashSet;

public class oddOccurrencesInArray {
	 HashSet<Integer> hashset = new HashSet<Integer>();
		public int solution(int[] A) {
			for (int i = 0; i < A.length; i++) {
				int a = A[i];
				if(hashset.contains(a)) {
					hashset.remove(new Integer(a));
				}else {
	                hashset.add(a);
				}
			
			}
			return hashset.iterator().next();
		}
}