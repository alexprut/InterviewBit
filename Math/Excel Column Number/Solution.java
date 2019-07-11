public class Solution {
	public int titleToNumber(String A) {
		int mult = 1;
		int counter = 0;
		for (int i = A.length() - 1; i >= 0; i--) {
			counter += ((int) (A.charAt(i) - 64)) * mult;
			mult += 26;
		}

		return counter;
	}
}
