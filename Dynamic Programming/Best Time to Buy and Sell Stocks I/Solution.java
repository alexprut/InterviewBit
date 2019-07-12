public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int maxProfit(final List<Integer> A) {
		int[] dp = new int[A.size()];
		int max = -1;
		for (int i = A.size() - 1; i >= 0; i--) {
			dp[i] = max;
			max = Math.max(max, A.get(i));
		}
		max = 0;
		for (int i = 0; i < A.size() - 1; i++) {
			max = Math.max(0, dp[i] - A.get(i));
		}

		return max;
	}
}
