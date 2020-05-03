public class Solution {
	int[] inc;
	int[] dec;
	public int longestSubsequenceLength(final List<Integer> A) {
		longestIncreasingSubsequence(A);
		longestDecreasingSubsequence(A);
		int m = 0;
		for (int i = 0; i < A.size(); i++) {
			m = Math.max(m, inc[i] + dec[i] - 1);
		}
		return m;
	}

	public void longestIncreasingSubsequence(List<Integer> arr) {
		inc = new int[arr.size()];
		int maxLength = 0;
		for (int i = 0; i < arr.size(); i++) {
			inc[i] = 1;
			for (int j = i; j >= 0; j--) {
				if (inc[j] + 1 > inc[i] && arr.get(j) < arr.get(i)) {
					inc[i] = inc[j] + 1;
				}
				if (inc[i] > maxLength) {
					maxLength = inc[i];
				}
			}
		}
	}

	public void longestDecreasingSubsequence(List<Integer> arr) {
		dec = new int[arr.size()];
		int maxLength = 0;
		for (int i = arr.size() - 1; i >= 0; i--) {
			dec[i] = 1;
			for (int j = i; j < arr.size(); j++) {
				if (dec[j] + 1 > dec[i] && arr.get(i) > arr.get(j)) {
					dec[i] = dec[j] + 1;
				}
				if (dec[i] > maxLength) {
					maxLength = dec[i];
				}
			}
		}
	}
}
