public class Solution {
	public int lis(final List<Integer> A) {
		int[] tmp = new int[A.size()];
		for (int i = 0; i < tmp.length; i++) { tmp[i] = 1; }
		for (int i = 1; i < A.size(); i++) {
			for (int j = 0; j < i; j++) {
				if (A.get(j) < A.get(i)) {
					tmp[i] = Math.max(tmp[i], tmp[j] + 1);
				}
			}
		}
		int max = 0;
		for (int i = 0; i < tmp.length; i++) { max = Math.max(max, tmp[i]); }
		return max;
	}
}
