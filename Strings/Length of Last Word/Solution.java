public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int lengthOfLastWord(final String A) {
		int max = 0;
		int counter = 0;
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) == ' ') {
				max = Math.max(max, counter);
				counter = 0;
			} else {
				counter++;
			}
		}
		max = Math.max(max, counter);
		return max;
	}
}
