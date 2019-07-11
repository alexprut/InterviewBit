public class Solution {
	public int isPalindrome(int A) {
		String tmp = String.valueOf(A);
		for (int i = 0; i < tmp.length() / 2; i++) {
			if (tmp.charAt(i) != tmp.charAt(tmp.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
