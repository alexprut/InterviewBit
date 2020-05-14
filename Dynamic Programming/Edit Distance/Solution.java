public class Solution {
	public int minDistance(String A, String B) {
		int[][] c = new int[A.length()][B.length()];
		for (int i = 0; i < A.length(); i++) {
			for (int j = 0; j < B.length(); j++) {
				c[i][j] = Integer.MAX_VALUE;
			}
		}
		return ed(A, B, 0, 0, c);
	}

	public int ed(String a, String b, int i, int j, int[][] c) {
		int al = a.length(); int bl = b.length();
		if (al == 0 && bl == 0) { return 0; }
		if (i >= al) { return bl - j; }
		if (j >= bl) { return al - i; }
		if (c[i][j] != Integer.MAX_VALUE) { return c[i][j]; }
		if (a.charAt(i) == b.charAt(j)) { return ed(a, b, i + 1, j + 1, c); }
		int res = Math.min(
				1 + ed(a, b, i, j + 1, c), // add
				1+ ed(a, b, i + 1, j, c) // remove
		);
		res = Math.min(
				res,
				1 + ed(a, b, i + 1, j + 1, c) // subst
		);
		c[i][j] = res;
		return res;
	}
}
