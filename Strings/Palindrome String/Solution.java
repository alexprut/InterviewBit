public class Solution {
	public int isPalindrome(String A) {
		// 48 - 57 97 - 122
		A = A.toLowerCase();
		StringBuilder tmp = new StringBuilder();
		for (int i = 0; i < A.length(); i++) {
			if ((A.charAt(i) >= 48 && A.charAt(i) <= 57) || (A.charAt(i) >= 97 && A.charAt(i) <= 122)) {
				tmp.append(A.charAt(i));
			}
		}
		A = tmp.toString();
		for (int i = 0; i < A.length() / 2; i++) {
			if (A.charAt(i) != A.charAt(A.length() - 1 - i)) {
				return 0;
			}
		}
		return 1;
	}
}
