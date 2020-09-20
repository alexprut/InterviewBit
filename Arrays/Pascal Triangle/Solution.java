public class Solution {
	public ArrayList<ArrayList<Integer>> solve(int n) {
		if (n <= 0) { return new ArrayList<ArrayList<Integer>>(); }
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n; i++) { res.add(new ArrayList<Integer>()); }
		res.get(0).add(1);
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					res.get(i).add(1);
				} else {
					res.get(i).add(
							res.get(i - 1).get(j) + res.get(i - 1).get(j)
					);
				}
			}
		}

		return res;
	}
}
