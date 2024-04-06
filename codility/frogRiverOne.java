package codility;

import java.util.HashSet;

public class frogRiverOne {
	
	HashSet<Integer> hashset = new HashSet<Integer>();

	public int solution(int X, int[] A) {
		
		for(int i = 1; i<=X;i++) {
			hashset.add(i);
		}
		
		for(int i=0; i< A.length;i++) {
			if(hashset.remove(A[i])) {
				if(hashset.isEmpty()) {
					return i;
				}
			}
		}
		return -1;
	}
}
