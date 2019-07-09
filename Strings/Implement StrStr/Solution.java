public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int strStr(final String A, final String B) {
		if (B.length() == 0 || B.length() > A.length()) {
			return -1;
		}
		if (A.length() == B.length()) {
			return (A.equals(B)) ? 0 : -1;
		}
		for (int i = 0; i < A.length() - B.length(); i++) {
			for (int j = 0; j < B.length(); j++) {
				if (B.charAt(j) != A.charAt(j + i)) {
					break;
				}
				if (B.length() - 1 == j) {
					return i;
				}
			}

		}
		return -1;
	}
}
