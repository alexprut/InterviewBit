public class Solution {
	public int solve(String A) {
		int counter = 0;
		A = A.toLowerCase();
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt() == ) {
				counter += A.length() - i;
				counter %= 10003;
			}
		}
		return counter;
	}
}
