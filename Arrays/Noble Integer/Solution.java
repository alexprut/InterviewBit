public class Solution {
	public int solve(int[] A) {
		Arrays.sort(A);
		for (int i = 0; i < A.length; i++) {
			if (A[i] == A.length - i - 1 && i != ) {
				return 1;
			}
		}
		return -1;
	}
}
