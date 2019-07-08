public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
		if (a.size() == 0) {
			return;
		}

		boolean[] tmpR = new boolean[a.size()];
		boolean[] tmpC = new boolean[a.get(0).size()];

		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < a.get(i).size(); j++) {
				if (a.get(i).get(j) == 0) {
					if (!tmpR[i]) {
						tmpR[i] = true;
						convR(a, i);
					}
					if (!tmpC[j]) {
						tmpC[j] = true;
						convC(a, j);
					}
					a.get(i).set(j, 2);
				}
			}
		}

		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < a.get(i).size(); j++) {
				if (a.get(i).get(j) == 2) {
					a.get(i).set(j, 0);
				}
			}
		}
	}

	public void convR(ArrayList<ArrayList<Integer>> a, int n) {
		for (int i = 0; i < a.get(n).size(); i++) {
			if (a.get(n).get(i) != 0) {
				a.get(n).set(i, 2);
			}
		}
	}

	public void convC(ArrayList<ArrayList<Integer>> a, int n) {
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).get(n) != 0) {
				a.get(i).set(n, 2);
			}
		}
	}
}
