public class Solution {
	public int anytwo(String A) {
		int[][] dp = new int[A.length() + 1][A.length() + 1];
		for (int i = 1; i <= A.length(); i++) {
			for (int j = 1; j <= A.length(); j++) {
				if (A.charAt(i - 1) == A.charAt(j - 1) && i != j) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		return dp[dp.length - 1][dp[0].length - 1] > 1 ? 1: 0;
	}
}

