package codility;

public class frogJmp {
	public int solution(int X, int Y, int D) {
		// Implement your solution here
		int distanceToJump = Y - X;
		int minimalJumpsRequired = distanceToJump / D;
		if (distanceToJump % D != 0) {
			minimalJumpsRequired++;
		}
		return minimalJumpsRequired;
	}
}
