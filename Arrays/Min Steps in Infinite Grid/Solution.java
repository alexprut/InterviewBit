public class Solution {
	public int coverPoints(int[] A, int[] B) {
		int counter = 0;
		for (int i = 1; i < A.length; i++) {
			counter += Math.max(
					Math.abs(A[i - 1] - A[i]),
					Math.abs(B[i - 1] - B[i])
			);
		}
		return counter;
	}
}
