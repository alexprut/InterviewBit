public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int maxProfit(final List<Integer> a) {
		if (a.size() < 2) { return 0; }
		int p = 0;
		for (int i = 1; i < a.size(); i++) {
			p += Math.max(a.get(i) - a.get(i - 1), 0);
		}
		return p;
	}
}

