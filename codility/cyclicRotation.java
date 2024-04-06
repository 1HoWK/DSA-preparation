package codility;

public class cyclicRotation {
	public int[] solution(int[] A, int K) {
	    int [] B = new int[A.length];
	   
	    for(int i=0; i<A.length; i++) {
	      //rotated index needs to "wrap" around end of array
	      int newIndexPosition = (i + K) % A.length; //make sure it's within the range of the array

	      B[newIndexPosition] = A[i];
	    }
	    return B;
	  }
	public static void main(String[] args) {
		int formula =  (0 + 3) % 5;
		System.out.println(formula);
	}
}
